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
import org.odftoolkit.odfdom.dom.attribute.text.TextStyleNameAttribute;
import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element text:table-index-entry-template}. */
public class TextTableIndexEntryTemplateElement extends OdfStylableElement {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.TEXT, "table-index-entry-template");

  /**
   * Create the instance of <code>TextTableIndexEntryTemplateElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public TextTableIndexEntryTemplateElement(OdfFileDom ownerDoc) {
    super(
        ownerDoc,
        ELEMENT_NAME,
        OdfStyleFamily.Paragraph,
        OdfName.newName(OdfDocumentNamespace.TEXT, "style-name"));
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element
   *     text:table-index-entry-template}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TextStyleNameAttribute</code> ,
   * See {@odf.attribute text:style-name}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTextStyleNameAttribute() {
    TextStyleNameAttribute attr =
        (TextStyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "style-name");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TextStyleNameAttribute</code> , See
   * {@odf.attribute text:style-name}
   *
   * @param textStyleNameValue The type is <code>String</code>
   */
  public void setTextStyleNameAttribute(String textStyleNameValue) {
    TextStyleNameAttribute attr = new TextStyleNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(textStyleNameValue);
  }

  /**
   * Create child element {@odf.element text:index-entry-chapter}.
   *
   * <p>Child element is new in Odf 1.2
   *
   * @return the element {@odf.element text:index-entry-chapter}
   */
  public TextIndexEntryChapterElement newTextIndexEntryChapterElement() {
    TextIndexEntryChapterElement textIndexEntryChapter =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextIndexEntryChapterElement.class);
    this.appendChild(textIndexEntryChapter);
    return textIndexEntryChapter;
  }

  /**
   * Create child element {@odf.element text:index-entry-page-number}.
   *
   * <p>Child element is new in Odf 1.2
   *
   * @return the element {@odf.element text:index-entry-page-number}
   */
  public TextIndexEntryPageNumberElement newTextIndexEntryPageNumberElement() {
    TextIndexEntryPageNumberElement textIndexEntryPageNumber =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextIndexEntryPageNumberElement.class);
    this.appendChild(textIndexEntryPageNumber);
    return textIndexEntryPageNumber;
  }

  /**
   * Create child element {@odf.element text:index-entry-span}.
   *
   * <p>Child element is new in Odf 1.2
   *
   * @return the element {@odf.element text:index-entry-span}
   */
  public TextIndexEntrySpanElement newTextIndexEntrySpanElement() {
    TextIndexEntrySpanElement textIndexEntrySpan =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextIndexEntrySpanElement.class);
    this.appendChild(textIndexEntrySpan);
    return textIndexEntrySpan;
  }

  /**
   * Create child element {@odf.element text:index-entry-tab-stop}.
   *
   * @param styleTypeValue the <code>String</code> value of <code>StyleTypeAttribute</code>, see
   *     {@odf.attribute style:type} at specification
   * @return the element {@odf.element text:index-entry-tab-stop}
   */
  public TextIndexEntryTabStopElement newTextIndexEntryTabStopElement(String styleTypeValue) {
    TextIndexEntryTabStopElement textIndexEntryTabStop =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextIndexEntryTabStopElement.class);
    textIndexEntryTabStop.setStyleTypeAttribute(styleTypeValue);
    this.appendChild(textIndexEntryTabStop);
    return textIndexEntryTabStop;
  }

  /**
   * Create child element {@odf.element text:index-entry-text}.
   *
   * <p>Child element is new in Odf 1.2
   *
   * @return the element {@odf.element text:index-entry-text}
   */
  public TextIndexEntryTextElement newTextIndexEntryTextElement() {
    TextIndexEntryTextElement textIndexEntryText =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextIndexEntryTextElement.class);
    this.appendChild(textIndexEntryText);
    return textIndexEntryText;
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
