/*
 * Copyright 2012 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.odftoolkit.odfdom.search;

import static org.odftoolkit.odfdom.changes.OperationConstants.*; // The names of operations /

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.odftoolkit.odfdom.changes.JsonOperationProducer;
import org.odftoolkit.odfdom.changes.MapHelper;
import org.odftoolkit.odfdom.changes.PageArea;
import org.odftoolkit.odfdom.doc.OdfDocument;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.OdfSchemaDocument;
import org.odftoolkit.odfdom.dom.OdfStylesDom;
import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.element.OdfStyleBase;
import org.odftoolkit.odfdom.dom.element.office.OfficeMasterStylesElement;
import org.odftoolkit.odfdom.dom.element.style.StyleListLevelLabelAlignmentElement;
import org.odftoolkit.odfdom.dom.element.style.StyleListLevelPropertiesElement;
import org.odftoolkit.odfdom.dom.element.style.StyleMasterPageElement;
import org.odftoolkit.odfdom.dom.element.text.TextListLevelStyleBulletElement;
import org.odftoolkit.odfdom.dom.element.text.TextListLevelStyleElementBase;
import org.odftoolkit.odfdom.dom.element.text.TextListLevelStyleImageElement;
import org.odftoolkit.odfdom.dom.element.text.TextListLevelStyleNumberElement;
import org.odftoolkit.odfdom.dom.element.text.TextListStyleElement;
import org.odftoolkit.odfdom.dom.element.text.TextParagraphElementBase;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.style.props.OdfStylePropertiesSet;
import org.odftoolkit.odfdom.dom.style.props.OdfStyleProperty;
import org.odftoolkit.odfdom.incubator.doc.office.OdfOfficeAutomaticStyles;
import org.odftoolkit.odfdom.incubator.doc.office.OdfOfficeStyles;
import org.odftoolkit.odfdom.incubator.doc.style.OdfDefaultStyle;
import org.odftoolkit.odfdom.incubator.doc.style.OdfStyle;
import org.odftoolkit.odfdom.incubator.doc.style.OdfStylePageLayout;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfPackage;
import org.odftoolkit.odfdom.type.Length;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

// changes

/**
 * ToDo: Is it more flexible to build a different queue for OperationQueue and create an JSON
 * exporter? Can a JSONArray / JSONObject be initialized with an existing queue?
 *
 * @author svante.schubertATgmail.com
 */
public class TextProducer extends JsonOperationProducer {

  private static final Logger LOG = Logger.getLogger(TextProducer.class.getName());
  static final String BLACK = "#000000";
  private static final String ODFDOM_GIT_BRANCH = System.getProperty("odftoolkit.git.branch");
  private static final String ODFDOM_GIT_COMMIT_TIME =
      System.getProperty("odftoolkit.git.commit.time");
  private static final String ODFDOM_GIT_COMMIT_DESCRIBE =
      System.getProperty("odftoolkit.git.commit.id.describe");
  private static final String ODFDOM_GIT_URL =
      System.getProperty("odftoolkit.git.remote.origin.url");

  // line widths constants
  private final JSONArray mOperationQueue = new JSONArray();
  private final JSONObject mOperations = new JSONObject();
  private final JSONObject mDocumentAttributes = new JSONObject();
  /** The maximum empty cell number before starting a new operation */
  /** Every knonwStyle does not have to be read */
  Map knownStyles = new HashMap<String, Boolean>();
  // Added an own map for list styles as it is not 100% certain that the names between styles and
  // list style might be overlapping.
  Map knownListStyles = new HashMap<String, Boolean>();
  /**
   * There is a special style for the replacement table of too large tables, which have to be added
   * only once to a document
   */
  boolean mIsTableExceededStyleAdded = false;

  /** Collecting the text for the search text file*/
  StringBuilder mSB;

  boolean isNewParagraph = false;
  boolean isNewHeader = false;

  public TextProducer(StringBuilder sb) {
    this();
    mSB = sb;
  }


  public TextProducer() {
    try {
      mDocumentAttributes.put(OPK_NAME, "noOp");
      mOperationQueue.put(mDocumentAttributes);
      mOperations.put(OPK_EDITOR, ODFDOM_GIT_URL);
      mOperations.put(OPK_VERSION, ODFDOM_GIT_COMMIT_DESCRIBE);
      mOperations.put(OPK_VERSION_BRANCH, ODFDOM_GIT_BRANCH);
      mOperations.put(OPK_VERSION_TIME, ODFDOM_GIT_COMMIT_TIME);
      mOperations.put(OPK_OPERATIONS, mOperationQueue);
    } catch (JSONException e) {
      Logger.getLogger(TextProducer.class.getName()).log(Level.SEVERE, null, e);
    }
  }

  public JSONObject getDocumentOperations() {
    return mOperations;
  }

  /** Used for repeated elements, repeats a set of operations */
  public int getCurrentOperationIndex() {
    return mOperations.length() - 1;
  }

