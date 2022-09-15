/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.style;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.style.props.OdfStyleProperty;
import org.odftoolkit.odfdom.dom.style.props.OdfStylePropertiesSet;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.element.OdfStylePropertiesBase;

/**
 * DOM implementation of OpenDocument element  {@odf.element style:table-cell-properties}.
 *
 * This class can have any org.w3c.dom.Element child element.
 * This class can have any org.w3c.dom.Attribute attribute.
 */
public class StyleTableCellPropertiesElement extends OdfStylePropertiesBase {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.STYLE, "table-cell-properties");

	/**
	 * Create the instance of <code>StyleTableCellPropertiesElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public StyleTableCellPropertiesElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element style:table-cell-properties}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

  /**
   * Accept an visitor instance to allow the visitor to do some operations. Refer to visitor design
   * pattern to get a better understanding.
   *
   * @param visitor an instance of DefaultElementVisitor
   */
	@Override
	public void accept(ElementVisitor visitor) {
		if (visitor instanceof DefaultElementVisitor) {
			DefaultElementVisitor defaultVisitor = (DefaultElementVisitor) visitor;
			defaultVisitor.visit(this);
		} else {
			visitor.visit(this);
		}
	}

  /** BORDERS TO BE DELETED */
  public static final byte BORDER_NONE = 0x0;

  public static final byte BORDER_TOP = 0x1;
  public static final byte BORDER_RIGHT = 0x2;
  public static final byte BORDER_BOTTOM = 0x4;
  public static final byte BORDER_LEFT = 0x8;
  public static final byte BORDER_ALL = 0xF;

  /**
   * Removes sides of borders in total. Required by insertion of column/rows as inserted cell
   * borders depend on preceding & following cell borders. Only identical sides will be kept.
   *
   * @param borderDeletion removes the borders as given in byte
   */
  public void removeBorder(byte borderDeletion) {
    if (borderDeletion != BORDER_NONE) {
      // check if a border for all sides exists
      String foBorderContent = getFoBorderAttribute();
      boolean hasCommonBorder = foBorderContent != null && !foBorderContent.equals("none");
      if (borderDeletion == BORDER_ALL) {
        setAttributeNS(OdfDocumentNamespace.FO.getUri(), "fo:border", "none");
        removeAttributeNS(OdfDocumentNamespace.FO.getUri(), "border-top");
        removeAttributeNS(OdfDocumentNamespace.STYLE.getUri(), "border-line-width-top");
        removeAttributeNS(OdfDocumentNamespace.FO.getUri(), "border-right");
        removeAttributeNS(OdfDocumentNamespace.STYLE.getUri(), "border-line-width-right");
        removeAttributeNS(OdfDocumentNamespace.FO.getUri(), "border-bottom");
        removeAttributeNS(OdfDocumentNamespace.STYLE.getUri(), "border-line-width-bottom");
        removeAttributeNS(OdfDocumentNamespace.FO.getUri(), "border-left");
        removeAttributeNS(OdfDocumentNamespace.STYLE.getUri(), "border-line-width-left");
      } else {
        if (hasCommonBorder) {
          removeAttributeNS(OdfDocumentNamespace.FO.getUri(), "border");
        }
        // if a top border should be deleted
        if ((borderDeletion & BORDER_TOP) == BORDER_TOP) {
          setAttributeNS(OdfDocumentNamespace.FO.getUri(), "fo:border-top", "none");
          removeAttributeNS(OdfDocumentNamespace.STYLE.getUri(), "border-line-width-top");
        } else if (hasCommonBorder) { // if the top border should exist
          setAttributeNS(OdfDocumentNamespace.FO.getUri(), "fo:border-top", foBorderContent);
        }
        // if a right border should be deleted
        if ((borderDeletion & BORDER_RIGHT) == BORDER_RIGHT) {
          setAttributeNS(OdfDocumentNamespace.FO.getUri(), "fo:border-right", "none");
          removeAttributeNS(OdfDocumentNamespace.STYLE.getUri(), "border-line-width-right");
        } else if (hasCommonBorder) { // if the right border should exist
          setAttributeNS(OdfDocumentNamespace.FO.getUri(), "fo:border-right", foBorderContent);
        }
        // if a bottom border should be deleted
        if ((borderDeletion & BORDER_BOTTOM) == BORDER_BOTTOM) {
          setAttributeNS(OdfDocumentNamespace.FO.getUri(), "fo:border-bottom", "none");
          removeAttributeNS(OdfDocumentNamespace.STYLE.getUri(), "border-line-width-bottom");
        } else if (hasCommonBorder) { // if the bottom border should exist
          setAttributeNS(OdfDocumentNamespace.FO.getUri(), "fo:border-bottom", foBorderContent);
        }
        // if a left border should be deleted
        if ((borderDeletion & BORDER_LEFT) == BORDER_LEFT) {
          setAttributeNS(OdfDocumentNamespace.FO.getUri(), "fo:border-left", "none");
          removeAttributeNS(OdfDocumentNamespace.STYLE.getUri(), "border-line-width-left");
        } else if (hasCommonBorder) { // if the left border should exist
          setAttributeNS(OdfDocumentNamespace.FO.getUri(), "fo:border-left", foBorderContent);
        }
      }
    }
  }

  /** Removes diagonal cross from cells */
  public static final byte DIAGONAL_CROSS_NONE = 0x0;

  public static final byte DIAGONAL_CROSS_TOP_LEFT_START = 0x1;
  public static final byte DIAGONAL_CROSS_BOTTOM_LEFT_START = 0x2;
  public static final byte DIAGONAL_CROSS_ALL = 0xF;

  /**
   * Removes the diagonal cross of a cell.
   *
   * @param diagonalCrossDeletion remove diagonal cross as given in byte.
   */
  public void removeDiagonalCross(byte diagonalCrossDeletion) {
    if (diagonalCrossDeletion != DIAGONAL_CROSS_NONE) {
      if (diagonalCrossDeletion == DIAGONAL_CROSS_ALL) {
        // style:diagonal-tl-br
        setAttributeNS(OdfDocumentNamespace.STYLE.getUri(), "style:diagonal-tl-br", "none");
        removeAttributeNS(OdfDocumentNamespace.STYLE.getUri(), "diagonal-tl-br-widths");

        // style:diagonal-bl-tr
        setAttributeNS(OdfDocumentNamespace.STYLE.getUri(), "style:diagonal-bl-tr", "none");
        removeAttributeNS(OdfDocumentNamespace.STYLE.getUri(), "diagonal-bl-tr-widths");
      } else {
        // if the diagonal starting from top left to bottom right should be deleted
        if ((diagonalCrossDeletion & DIAGONAL_CROSS_TOP_LEFT_START)
            == DIAGONAL_CROSS_TOP_LEFT_START) {
          // style:diagonal-tl-br
          setAttributeNS(OdfDocumentNamespace.STYLE.getUri(), "style:diagonal-tl-br", "none");
          removeAttributeNS(OdfDocumentNamespace.STYLE.getUri(), "diagonal-tl-br-widths");
        }
        // if the diagonal starting from bottom left to top right should be deleted
        if ((diagonalCrossDeletion & DIAGONAL_CROSS_BOTTOM_LEFT_START)
            == DIAGONAL_CROSS_BOTTOM_LEFT_START) {
          // style:diagonal-bl-tr
          setAttributeNS(OdfDocumentNamespace.STYLE.getUri(), "style:diagonal-bl-tr", "none");
          removeAttributeNS(OdfDocumentNamespace.STYLE.getUri(), "diagonal-bl-tr-widths");
        }
      }
    }
  }

  /** Find different diagonal borders (or cross) of the given cell property elements. */
  public static byte findDifferentDiagonalCross(
      StyleTableCellPropertiesElement newCellProps,
      StyleTableCellPropertiesElement followingCellProps) {
    byte diagonalCrossRemoval = StyleTableCellPropertiesElement.DIAGONAL_CROSS_NONE;

    // Compare the diagonal starting from bottom left to top right
    if (!hasEqualBorders(
            newCellProps.getStyleDiagonalBlTrAttribute(),
            followingCellProps.getStyleDiagonalBlTrAttribute(),
            null,
            null)
        && !hasEqualBorders(
            newCellProps.getStyleDiagonalBlTrWidthsAttribute(),
            followingCellProps.getStyleDiagonalBlTrWidthsAttribute(),
            null,
            null)) {
      diagonalCrossRemoval =
          (byte)
              (StyleTableCellPropertiesElement.DIAGONAL_CROSS_BOTTOM_LEFT_START
                  | diagonalCrossRemoval);
    } else {
      diagonalCrossRemoval =
          (byte)
              (~StyleTableCellPropertiesElement.DIAGONAL_CROSS_BOTTOM_LEFT_START
                  & diagonalCrossRemoval);
    }

    // Compare the diagonal starting from top left to bottom right
    if (!hasEqualBorders(
            newCellProps.getStyleDiagonalTlBrAttribute(),
            followingCellProps.getStyleDiagonalTlBrAttribute(),
            null,
            null)
        && !hasEqualBorders(
            newCellProps.getStyleDiagonalTlBrWidthsAttribute(),
            followingCellProps.getStyleDiagonalTlBrWidthsAttribute(),
            null,
            null)) {
      diagonalCrossRemoval =
          (byte)
              (StyleTableCellPropertiesElement.DIAGONAL_CROSS_TOP_LEFT_START
                  | diagonalCrossRemoval);
    } else {
      diagonalCrossRemoval =
          (byte)
              (~StyleTableCellPropertiesElement.DIAGONAL_CROSS_TOP_LEFT_START
                  & diagonalCrossRemoval);
    }
    return diagonalCrossRemoval;
  }

  /** Find different borders of the given cell property elements. */
  public static byte findDifferentBorders(
      StyleTableCellPropertiesElement newCellProps,
      StyleTableCellPropertiesElement followingCellProps) {
    byte borderRemoval = StyleTableCellPropertiesElement.BORDER_NONE;

    // remove all borders if both border style exist, but are different, or only the first exist and
    String firstCellBorderDefault = newCellProps.getFoBorderAttribute();
    String secondCellBorderDefault = followingCellProps.getFoBorderAttribute();
    if (!hasEqualBorders(firstCellBorderDefault, secondCellBorderDefault, null, null)) {
      borderRemoval = StyleTableCellPropertiesElement.BORDER_ALL;
    }
    // Compare Top border
    if (!hasEqualBorders(
        newCellProps.getFoBorderTopAttribute(),
        followingCellProps.getFoBorderTopAttribute(),
        firstCellBorderDefault,
        secondCellBorderDefault)) {
      borderRemoval = (byte) (StyleTableCellPropertiesElement.BORDER_TOP | borderRemoval);
    } else {
      borderRemoval = (byte) (~StyleTableCellPropertiesElement.BORDER_TOP & borderRemoval);
    }

    // Compare Right border
    if (!hasEqualBorders(
        newCellProps.getFoBorderRightAttribute(),
        followingCellProps.getFoBorderRightAttribute(),
        firstCellBorderDefault,
        secondCellBorderDefault)) {
      borderRemoval = (byte) (StyleTableCellPropertiesElement.BORDER_RIGHT | borderRemoval);
    } else {
      borderRemoval = (byte) (~StyleTableCellPropertiesElement.BORDER_RIGHT & borderRemoval);
    }

    // Compare Bottom border
    if (!hasEqualBorders(
        newCellProps.getFoBorderBottomAttribute(),
        followingCellProps.getFoBorderBottomAttribute(),
        firstCellBorderDefault,
        secondCellBorderDefault)) {
      borderRemoval = (byte) (StyleTableCellPropertiesElement.BORDER_BOTTOM | borderRemoval);
    } else {
      borderRemoval = (byte) (~StyleTableCellPropertiesElement.BORDER_BOTTOM & borderRemoval);
    }

    // Compare Left border
    if (!hasEqualBorders(
        newCellProps.getFoBorderLeftAttribute(),
        followingCellProps.getFoBorderLeftAttribute(),
        firstCellBorderDefault,
        secondCellBorderDefault)) {
      borderRemoval = (byte) (StyleTableCellPropertiesElement.BORDER_LEFT | borderRemoval);
    } else {
      borderRemoval = (byte) (~StyleTableCellPropertiesElement.BORDER_LEFT & borderRemoval);
    }
    return borderRemoval;
  }

  /**
   * @return true if both border values either null or have the same value or one is zero, but has a
   *     default value (ie. fo:border) with similar value
   */
  private static boolean hasEqualBorders(
      String borderValueOne,
      String borderValueTwo,
      String firstCellBorderDefault,
      String secondCellBorderDefault) {
    // if all borders are null they are equal, no effort of removing have to be undertaken
    return (borderValueOne == null
            && borderValueTwo == null
            && firstCellBorderDefault == null
            && secondCellBorderDefault == null)
        // if both specific border exist an are not null
        || (borderValueOne != null
            && borderValueTwo != null
            && borderValueOne.equals(borderValueTwo))
        // if one specific border exist the other has the same value from the default (all round
        // border)
        || (borderValueOne == null
            && borderValueTwo != null
            && firstCellBorderDefault != null
            && borderValueTwo.equals(firstCellBorderDefault))
        // if one specific border exist the other has the same value from the default (all round
        // border)
        || (borderValueOne != null
            && borderValueTwo == null
            && secondCellBorderDefault != null
            && borderValueOne.equals(secondCellBorderDefault))
        // if no specific value is set, but the both defaults are set and the same
        || borderValueOne == null
            && borderValueTwo == null
            && firstCellBorderDefault != null
            && secondCellBorderDefault != null
            && firstCellBorderDefault.equals(secondCellBorderDefault);
  }
}
