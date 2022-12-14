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

import static org.odftoolkit.odfdom.changes.OperationConstants.CONFIG_DEBUG_OPERATIONS;
import static org.odftoolkit.odfdom.changes.OperationConstants.CONFIG_MAX_SHEETS;
import static org.odftoolkit.odfdom.changes.OperationConstants.CONFIG_MAX_TABLE_CELLS;
import static org.odftoolkit.odfdom.changes.OperationConstants.CONFIG_MAX_TABLE_COLUMNS;
import static org.odftoolkit.odfdom.changes.OperationConstants.CONFIG_MAX_TABLE_ROWS;
import static org.odftoolkit.odfdom.changes.OperationConstants.OPK_OPERATIONS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.odftoolkit.odfdom.changes.CollabTextDocument;
import org.odftoolkit.odfdom.changes.JsonOperationConsumer;
import org.odftoolkit.odfdom.changes.JsonOperationProducer;
import org.odftoolkit.odfdom.doc.OdfTextDocument;
import org.odftoolkit.odfdom.dom.OdfSchemaDocument.OdfXMLFile;
import org.odftoolkit.odfdom.incubator.meta.OdfOfficeMeta;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfPackage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

/** This collaboration document embraces an ODF document ad */
public class SearchTextDocument extends CollabTextDocument implements Closeable {

  private static final Logger LOG = LoggerFactory.getLogger(SearchTextDocument.class);
  //	private static final Logger LOG = Logger.getLogger(SearchTextDocument.class.getName());
  // not private as used as well by tests


  /** Creates an empty ODF document. */
  private SearchTextDocument() {
    super();
  }

  public SearchTextDocument(InputStream inputStream) throws Exception {
    super(inputStream);
  }


  // to be ... depending to the target the owner document might be also the StylesDom
  public OdfFileDom getOwnerDocument() throws SAXException, IOException {

    return getDocument().getContentDom();
  }

  public String getTextRespresentation() throws IOException, SAXException {

    //if(mTextDocument.getJsonOperationQueue() == null){

      StringBuilder sb = new StringBuilder();
      OdfOfficeMeta meta = getDocument().getOfficeMetadata();
      if(meta != null){
        if(meta.getKeywords() != null){
          sb.append("keywords: ").append(meta.getKeywords()).append("\n");
        }
        if(meta.getCreator() != null) {
          sb.append("creator: ").append(meta.getCreator()).append("\n");
        }
        if(meta.getCreationDate() != null) {
          sb.append("creation-date: ").append(meta.getCreationDate().toInstant()).append("\n");
        }
        if(meta.getDate() != null){
          sb.append("date: ").append(meta.getDate().toInstant()).append("\n");
        }
        if(meta.getDescription() != null){
          sb.append("description: ").append(meta.getDescription().replace("\n", "")).append("\n");
        }
        if(meta.getEditingCycles() != null) {
          sb.append("editing-cycles: ").append(meta.getEditingCycles()).append("\n");
        }
        if(meta.getEditingDuration() != null) {
          sb.append("editing-duration: ").append(meta.getEditingDuration()).append("\n");
        }
        if(meta.getLanguage() != null) {
          sb.append("language: ").append(meta.getLanguage()).append("\n");
        }
        if(meta.getPrintDate() != null) {
          sb.append("print-date: ").append(meta.getPrintDate()).append("\n");
        }
        if(meta.getPrintedBy() != null) {
          sb.append("printed-by: ").append(meta.getPrintedBy().replace("\n", "")).append("\n");
        }
        if(meta.getSubject() != null) {
          sb.append("subject: ").append(meta.getSubject().replace("\n", "")).append("\n");
        }
        if(meta.getTitle() != null) {
          sb.append("title: ").append(meta.getTitle().replace("\n", "")).append("\n");
        }
        if(meta.getUserDefinedDataNames() != null) {
          for (String dataName : meta.getUserDefinedDataNames()) {
            sb.append(dataName).append(": ").append(meta.getUserDefinedDataValue(dataName).replace("\n", "")).append("\n");
          }
        }
      }

      getDocument().setJsonOperationQueue(new TextProducer(sb));
    //}
    getDocument().getOperations(this);
    return sb.toString();
  }

}