  // -------------------------------------------------------------------------
  /**
   * @param * @param start: An array, that contains the number of that paragraph, before which the
   *     new paragraph shall be inserted. Has the last paragraph the number 2, so causes para=3,
   *     that the new paragraph will be inserted at the end. para=4 is not allowed in this case.
   */
  public void add(
      String componentType,
      final List<Integer> start,
      final Map<String, Object> formattingProperties,
      String context) {
    // ToDo: Moving styleId into para list -
    // final Map<String, Object> args,

    if(componentType.equals("Paragraph")){
      isNewParagraph = true;
    }else if(componentType.equals("Header")){
      isNewHeader = true;
    }

    final JSONObject addComponentObject = new JSONObject();

    try {
      addComponentObject.put(OPK_NAME, "add" + componentType);
      addComponentObject.put(OPK_START, incrementAll(start));
      if (context != null) {
        addComponentObject.put(OPK_CONTEXT, context);
      }
      // ToDo: Moving styleId into para list -
      //			if (args != null) {
      //				for (String arg : args.keySet()) {
      //					newOperation.put(arg, args.get(arg));
      //				}
      //			}
      if (formattingProperties != null && !formattingProperties.isEmpty()) {
        JSONObject attrs = new JSONObject();
        for (String arg : formattingProperties.keySet()) {
          attrs.put(arg, formattingProperties.get(arg));
        }
        addComponentObject.put(OPK_ATTRS, attrs);
      }
      // IN CASE STYLE BECOMES AN ATTRIBUTE
      //			if (args != null || formattingProperties != null && !formattingProperties.isEmpty()) {
      //				JSONObject attrs = new JSONObject();
      //
      //				if (args != null) {
      //					for (String arg : args.keySet()) {
      //						attrs.put(arg, args.get(arg));
      //					}
      //				}
      //				if (formattingProperties != null && !formattingProperties.isEmpty()) {
      //					for (String arg : formattingProperties.keySet()) {
      //						attrs.put(arg, formattingProperties.get(arg));
      //					}
      //					newOperation.put(OPK_ATTRS, attrs);
      //				}
      //			}

      mOperationQueue.put(addComponentObject);
      LOG.log(Level.FINEST, "add" + componentType + " - component:{0}", addComponentObject);

    } catch (JSONException e) {
      Logger.getLogger(TextProducer.class.getName()).log(Level.SEVERE, null, e);
    }
  }

  public void addAnnotation(
      final List<Integer> start, String id, String author, String date, String context) {
    final JSONObject newOperation = new JSONObject();
    try {
      newOperation.put(OPK_NAME, OP_NOTE);
      newOperation.put(OPK_START, incrementAll(start));
      newOperation.put(OPK_ID, id);
      newOperation.put("author", author);
      newOperation.put("date", date);
      if (context != null) {
        newOperation.put(OPK_CONTEXT, context);
      }
      mOperationQueue.put(newOperation);
      LOG.log(Level.FINEST, OP_NOTE + " - component:{0}", newOperation);

    } catch (JSONException e) {
      Logger.getLogger(TextProducer.class.getName()).log(Level.SEVERE, null, e);
    }
  }

  public void addRange(final List<Integer> start, String id, String context) {
    final JSONObject newOperation = new JSONObject();
    try {
      newOperation.put(OPK_NAME, OP_NOTE_SELECTION);
      newOperation.put(OPK_START, incrementAll(start));
      newOperation.put(OPK_ID, id);
      newOperation.put(OPK_TYPE, "comment");
      newOperation.put(OPK_POSITION, "end");
      if (context != null) {
        newOperation.put(OPK_CONTEXT, context);
      }
      mOperationQueue.put(newOperation);
      LOG.log(Level.FINEST, OP_NOTE_SELECTION + " - component:{0}", newOperation);

    } catch (JSONException e) {
      Logger.getLogger(TextProducer.class.getName()).log(Level.SEVERE, null, e);
    }
  }

  /**
   * @param start: An array, that contains the number of that paragraph, before which the new
   *     paragraph shall be inserted. Has the last paragraph the number 2, so causes para=3, that
   *     the new paragraph will be inserted at the end. para=4 is not allowed in this case.
   */
  public void formatColumns(
      final List<Integer> start,
      final Map<String, Object> formattingProperties,
      Integer firstColumn,
      Integer lastColumn,
      String context) {
    if (formattingProperties != null && !formattingProperties.isEmpty()) {
      final JSONObject newOperation = new JSONObject();

      try {
        newOperation.put(OPK_NAME, FORMATCOLUMNS);
        newOperation.put(OPK_SHEET, start.get(0));
        newOperation.put(OPK_START, firstColumn);
        if (context != null) {
          newOperation.put(OPK_CONTEXT, context);
        }
        if (lastColumn != null && !firstColumn.equals(lastColumn)) {
          newOperation.put(OPK_END, lastColumn);
        }
        if (formattingProperties != null && !formattingProperties.isEmpty()) {
          JSONObject attrs = new JSONObject();
          for (String arg : formattingProperties.keySet()) {
            attrs.put(arg, formattingProperties.get(arg));
          }
          newOperation.put(OPK_ATTRS, attrs);
        }
        mOperationQueue.put(newOperation);
        LOG.log(Level.FINEST, "changeColumns - component:{0}", newOperation);

      } catch (JSONException e) {
        Logger.getLogger(TextProducer.class.getName()).log(Level.SEVERE, null, e);
      }
    }
  }

  /**
   * @param start: An array, that contains the number of that paragraph, before which the new
   *     paragraph shall be inserted. Has the last paragraph the number 2, so causes para=3, that
   *     the new paragraph will be inserted at the end. para=4 is not allowed in this case.
   */
  public void formatRows(
      final List<Integer> start,
      final Map<String, Object> formattingProperties,
      Integer firstRow,
      Integer lastRow,
      Integer previousRowRepeated,
      String context) {
    if (formattingProperties != null && !formattingProperties.isEmpty()) {
      final JSONObject newOperation = new JSONObject();

      try {
        newOperation.put(OPK_NAME, "changeRows");
        newOperation.put(OPK_SHEET, start.get(0));
        newOperation.put(OPK_START, firstRow + previousRowRepeated);
        if (context != null) {
          newOperation.put(OPK_CONTEXT, context);
        }
        if (lastRow != null && !firstRow.equals(lastRow)) {
          newOperation.put(OPK_END, lastRow + previousRowRepeated);
        }
        JSONObject attrs = new JSONObject();
        for (String arg : formattingProperties.keySet()) {
          attrs.put(arg, formattingProperties.get(arg));
        }
        newOperation.put(OPK_ATTRS, attrs);

        mOperationQueue.put(newOperation);
        LOG.log(Level.FINEST, "changeRows - component:{0}", newOperation);

      } catch (JSONException e) {
        Logger.getLogger(TextProducer.class.getName()).log(Level.SEVERE, null, e);
      }
    }
  }

