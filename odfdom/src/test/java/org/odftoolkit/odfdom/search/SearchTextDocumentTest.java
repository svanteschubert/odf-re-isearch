/**
 * **********************************************************************
 *
 * <p>DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * <p>Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * <p>Use is subject to license terms.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0. You can also obtain a copy of the License at
 * http://odftoolkit.org/docs/license.txt
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied.
 *
 * <p>See the License for the specific language governing permissions and limitations under the
 * License.
 *
 * <p>*********************************************************************
 */
package org.odftoolkit.odfdom.search;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.junit.Assert;
import org.junit.Test;
import org.odftoolkit.odfdom.changes.CollabTextDocument;
import org.odftoolkit.odfdom.changes.JsonOperationNormalizer;
import org.odftoolkit.odfdom.doc.OdfDocument;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeVersionAttribute;
import org.odftoolkit.odfdom.dom.element.office.OfficeDocumentContentElement;
import org.odftoolkit.odfdom.incubator.meta.OdfOfficeMeta;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.utils.ResourceUtilities;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SearchTextDocumentTest {

  private static final String SOURCE = "odf1.3.odt";
  private static final String TARGET_TEXT = "odf1.3.txt";
  private static final String TARGET_JSON = "odf1.3.json";

  public SearchTextDocumentTest() {}

  @Test
  public void testSaveText() {

    try (SearchTextDocument doc1 =
           new SearchTextDocument(Files.newInputStream(Path.of(ResourceUtilities.getTestInputURI(SOURCE))))) {

      String searchText = doc1.getTextRespresentation();
      System.out.println(searchText);

      try (PrintWriter out = new PrintWriter(ResourceUtilities.getTestOutputFile(TARGET_TEXT))) {
        out.println(searchText);
      }
    } catch (Exception e) {
      Logger.getLogger(SearchTextDocumentTest.class.getName())
          .log(Level.SEVERE, e.getMessage() + ExceptionUtils.getStackTrace(e), e);
      Assert.fail(e.getMessage());
    }
  }


  @Test
  public void testSaveOperations() {

    try (SearchTextDocument doc1 =
           new SearchTextDocument(Files.newInputStream(Path.of(ResourceUtilities.getTestInputURI(SOURCE))))) {

      String opsText = JsonOperationNormalizer.asString(doc1.getDocumentAsChanges())
        .replace(",{\"name\"", ",\n{\"name\"");
      System.out.println(opsText);

      try (PrintWriter out = new PrintWriter(ResourceUtilities.getTestOutputFile(TARGET_JSON))) {
        out.println(opsText);
      }
    } catch (Exception e) {
      Logger.getLogger(SearchTextDocumentTest.class.getName())
        .log(Level.SEVERE, e.getMessage() + ExceptionUtils.getStackTrace(e), e);
      Assert.fail(e.getMessage());
    }
  }
}
