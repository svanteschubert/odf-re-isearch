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
 * <p>**********************************************************************
 */

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element text:bibliography-source}. */
public class TextBibliographySourceElement extends OdfElement {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.TEXT, "bibliography-source");

  /**
   * Create the instance of <code>TextBibliographySourceElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public TextBibliographySourceElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element
   *     text:bibliography-source}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Create child element {@odf.element text:bibliography-entry-template}.
   *
   * @param textBibliographyTypeValue the <code>String</code> value of <code>
   *     TextBibliographyTypeAttribute</code>, see {@odf.attribute text:bibliography-type} at
   *     specification
   * @param textStyleNameValue the <code>String</code> value of <code>TextStyleNameAttribute</code>,
   *     see {@odf.attribute text:style-name} at specification
   * @return the element {@odf.element text:bibliography-entry-template}
   */
  public TextBibliographyEntryTemplateElement newTextBibliographyEntryTemplateElement(
      String textBibliographyTypeValue, String textStyleNameValue) {
    TextBibliographyEntryTemplateElement textBibliographyEntryTemplate =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextBibliographyEntryTemplateElement.class);
    textBibliographyEntryTemplate.setTextBibliographyTypeAttribute(textBibliographyTypeValue);
    textBibliographyEntryTemplate.setTextStyleNameAttribute(textStyleNameValue);
    this.appendChild(textBibliographyEntryTemplate);
    return textBibliographyEntryTemplate;
  }

  /**
   * Create child element {@odf.element text:index-title-template}.
   *
   * <p>Child element is new in Odf 1.2
   *
   * @return the element {@odf.element text:index-title-template}
   */
  public TextIndexTitleTemplateElement newTextIndexTitleTemplateElement() {
    TextIndexTitleTemplateElement textIndexTitleTemplate =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextIndexTitleTemplateElement.class);
    this.appendChild(textIndexTitleTemplate);
    return textIndexTitleTemplate;
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
}