  private static final String NUMBER_FORMAT_CODE = "code";
  private static final String NUMBER_FORMAT_CODE_STANDARD = "Standard";

  /** Maps the ODF office:value-type attribute to the Changes API Text numberFormat property */
  private JSONObject getCellNumberFormat(String valueType) {
    JSONObject cellNumberFormat = new JSONObject();
    try {
      if (valueType == null || valueType.isEmpty()) {
        cellNumberFormat.put(NUMBER_FORMAT_CODE, NUMBER_FORMAT_CODE_STANDARD);
        //			} else if (valueType.equals("1")) {
        //			} else if (valueType.equals("i")) {
        //			} else if (valueType.equals("I")) {
        //			} else if (valueType.equals("a")) {
        //			} else if (valueType.equals("A")) {
      } else {
        cellNumberFormat.put(NUMBER_FORMAT_CODE, NUMBER_FORMAT_CODE_STANDARD);
      }
    } catch (JSONException ex) {
      Logger.getLogger(TextProducer.class.getName()).log(Level.SEVERE, null, ex);
    }
    return cellNumberFormat;
  }

  private void addRange(
      int sheet,
      Integer firstRow,
      Integer lastRow,
      int repeatedRowOffset,
      int firstContentCell,
      int horizontalRepetition,
      JSONObject repeatedCell,
      JSONArray singleRow,
      boolean hasHorizontalRepetition) {

    // the row start/end number 0 based, therefore - 1
    int rowStartNo = firstRow + repeatedRowOffset;
    List rangeStart = new LinkedList<Integer>();

    // if there is a repeated row, there will be repeated cells (at least vertical)
    if (hasHorizontalRepetition || lastRow != null && !firstRow.equals(lastRow)) {
      // first the start column position
      rangeStart.add(firstContentCell);
      // second the start row position
      rangeStart.add(rowStartNo);

      List rangeEnd = new LinkedList<Integer>();

      // first the end column position: StartPos of content plus any repetiton (including itself,
      // therefore - 1)
      rangeEnd.add(firstContentCell + horizontalRepetition - 1);
      // second the end row position
      int rowEndNo = lastRow + repeatedRowOffset;
      rangeEnd.add(rowEndNo);

      // create a operation for the given cell range with similar content
      fillCellRange(sheet, rangeStart, rangeEnd, repeatedCell);
    } else {
      // first the start column position
      rangeStart.add(firstContentCell);
      // second the start row position
      rangeStart.add(rowStartNo);

      setCellContents(sheet, rangeStart, singleRow);
    }
  }

  /**
   * Writes a range of the spreadsheet with various values. Will be called only indirectly after a
   * spreadsheet row has checked for optimization.
   *
   * @param sheet Integer The zero-based index of the sheet containing the cell range.
   * @param rangeStart Integer The starting position: where next row number is being written
   * @param spreadsheetRange Object[][] The values and attribute sets to be written into the cell
   *     range. The outer array contains rows of cell contents, and the inner row arrays contain the
   *     cell contents for each single row. The lengths of the inner arrays may be different. Cells
   *     not covered by a row array will not be modified.
   */
  private void setCellContents(Integer sheet, List rangeStart, JSONArray spreadsheetRange) {
    final JSONObject newOperation = new JSONObject();

    try {
      newOperation.put(OPK_NAME, "setCellContents");
      newOperation.put(OPK_SHEET, sheet);
      newOperation.put(OPK_START, rangeStart);
      // Although we only deliver a single row, the range have to be two-dimensional
      newOperation.put("contents", new JSONArray().put(spreadsheetRange));
      mOperationQueue.put(newOperation);
      LOG.log(Level.FINEST, "setCellContents - component:{0}", newOperation);
    } catch (JSONException e) {
      Logger.getLogger(TextProducer.class.getName()).log(Level.SEVERE, null, e);
    }
  }

  /** */
  public void mergeCells(List<Integer> position, int columns, int rows) {
    final JSONObject newOperation = new JSONObject();
    LinkedList<Integer> rangeStart = new LinkedList<Integer>();
    rangeStart.add(position.get(2));
    rangeStart.add(position.get(1));
    LinkedList<Integer> rangeEnd = new LinkedList<Integer>();
    rangeEnd.add(position.get(2) + columns - 1);
    rangeEnd.add(position.get(1) + rows - 1);
    try {
      newOperation.put(OPK_NAME, "mergeCells");
      newOperation.put(OPK_SHEET, position.get(0));
      newOperation.put(OPK_START, rangeStart);
      newOperation.put(OPK_END, rangeEnd);
      newOperation.put(OPK_TYPE, "merge");
      mOperationQueue.put(newOperation);
      LOG.log(Level.FINEST, "mergeCells - component:{0}", newOperation);
    } catch (JSONException e) {
      Logger.getLogger(TextProducer.class.getName()).log(Level.SEVERE, null, e);
    }
  }

