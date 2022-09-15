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
package org.odftoolkit.odfdom.dom.element.draw;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawArchiveAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawCodeAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawMayScriptAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawObjectAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkActuateAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkHrefAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkShowAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkTypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.xml.XmlIdAttribute;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element draw:applet}. */
public class DrawAppletElement extends OdfElement {

  public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.DRAW, "applet");

  /**
   * Create the instance of <code>DrawAppletElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public DrawAppletElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element draw:applet}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DrawArchiveAttribute</code> ,
   * See {@odf.attribute draw:archive}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDrawArchiveAttribute() {
    DrawArchiveAttribute attr =
        (DrawArchiveAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "archive");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DrawArchiveAttribute</code> , See
   * {@odf.attribute draw:archive}
   *
   * @param drawArchiveValue The type is <code>String</code>
   */
  public void setDrawArchiveAttribute(String drawArchiveValue) {
    DrawArchiveAttribute attr = new DrawArchiveAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(drawArchiveValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DrawCodeAttribute</code> , See
   * {@odf.attribute draw:code}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDrawCodeAttribute() {
    DrawCodeAttribute attr = (DrawCodeAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "code");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DrawCodeAttribute</code> , See
   * {@odf.attribute draw:code}
   *
   * @param drawCodeValue The type is <code>String</code>
   */
  public void setDrawCodeAttribute(String drawCodeValue) {
    DrawCodeAttribute attr = new DrawCodeAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(drawCodeValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DrawMayScriptAttribute</code> ,
   * See {@odf.attribute draw:may-script}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getDrawMayScriptAttribute() {
    DrawMayScriptAttribute attr =
        (DrawMayScriptAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "may-script");
    if (attr != null && !attr.getValue().isEmpty()) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return Boolean.valueOf(DrawMayScriptAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DrawMayScriptAttribute</code> , See
   * {@odf.attribute draw:may-script}
   *
   * @param drawMayScriptValue The type is <code>Boolean</code>
   */
  public void setDrawMayScriptAttribute(Boolean drawMayScriptValue) {
    DrawMayScriptAttribute attr = new DrawMayScriptAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(drawMayScriptValue.booleanValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DrawObjectAttribute</code> ,
   * See {@odf.attribute draw:object}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDrawObjectAttribute() {
    DrawObjectAttribute attr =
        (DrawObjectAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "object");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DrawObjectAttribute</code> , See
   * {@odf.attribute draw:object}
   *
   * @param drawObjectValue The type is <code>String</code>
   */
  public void setDrawObjectAttribute(String drawObjectValue) {
    DrawObjectAttribute attr = new DrawObjectAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(drawObjectValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>XlinkActuateAttribute</code> ,
   * See {@odf.attribute xlink:actuate}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getXlinkActuateAttribute() {
    XlinkActuateAttribute attr =
        (XlinkActuateAttribute) getOdfAttribute(OdfDocumentNamespace.XLINK, "actuate");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return XlinkActuateAttribute.DEFAULT_VALUE_ONLOAD;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>XlinkActuateAttribute</code> , See
   * {@odf.attribute xlink:actuate}
   *
   * @param xlinkActuateValue The type is <code>String</code>
   */
  public void setXlinkActuateAttribute(String xlinkActuateValue) {
    XlinkActuateAttribute attr = new XlinkActuateAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(xlinkActuateValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>XlinkHrefAttribute</code> , See
   * {@odf.attribute xlink:href}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getXlinkHrefAttribute() {
    XlinkHrefAttribute attr =
        (XlinkHrefAttribute) getOdfAttribute(OdfDocumentNamespace.XLINK, "href");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>XlinkHrefAttribute</code> , See
   * {@odf.attribute xlink:href}
   *
   * @param xlinkHrefValue The type is <code>String</code>
   */
  public void setXlinkHrefAttribute(String xlinkHrefValue) {
    XlinkHrefAttribute attr = new XlinkHrefAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(xlinkHrefValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>XlinkShowAttribute</code> , See
   * {@odf.attribute xlink:show}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getXlinkShowAttribute() {
    XlinkShowAttribute attr =
        (XlinkShowAttribute) getOdfAttribute(OdfDocumentNamespace.XLINK, "show");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return XlinkShowAttribute.DEFAULT_VALUE_EMBED;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>XlinkShowAttribute</code> , See
   * {@odf.attribute xlink:show}
   *
   * @param xlinkShowValue The type is <code>String</code>
   */
  public void setXlinkShowAttribute(String xlinkShowValue) {
    XlinkShowAttribute attr = new XlinkShowAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(xlinkShowValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>XlinkTypeAttribute</code> , See
   * {@odf.attribute xlink:type}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getXlinkTypeAttribute() {
    XlinkTypeAttribute attr =
        (XlinkTypeAttribute) getOdfAttribute(OdfDocumentNamespace.XLINK, "type");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return XlinkTypeAttribute.DEFAULT_VALUE;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>XlinkTypeAttribute</code> , See
   * {@odf.attribute xlink:type}
   *
   * @param xlinkTypeValue The type is <code>String</code>
   */
  public void setXlinkTypeAttribute(String xlinkTypeValue) {
    XlinkTypeAttribute attr = new XlinkTypeAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(xlinkTypeValue);
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

  /**
   * Create child element {@odf.element draw:param}.
   *
   * @return the element {@odf.element draw:param}
   */
  public DrawParamElement newDrawParamElement() {
    DrawParamElement drawParam =
        ((OdfFileDom) this.ownerDocument).newOdfElement(DrawParamElement.class);
    this.appendChild(drawParam);
    return drawParam;
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
