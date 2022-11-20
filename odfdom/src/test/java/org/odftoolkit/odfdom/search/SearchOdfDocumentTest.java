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

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.junit.Assert;
import org.junit.Test;
import org.odftoolkit.odfdom.changes.JsonOperationNormalizer;
import org.odftoolkit.odfdom.utils.ResourceUtilities;

public class SearchOdfDocumentTest {

  // private static final String SOURCE_ODF_1_3 = "odf1.3.odt";
  private static final String SOURCE_ODF_1_3 = "MergedCells.ods";
  private static final String TARGET_TEXT_ODF_1_3 = "odf1.3.txt";
  private static final String TARGET_JSON_ODF_1_3 = "odf1.3.json";

  private static final String SOURCE_RE_ISEARCH = "re-isearch-test.odt";
  private static final String TARGET_TEXT_RE_ISEARCH = "re-isearch-test.txt";
  private static final String TARGET_JSON_RE_ISEARCH = "re-isearch-test.json";

  public SearchOdfDocumentTest() {}

  @Test
  public void testSaveText() {
    saveToText(SOURCE_ODF_1_3, TARGET_TEXT_ODF_1_3);
    //    saveToText(SOURCE_RE_ISEARCH, TARGET_TEXT_RE_ISEARCH);
  }

  private void saveToText(String input, String output) {

    try (SearchOdfDocument doc1 =
        new SearchOdfDocument(
            Files.newInputStream(Path.of(ResourceUtilities.getTestInputURI(input))))) {

      String searchText = doc1.getTextRespresentation();
      System.out.println(searchText);

      try (PrintWriter out = new PrintWriter(ResourceUtilities.getTestOutputFile(output))) {
        out.println(searchText);
      }
    } catch (Exception e) {
      Logger.getLogger(SearchOdfDocumentTest.class.getName())
          .log(Level.SEVERE, e.getMessage() + ExceptionUtils.getStackTrace(e), e);
      Assert.fail(e.getMessage());
    }
  }

  @Test
  public void testSaveJsonOperations() {
    saveToJsonOperations(SOURCE_ODF_1_3, TARGET_JSON_ODF_1_3);
    saveToJsonOperations(SOURCE_RE_ISEARCH, TARGET_JSON_RE_ISEARCH);
  }

  public void saveToJsonOperations(String input, String output) {

    try (SearchOdfDocument doc1 =
        new SearchOdfDocument(
            Files.newInputStream(Path.of(ResourceUtilities.getTestInputURI(input))))) {

      String opsText =
          JsonOperationNormalizer.asString(doc1.getDocumentAsChanges())
              .replace(",{\"name\"", ",\n{\"name\"");
      System.out.println(opsText);

      try (PrintWriter out = new PrintWriter(ResourceUtilities.getTestOutputFile(output))) {
        out.println(opsText);
      }
    } catch (Exception e) {
      Logger.getLogger(SearchOdfDocumentTest.class.getName())
          .log(Level.SEVERE, e.getMessage() + ExceptionUtils.getStackTrace(e), e);
      Assert.fail(e.getMessage());
    }
  }
}