  /**
   * Writes a range of the spreadsheet with various identical/repeating values and attributes
   *
   * <p>Will be called only indirectly after a spreadsheet row has checked for optimization.
   *
   * @param sheet Integer The zero-based index of the sheet containing the cell range.
   * @param start Integer[2] The logical cell position of the upper-left cell in the range.
   * @param end Integer[2] (optional) The logical cell position of the bottom-right cell in the
   *     range. If omitted, the operation addresses a single cell.
   * @param cell (optional) The value used to fill the specified cell range. The value null will
   *     clear the cell range. If omitted, the current values will not change (e.g., to change the
   *     formatting only), except for shared formulas referred by the shared attribute of this
   *     operation. If the parse property is set in the operation, the value must be a string.
   */
  private void fillCellRange(
      int sheet, final List<Integer> start, final List<Integer> end, JSONObject cell) {
    final JSONObject newOperation = new JSONObject();

    try {
      if (cell != null && cell.length() != 0) {
        newOperation.put(OPK_NAME, "fillCellRange");
        newOperation.put(OPK_SHEET, sheet);
        newOperation.put(OPK_START, incrementAll(start));
        if (end != null) {
          newOperation.put(OPK_END, incrementAll(end));
        }
        if (cell.has("value")) {
          newOperation.put("value", cell.get("value"));
        }
        if (cell.has(OPK_ATTRS)) {
          newOperation.put(OPK_ATTRS, cell.get(OPK_ATTRS));
        }
        mOperationQueue.put(newOperation);
        LOG.log(Level.FINEST, "fillCellRange - component:{0}", newOperation);
      }
    } catch (JSONException e) {
      Logger.getLogger(TextProducer.class.getName()).log(Level.SEVERE, null, e);
    }
  }

  // -------------------------------------------------------------------------
  /**
   * @param text: text to be inserted into the specified paragraph at the specified position
   * @param start: an array that contains the position, where the new text shall be inserted.
   */
  public void addText(final List<Integer> start, final String text, final String context) {
      super.addText(start, text, context);


    if(isNewParagraph || isNewHeader){
      mSB.append("\n\n").append(text);
      isNewHeader = false;
      isNewParagraph = false;
    }else{
      mSB.append(text);
    }
  }

  // -------------------------------------------------------------------------
  void format(final List<Integer> start, Map<String, Object> attrs, String context) {
    TextProducer.this.format(start, null, attrs, context);
  }

  // -------------------------------------------------------------------------
  public void format(
      final List<Integer> start,
      final List<Integer> end,
      Map<String, Object> attrs,
      String context) {
    if (attrs != null && attrs.size() > 0) {
      // Not the next position, but the last character to be marked will be referenced
      final JSONObject newOp = new JSONObject();
      List<Integer> lastCharacterPos = new LinkedList<Integer>();
      // text position is usually -1 as we take the first and the last character to be styled
      if (end != null) {
        for (int i = 0; i < end.size(); i++) {
          Integer pos = end.get(i);
          if (i == end.size() - 1) {
            // Special case the span is empty, in this case it shall not be -1
            if (pos != 0) {
              pos--;
            }
          }
          lastCharacterPos.add(pos);
        }
      }

      try {
        newOp.put(OPK_NAME, OP_FORMAT);
        newOp.put(OPK_START, incrementAll(start));
        if (context != null) {
          newOp.put(OPK_CONTEXT, context);
        }
        boolean isValidOperation = true;
        if (end != null) {
          newOp.put(OPK_END, incrementAll(lastCharacterPos));
          if (start.get(start.size() - 1) > lastCharacterPos.get(start.size() - 1)) {
            isValidOperation = false;
            LOG.fine("Neglecting '" + newOp.toString());
          }
        }
        newOp.put(OPK_ATTRS, attrs);
        if (isValidOperation) {
          mOperationQueue.put(newOp);
        }

        LOG.log(Level.FINEST, "New Operation '" + OP_FORMAT + "':" + newOp);

      } catch (JSONException e) {
        Logger.getLogger(TextProducer.class.getName()).log(Level.SEVERE, null, e);
      }
    }
  }

  public void addImage(
      final List<Integer> start, Map<String, Object> hardFormatations, final String context) {

    final JSONObject newOperation = new JSONObject();
    try {
      newOperation.put(OPK_NAME, OP_DRAWING);
      newOperation.put(OPK_TYPE, "image");
      newOperation.put(OPK_START, incrementAll(start));
      if (context != null) {
        newOperation.put(OPK_CONTEXT, context);
      }
      if (hardFormatations != null) {
        newOperation.put(OPK_ATTRS, hardFormatations);
      }
      mOperationQueue.put(newOperation);
      LOG.log(Level.FINEST, OP_DRAWING + " (image)" + " - component:{0}", newOperation);

    } catch (JSONException e) {
      Logger.getLogger(TextProducer.class.getName()).log(Level.SEVERE, null, e);
    }
  }

  public void addShape(
      final List<Integer> start,
      Map<String, Object> hardFormatations,
      final String context,
      boolean isGroup) {

    final JSONObject newOperation = new JSONObject();
    try {
      newOperation.put(OPK_NAME, OP_DRAWING);
      newOperation.put(OPK_TYPE, isGroup ? "group" : "shape");
      newOperation.put(OPK_START, incrementAll(start));
      if (context != null) {
        newOperation.put(OPK_CONTEXT, context);
      }
      if (hardFormatations != null) {
        newOperation.put(OPK_ATTRS, hardFormatations);
      }
      mOperationQueue.put(newOperation);
      LOG.log(Level.FINEST, OP_DRAWING + " (shape)" + " - component:{0}", newOperation);

    } catch (JSONException e) {
      Logger.getLogger(TextProducer.class.getName()).log(Level.SEVERE, null, e);
    }
  }

