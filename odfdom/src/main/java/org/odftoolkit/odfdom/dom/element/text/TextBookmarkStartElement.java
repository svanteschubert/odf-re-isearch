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
import org.odftoolkit.odfdom.dom.attribute.text.TextNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.xhtml.XhtmlAboutAttribute;
import org.odftoolkit.odfdom.dom.attribute.xhtml.XhtmlContentAttribute;
import org.odftoolkit.odfdom.dom.attribute.xhtml.XhtmlDatatypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.xhtml.XhtmlPropertyAttribute;
import org.odftoolkit.odfdom.dom.attribute.xml.XmlIdAttribute;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element text:bookmark-start}. */
public class TextBookmarkStartElement extends OdfElement {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.TEXT, "bookmark-start");

  /**
   * Create the instance of <code>TextBookmarkStartElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public TextBookmarkStartElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element text:bookmark-start}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TextNameAttribute</code> , See
   * {@odf.attribute text:name}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTextNameAttribute() {
    TextNameAttribute attr = (TextNameAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "name");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TextNameAttribute</code> , See
   * {@odf.attribute text:name}
   *
   * @param textNameValue The type is <code>String</code>
   */
  public void setTextNameAttribute(String textNameValue) {
    TextNameAttribute attr = new TextNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(textNameValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>XhtmlAboutAttribute</code> ,
   * See {@odf.attribute xhtml:about}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getXhtmlAboutAttribute() {
    XhtmlAboutAttribute attr =
        (XhtmlAboutAttribute) getOdfAttribute(OdfDocumentNamespace.XHTML, "about");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>XhtmlAboutAttribute</code> , See
   * {@odf.attribute xhtml:about}
   *
   * @param xhtmlAboutValue The type is <code>String</code>
   */
  public void setXhtmlAboutAttribute(String xhtmlAboutValue) {
    XhtmlAboutAttribute attr = new XhtmlAboutAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(xhtmlAboutValue);
    ((OdfFileDom) this.ownerDocument).updateInContentMetadataCache(this);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>XhtmlContentAttribute</code> ,
   * See {@odf.attribute xhtml:content}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getXhtmlContentAttribute() {
    XhtmlContentAttribute attr =
        (XhtmlContentAttribute) getOdfAttribute(OdfDocumentNamespace.XHTML, "content");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>XhtmlContentAttribute</code> , See
   * {@odf.attribute xhtml:content}
   *
   * @param xhtmlContentValue The type is <code>String</code>
   */
  public void setXhtmlContentAttribute(String xhtmlContentValue) {
    XhtmlContentAttribute attr = new XhtmlContentAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(xhtmlContentValue);
    ((OdfFileDom) this.ownerDocument).updateInContentMetadataCache(this);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>XhtmlDatatypeAttribute</code> ,
   * See {@odf.attribute xhtml:datatype}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getXhtmlDatatypeAttribute() {
    XhtmlDatatypeAttribute attr =
        (XhtmlDatatypeAttribute) getOdfAttribute(OdfDocumentNamespace.XHTML, "datatype");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>XhtmlDatatypeAttribute</code> , See
   * {@odf.attribute xhtml:datatype}
   *
   * @param xhtmlDatatypeValue The type is <code>String</code>
   */
  public void setXhtmlDatatypeAttribute(String xhtmlDatatypeValue) {
    XhtmlDatatypeAttribute attr = new XhtmlDatatypeAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(xhtmlDatatypeValue);
    ((OdfFileDom) this.ownerDocument).updateInContentMetadataCache(this);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>XhtmlPropertyAttribute</code> ,
   * See {@odf.attribute xhtml:property}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getXhtmlPropertyAttribute() {
    XhtmlPropertyAttribute attr =
        (XhtmlPropertyAttribute) getOdfAttribute(OdfDocumentNamespace.XHTML, "property");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>XhtmlPropertyAttribute</code> , See
   * {@odf.attribute xhtml:property}
   *
   * @param xhtmlPropertyValue The type is <code>String</code>
   */
  public void setXhtmlPropertyAttribute(String xhtmlPropertyValue) {
    XhtmlPropertyAttribute attr = new XhtmlPropertyAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(xhtmlPropertyValue);
    ((OdfFileDom) this.ownerDocument).updateInContentMetadataCache(this);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>XmlIdAttribute</code> , See
   * {@odf.attribute xml:id}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getXmlIdAttribute() {
    XmlIdAttribute attr = (XmlIdAttribute) getOdfAttribute(OdfDocumentNamespace.XML, "id");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>XmlIdAttribute</code> , See
   * {@odf.attribute xml:id}
   *
   * @param xmlIdValue The type is <code>String</code>
   */
  public void setXmlIdAttribute(String xmlIdValue) {
    XmlIdAttribute attr = new XmlIdAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(xmlIdValue);
  }
  /** Set text content. Only elements which are allowed to have text content offer this method. */
  public void setTextContent(String content) {
    super.setTextContent(content);
    ((OdfFileDom) this.ownerDocument).updateInContentMetadataCache(this);
  }

  @Override
  public void accept(ElementVisitor visitor) {
    if (visitor instanceof DefaultElementVisitor) {
      DefaultElementVisitor defaultVisitor = (DefaultElementVisitor) visitor;
      defaultVisitor.visit(this);
    } else {
      visitor.visit(this);
    }
  }

  @Override
  protected void onInsertNode() {
    super.onInsertNode();
    ((OdfFileDom) this.ownerDocument).updateInContentMetadataCache(this);
  }
}