  /** Special Table color mTextProducer.addChild("Table", position, props, mTableColor); */
  // -------------------------------------------------------------------------
  /**
   * @param * @param start: An array, that contains the number of that paragraph, before which the
   *     new paragraph shall be inserted. Has the last paragraph the number 2, so causes para=3,
   *     that the new paragraph will be inserted at the end. para=4 is not allowed in this case.
   */
  public void addTable(
      final List<Integer> start,
      Map<String, Object> hardFormatations,
      final List<Integer> tableGrid,
      String tableName,
      final String context) {

    final JSONObject newOperation = new JSONObject();

    try {
      newOperation.put(OPK_NAME, OP_TABLE);
      newOperation.put(OPK_START, incrementAll(start));
      if (context != null) {
        newOperation.put(OPK_CONTEXT, context);
      }
      JSONObject tableAttrs = null;
      if (hardFormatations != null && !hardFormatations.isEmpty()) {
        tableAttrs = (JSONObject) hardFormatations.get("table");
      } else {
        if (hardFormatations == null) {
          hardFormatations = new HashMap<String, Object>();
        }
      }
      if (tableAttrs == null) {
        tableAttrs = new JSONObject();
      }
      if (tableGrid != null) {
        tableAttrs.put("tableGrid", tableGrid);
      }
      hardFormatations.put("table", tableAttrs);
      newOperation.put(OPK_ATTRS, hardFormatations);
      mOperationQueue.put(newOperation);
      LOG.log(Level.FINEST, OP_TABLE + " - component:{0}", newOperation);
    } catch (JSONException e) {
      Logger.getLogger(TextProducer.class.getName()).log(Level.SEVERE, null, e);
    }
  }

  private void addTableExceededStyle() {
    try {
      JSONArray operations =
          new JSONArray(
              "[{\"styleName\":\"Exceeded Table Style\",\"styleId\":\"LightShading-Accent1\",\"attrs\":{\"firstRow\":{\"paragraph\":{\"marginBottom\":0,\"lineHeight\":{\"value\":100,\"type\":\"percent\"},\"marginTop\":0},\"cell\":{\"borderInsideVert\":{\"style\":\"none\"},\"borderTop\":{\"style\":\"single\",\"color\":{\"value\":\"accent1\",\"type\":\"scheme\"},\"width\":35},\"borderInsideHor\":{\"style\":\"none\"},\"borderBottom\":{\"style\":\"single\",\"color\":{\"value\":\"accent1\",\"type\":\"scheme\"},\"width\":35},\"borderRight\":{\"style\":\"none\"},\"borderLeft\":{\"style\":\"none\"}},\"character\":{\"bold\":true}},\"lastRow\":{\"paragraph\":{\"marginBottom\":0,\"lineHeight\":{\"value\":100,\"type\":\"percent\"},\"marginTop\":0},\"cell\":{\"borderInsideVert\":{\"style\":\"none\"},\"borderTop\":{\"style\":\"single\",\"color\":{\"value\":\"accent1\",\"type\":\"scheme\"},\"width\":35},\"borderInsideHor\":{\"style\":\"none\"},\"borderBottom\":{\"style\":\"single\",\"color\":{\"value\":\"accent1\",\"type\":\"scheme\"},\"width\":35},\"borderRight\":{\"style\":\"none\"},\"borderLeft\":{\"style\":\"none\"}},\"character\":{\"bold\":true}},\"band1Hor\":{\"cell\":{\"borderInsideVert\":{\"style\":\"none\"},\"fillColor\":{\"value\":\"accent1\",\"type\":\"scheme\",\"transformations\":[{\"value\":24706,\"type\":\"tint\"}]},\"borderInsideHor\":{\"style\":\"none\"},\"borderRight\":{\"style\":\"none\"},\"borderLeft\":{\"style\":\"none\"}}},\"lastCol\":{\"character\":{\"bold\":true}},\"wholeTable\":{\"paragraph\":{\"marginBottom\":0,\"lineHeight\":{\"value\":100,\"type\":\"percent\"}},\"table\":{\"paddingTop\":0,\"borderTop\":{\"style\":\"single\",\"color\":{\"value\":\"accent1\",\"type\":\"scheme\"},\"width\":35},\"borderBottom\":{\"style\":\"single\",\"color\":{\"value\":\"accent1\",\"type\":\"scheme\"},\"width\":35},\"paddingBottom\":0,\"paddingLeft\":190,\"paddingRight\":190},\"character\":{\"color\":{\"value\":\"accent1\",\"type\":\"scheme\",\"transformations\":[{\"value\":74902,\"type\":\"shade\"}]}}},\"band1Vert\":{\"cell\":{\"borderInsideVert\":{\"style\":\"none\"},\"fillColor\":{\"value\":\"accent1\",\"type\":\"scheme\",\"transformations\":[{\"value\":24706,\"type\":\"tint\"}]},\"borderInsideHor\":{\"style\":\"none\"},\"borderRight\":{\"style\":\"none\"},\"borderLeft\":{\"style\":\"none\"}}},\"firstCol\":{\"character\":{\"bold\":true}}},\"parent\":\"TableNormal\",\"uiPriority\":60,\"type\":\"table\",\"name\": \""
                  + OP_STYLE
                  + "\"}]");
      mOperationQueue.put(operations.get(0));

    } catch (JSONException ex) {
      Logger.getLogger(TextProducer.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  public void addExceededTable(
      final List<Integer> start,
      int columns,
      int rows,
      final List<Integer> tableGrid,
      String context) {
    final JSONObject newOperation = new JSONObject();

    if (!mIsTableExceededStyleAdded) {
      // addChild once the table style
      addTableExceededStyle();
      mIsTableExceededStyleAdded = true;
    }

    try {
      newOperation.put(OPK_NAME, OP_TABLE);
      newOperation.put(OPK_START, incrementAll(start));
      if (context != null) {
        newOperation.put(OPK_CONTEXT, context);
      }
      Map<String, Integer> sizeExceeded = new HashMap<String, Integer>();
      sizeExceeded.put("columns", columns);
      sizeExceeded.put("rows", rows);
      newOperation.put("sizeExceeded", sizeExceeded);
      Map<String, Object> hardFormatations = new HashMap<String, Object>();
      JSONObject tableAttrs = new JSONObject();
      //			JSONObject tableAttrs = null;
      //			if (hardFormatations != null && !hardFormatations.isEmpty()) {
      //				tableAttrs = (JSONObject) hardFormatations.get("table");
      //			} else {
      //				if (hardFormatations == null) {
      //					hardFormatations = new HashMap<String, Object>();
      //				}
      //			}
      //			if (tableAttrs == null) {
      //				tableAttrs = new JSONObject();
      //			}
      //			if (tableGrid != null) {
      //				tableAttrs.put("tableGrid", tableGrid);
      //			}
      tableAttrs.put("tableGrid", tableGrid);
      tableAttrs.put("style", "LightShading-Accent1");
      tableAttrs.put("width", "auto");
      List exclude = new ArrayList(3);
      exclude.add("lastRow");
      exclude.add("lastCol");
      exclude.add("bandsVert");
      tableAttrs.put("exclude", exclude);
      hardFormatations.put("table", tableAttrs);
      newOperation.put(OPK_ATTRS, hardFormatations);
      mOperationQueue.put(newOperation);

      LOG.log(Level.FINEST, OP_TABLE + " - component:{0}", newOperation);

    } catch (JSONException e) {
      Logger.getLogger(TextProducer.class.getName()).log(Level.SEVERE, null, e);
    }
  }

  public void addField(
      final List<Integer> start,
      String fieldType,
      String fieldContent,
      final Map<String, Object> fieldAttributes,
      String context) {
    final JSONObject newOperation = new JSONObject();

    try {
      newOperation.put(OPK_NAME, OP_FIELD);
      newOperation.put(OPK_START, incrementAll(start));
      if (context != null) {
        newOperation.put(OPK_CONTEXT, context);
      }
      newOperation.put(OPK_TYPE, fieldType);
      if (fieldAttributes != null && !fieldAttributes.isEmpty()) {
        JSONObject attrs = new JSONObject();
        JSONObject fieldAttrs = new JSONObject();
        for (Map.Entry<String, Object> entry : fieldAttributes.entrySet()) {
          fieldAttrs.put(entry.getKey(), entry.getValue());
        }

        attrs.put("field", fieldAttrs);
        newOperation.put(OPK_ATTRS, attrs);
      }
      if (fieldContent != null) {
        newOperation.put("representation", fieldContent);
      } else {
        newOperation.put("representation", "");
      }
      mOperationQueue.put(newOperation);
      LOG.log(Level.FINEST, OP_FIELD + " - component:{0}", newOperation);

    } catch (JSONException e) {
      Logger.getLogger(TextProducer.class.getName()).log(Level.SEVERE, null, e);
    }
  }

  void addAutoFilterColumn(final List<Integer> start, int sheet, final List<String> entries) {
    final JSONObject newOperation = new JSONObject();

    try {
      newOperation.put(OPK_NAME, "changeTableColumn");
      newOperation.put("col", start.get(0));
      newOperation.put(OPK_SHEET, sheet);
      newOperation.put("table", "");
      JSONObject attrs = new JSONObject();
      JSONObject filterAttrs = new JSONObject();
      filterAttrs.put(OPK_TYPE, entries.isEmpty() ? "none" : "discrete");
      if (!entries.isEmpty()) {
        JSONArray entryArray = new JSONArray();
        for (String entry : entries) {
          entryArray.put(entry);
        }
        filterAttrs.put("entries", entryArray);
      }
      attrs.put("filter", filterAttrs);
      newOperation.put(OPK_ATTRS, attrs);
      mOperationQueue.put(newOperation);
      LOG.log(Level.FINEST, "changeTableColumn" + " - component:{0}", newOperation);

    } catch (JSONException e) {
      Logger.getLogger(TextProducer.class.getName()).log(Level.SEVERE, null, e);
    }
  }

  /**
   * * addStylesheet name: 'addStylesheet' type: "table" styleId: The identifier of this stylesheet
   * (unique for the corresponding type). stylename: The readable name of this style sheet. attrs:
   * JSONObject, contains formatting attributes as nested JSON objects, keyed by attribute family,
   * as well as other properties specific to a family. Must support the attributes of the main
   * attribute family, may support attributes of other families. See chapter "Style Sheet
   * Properties" below for a list of supported values. parent: (string, optional) The identifier of
   * the parent style sheet that derives formatting attributes to this style sheet (default: no
   * parent). hidden: (boolean, optional) Whether the style sheet is hidden in the user interface
   * (default: false). uipriority: (integer, optional) The priority of the style sheet used to order
   * style sheet in the user interface. The lower the value the higher the priority (default: 0).
   * default: (boolean, optional) Whether this style sheet is the default style sheet of the family.
   * Only one style sheet per family can be the default style sheet (default: false). pooldefault:
   * (boolean, optional) Whether this style sheet is the pool default style sheet. (default: false).
   * OOXML may have on the table default style properties for table Object { type: table properties
   * } '' row Object { type: row properties } '' cell Object { type: cell properties } '' paragraph
   * Object { type: paragraph properties } '' character Object { type: character properties } We
   * need to split this table style into an additional row and cell style and addChild it as parent
   * for those.
   */
  //
  public void addStyleSheet(
      String styleId,
      String familyID,
      String displayName,
      Map<String, Object> componentProps,
      String parentStyle,
      String nextStyleId,
      Integer outlineLevel,
      boolean isDefaultStyle,
      boolean isHidden,
      String custom) {
    // conditionalType: wholetable
    final JSONObject newOperation = new JSONObject();
    try {
      newOperation.put(OPK_NAME, OP_STYLE);
      if (styleId != null && !styleId.isEmpty()) {
        newOperation.put(OPK_STYLE_ID, styleId);
      }
      newOperation.put(OPK_TYPE, familyID);
      if (displayName != null && !displayName.isEmpty()) {
        newOperation.put("styleName", displayName);
      }
      if (familyID.equals("table")) {
        final JSONObject tableStyleAttrs = new JSONObject();
        tableStyleAttrs.put("wholeTable", componentProps);
        newOperation.put(OPK_ATTRS, tableStyleAttrs);

      } else {
        newOperation.put(OPK_ATTRS, componentProps);
      }
      if (parentStyle != null && !parentStyle.isEmpty()) {
        newOperation.put("parent", parentStyle);
      }
      if (isDefaultStyle) {
        newOperation.put("default", isDefaultStyle);
      }
      if (isHidden) {
        newOperation.put("hidden", isHidden);
      }
      if (outlineLevel != null || nextStyleId != null) {
        JSONObject paraProps;
        if (componentProps.containsKey("paragraph")) {
          paraProps = (JSONObject) componentProps.get("paragraph");
        } else {
          paraProps = new JSONObject();
          componentProps.put("paragraph", paraProps);
        }
        if (outlineLevel != null) {
          paraProps.put("outlineLevel", outlineLevel);
        }
        if (nextStyleId != null && !nextStyleId.isEmpty()) {
          paraProps.put("nextStyleId", nextStyleId);
        }
        componentProps.put("paragraph", paraProps);
        newOperation.put(OPK_ATTRS, componentProps);
      }
      if (null != custom && Boolean.parseBoolean(custom)) {
        newOperation.put("custom", true);
      }
      mOperationQueue.put(newOperation);
      LOG.log(Level.FINEST, OP_STYLE + " - component:{0}", newOperation);

    } catch (JSONException e) {
      Logger.getLogger(TextProducer.class.getName()).log(Level.SEVERE, null, e);
    }
  }

  public void addFontData(
      String fontName,
      String[] altNames,
      String family,
      String familyGeneric,
      String pitch,
      String panose1) {
    List<Integer> panose1_Integers = null;
    if (panose1 != null && !panose1.isEmpty()) {
      String[] result = null;
      if (panose1.contains("[")) {
        panose1 = panose1.substring(1, panose1.length() - 1);
      }

      if (panose1.contains(",")) {
        result = panose1.split(",");
      } else {
        result = panose1.split("\\s");
      }
      panose1_Integers = new LinkedList<Integer>();
      for (String token : result) {
        try {
          panose1_Integers.add(Integer.parseInt(token));

        } catch (NumberFormatException e) {
          Logger.getLogger(TextProducer.class.getName()).log(Level.SEVERE, null, e);
        }
      }
    }
    addFontData(fontName, altNames, family, familyGeneric, pitch, panose1_Integers);
  }

  /**
   * Inserts an extended description for a specific font which an be used for font substitution
   * algorithms. name String 'addFontData'
   *
   * @param fontName The font name.
   * @param altNames String[] NOTE: Will be ignored in ODF. A list of alternate names for the font.
   * @param family String The font family.
   * @param pitch String The font pitch. One of 'fixed', or 'variable'.
   * @param panose1 Integer[10] The font typeface classification number. See
   *     http://en.wikipedia.org/wiki/PANOSE.
   */
  private void addFontData(
      String fontName,
      String[] altNames,
      String family,
      String familyGeneric,
      String pitch,
      List<Integer> panose1) {
    final JSONObject newOperation = new JSONObject();
    final JSONObject attrs = new JSONObject();
    try {
      newOperation.put(OPK_NAME, OP_FONT_DECL);
      if (fontName != null && !fontName.isEmpty()) {
        newOperation.put("fontName", fontName);
      } else {
        LOG.fine("The font name is mandatory!");
      }
      newOperation.put(OPK_ATTRS, attrs);
      if (family != null && !family.isEmpty()) {
        attrs.put("family", family);
      }
      if (familyGeneric != null && !familyGeneric.isEmpty()) {
        attrs.put("familyGeneric", familyGeneric);
      }
      if (pitch != null && !pitch.isEmpty()) {
        attrs.put("pitch", pitch);
      }
      if (panose1 != null && !panose1.isEmpty()) {
        if (panose1.size() != 10) {
          LOG.fine("Panose1 is not 10 digits long: " + panose1.toString());
        }
        attrs.put("panose1", panose1);
      }

      mOperationQueue.put(newOperation);
      LOG.log(Level.FINEST, OP_FONT_DECL + " - component:{0}", newOperation);

    } catch (JSONException e) {
      Logger.getLogger(TextProducer.class.getName()).log(Level.SEVERE, null, e);
    }
  }

  /**
   * @param componentProps is a JSONObject that has the family ID as key (e.g 'page') and the
   *     properties as JSON object as value
   */
  public void addDocumentData(JSONObject componentProps) {
    // conditionalType: wholetable
    try {
      mDocumentAttributes.put(OPK_ATTRS, componentProps);
      mDocumentAttributes.put(OPK_NAME, OP_DOCUMENT_LAYOUT);
      LOG.log(Level.FINEST, OP_DOCUMENT_LAYOUT + " - component:{0}", mDocumentAttributes);

    } catch (JSONException e) {
      Logger.getLogger(TextProducer.class.getName()).log(Level.SEVERE, null, e);
    }
  }


  public void addDocumentProperties(
      OdfStylesDom stylesDom, Integer defaultTabStopWidth, JSONObject defaultPageStyles) {
    try {
      JSONObject documentPropsObject = new JSONObject();
      JSONObject docPropsJson = new JSONObject();
      if (defaultTabStopWidth != null) {
        docPropsJson.putOpt("defaultTabStop", defaultTabStopWidth);
      }
      if (defaultPageStyles != null) {
        documentPropsObject.put("page", defaultPageStyles);
      }
      docPropsJson.putOpt("fileFormat", "odf");
      documentPropsObject.put("document", docPropsJson);
      addDocumentData(documentPropsObject);
    } catch (Exception ex) {
      Logger.getLogger(TextProducer.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

    /** Adding a default footer style operation */
  public void addHeaderFooter(String contextName, PageArea pageArea, JSONObject attrs) {
    if (contextName != null) {
      final JSONObject newOperation = new JSONObject(4);
      try {
        newOperation.put(OPK_NAME, OP_HEADER_FOOTER);
        newOperation.put(OPK_ID, contextName);
        newOperation.put(OPK_TYPE, pageArea.getPageAreaName());
        if (attrs != null && attrs.length() != 0) {
          newOperation.put(OPK_ATTRS, attrs);
        }
        mOperationQueue.put(newOperation);
        LOG.log(Level.FINEST, OP_HEADER_FOOTER + " component:{0}", newOperation);
      } catch (JSONException e) {
        Logger.getLogger(TextProducer.class.getName()).log(Level.SEVERE, null, e);
      }
    }
  }

  /**
   * LO/AO does not interpret clipping as in FO/CSS
   * http://www.w3.org/TR/CSS2/visufx.html#propdef-clip Instead the clip values measure the distance
   * from each border to the start of the viewed area. The clip vales are taking measure from the
   * original size, which is not part of the OFD XML, therefore the image have to be loaded for
   * receiving the size.
   */
  public static void calculateCrops(OdfElement image, String href, JSONObject imageProps) {
    try {
      // ToDo: Although the streams are cached we might cache the clipping for known href, help if
      // images occure more than once
      OdfPackage pkg = ((OdfFileDom) image.getOwnerDocument()).getDocument().getPackage();

      InputStream is = pkg.getInputStream(href);
      if (is != null) {
        BufferedImage bimg = ImageIO.read(is);
        if (bimg != null) {
          double width =
              MapHelper.normalizeLength((bimg.getWidth() / Constants.DOTS_PER_INCH) + "in");
          double height =
              MapHelper.normalizeLength((bimg.getHeight() / Constants.DOTS_PER_INCH) + "in");
          try {
            // 2nd half of absolute fo:clip to relative crop (Changes API) mapping
            if (imageProps.has("cropRight")) {
              Number cropRight = (Number) imageProps.get("cropRight");
              LOG.log(Level.FINEST, "The clipRight is {0}", cropRight);
              if (cropRight != null) {
                if (cropRight.doubleValue() != 0.0) {
                  imageProps.put("cropRight", cropRight.doubleValue() * 100.0 / width);
                  LOG.log(
                      Level.FINEST,
                      "The cropRight is {0}",
                      cropRight.doubleValue() * 100.0 / width);
                } else {
                  // do not set explicitly with 0
                  imageProps.remove("cropRight");
                }
              }
            }
            if (imageProps.has("cropLeft")) {
              Number cropLeft = (Number) imageProps.get("cropLeft");
              LOG.log(Level.FINEST, "The clipLeft is {0}", cropLeft);
              if (cropLeft != null) {
                if (cropLeft.doubleValue() != 0.0) {
                  imageProps.put("cropLeft", cropLeft.doubleValue() * 100.0 / width);
                  LOG.log(
                      Level.FINEST, "The cropLeft is {0}", cropLeft.doubleValue() * 100.0 / width);
                } else {
                  // do not set explicitly with 0
                  imageProps.remove("cropLeft");
                }
              }
            }
            // 2nd half of absolute fo:clip to relative crop (Changes API) mapping
            if (imageProps.has("cropTop")) {
              Number cropTop = (Number) imageProps.get("cropTop");
              LOG.log(Level.FINEST, "The clipTop is {0}", cropTop);
              double d = cropTop.doubleValue();
              if (cropTop != null) {
                if (cropTop.doubleValue() != 0.0) {
                  imageProps.put("cropTop", cropTop.doubleValue() * 100.0 / height);
                  LOG.log(
                      Level.FINEST, "The cropTop is {0}", cropTop.doubleValue() * 100.0 / height);
                } else {
                  // do not set explicitly with 0
                  imageProps.remove("cropTop");
                }
              }
            }
            if (imageProps.has("cropBottom")) {
              Number cropBottom = (Number) imageProps.get("cropBottom");
              LOG.log(Level.FINEST, "The clipBottom is {0}", cropBottom);
              if (cropBottom != null) {
                if (cropBottom.doubleValue() != 0.0) {
                  imageProps.put("cropBottom", cropBottom.doubleValue() * 100.0 / height);
                  LOG.log(
                      Level.FINEST,
                      "The cropBottom is {0}",
                      cropBottom.doubleValue() * 100.0 / height);
                } else {
                  // do not set explicitly with 0
                  imageProps.remove("cropBottom");
                }
              }
            }
          } catch (JSONException ex) {
            Logger.getLogger(TextProducer.class.getName()).log(Level.SEVERE, null, ex);
          }
          LOG.log(Level.FINEST, "Width: {0} Height: {1}", new Object[] {width, height});
        } else {
          LOG.log(Level.WARNING, "The image ''{0}'' could not be loaded!", href);
        }
      } else {
        LOG.log(Level.WARNING, "The image ''{0}'' could not be loaded!", href);
      }
    } catch (IOException ex) {
      Logger.getLogger(TextProducer.class.getName())
          .log(Level.SEVERE, "Image could not be found at " + href, ex);
    }
  }

  private static List<Integer> incrementAll(List<Integer> position) {
    if (position != null) {
      for (int i = 0; i < position.size(); i++) {
        position.set(i, position.get(i) + 1);
      }
    }
    return position;
  }
}
