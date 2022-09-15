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
package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.table.TableCaseSensitiveAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableDataTypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableFieldNumberAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableOperatorAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableValueAttribute;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element table:filter-condition}. */
public class TableFilterConditionElement extends OdfElement {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.TABLE, "filter-condition");

  /**
   * Create the instance of <code>TableFilterConditionElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public TableFilterConditionElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element table:filter-condition}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TableCaseSensitiveAttribute
   * </code> , See {@odf.attribute table:case-sensitive}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTableCaseSensitiveAttribute() {
    TableCaseSensitiveAttribute attr =
        (TableCaseSensitiveAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "case-sensitive");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return TableCaseSensitiveAttribute.DEFAULT_VALUE_FALSE;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TableCaseSensitiveAttribute</code> ,
   * See {@odf.attribute table:case-sensitive}
   *
   * @param tableCaseSensitiveValue The type is <code>String</code>
   */
  public void setTableCaseSensitiveAttribute(String tableCaseSensitiveValue) {
    TableCaseSensitiveAttribute attr =
        new TableCaseSensitiveAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(tableCaseSensitiveValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TableDataTypeAttribute</code> ,
   * See {@odf.attribute table:data-type}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTableDataTypeAttribute() {
    TableDataTypeAttribute attr =
        (TableDataTypeAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "data-type");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return TableDataTypeAttribute.DEFAULT_VALUE_TEXT;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TableDataTypeAttribute</code> , See
   * {@odf.attribute table:data-type}
   *
   * @param tableDataTypeValue The type is <code>String</code>
   */
  public void setTableDataTypeAttribute(String tableDataTypeValue) {
    TableDataTypeAttribute attr = new TableDataTypeAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(tableDataTypeValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TableFieldNumberAttribute
   * </code> , See {@odf.attribute table:field-number}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Integer getTableFieldNumberAttribute() {
    TableFieldNumberAttribute attr =
        (TableFieldNumberAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "field-number");
    if (attr != null && !attr.getValue().isEmpty()) {
      return Integer.valueOf(attr.intValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TableFieldNumberAttribute</code> , See
   * {@odf.attribute table:field-number}
   *
   * @param tableFieldNumberValue The type is <code>Integer</code>
   */
  public void setTableFieldNumberAttribute(Integer tableFieldNumberValue) {
    TableFieldNumberAttribute attr = new TableFieldNumberAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setIntValue(tableFieldNumberValue.intValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TableOperatorAttribute</code> ,
   * See {@odf.attribute table:operator}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTableOperatorAttribute() {
    TableOperatorAttribute attr =
        (TableOperatorAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "operator");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TableOperatorAttribute</code> , See
   * {@odf.attribute table:operator}
   *
   * @param tableOperatorValue The type is <code>String</code>
   */
  public void setTableOperatorAttribute(String tableOperatorValue) {
    TableOperatorAttribute attr = new TableOperatorAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(tableOperatorValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TableValueAttribute</code> ,
   * See {@odf.attribute table:value}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTableValueAttribute() {
    TableValueAttribute attr =
        (TableValueAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "value");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TableValueAttribute</code> , See
   * {@odf.attribute table:value}
   *
   * @param tableValueValue The type is <code>String</code>
   */
  public void setTableValueAttribute(String tableValueValue) {
    TableValueAttribute attr = new TableValueAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(tableValueValue);
  }

  /**
   * Create child element {@odf.element table:filter-set-item}.
   *
   * @param tableValueValue the <code>String</code> value of <code>TableValueAttribute</code>, see
   *     {@odf.attribute table:value} at specification Child element was added in ODF 1.2
   * @return the element {@odf.element table:filter-set-item}
   */
  public TableFilterSetItemElement newTableFilterSetItemElement(String tableValueValue) {
    TableFilterSetItemElement tableFilterSetItem =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TableFilterSetItemElement.class);
    tableFilterSetItem.setTableValueAttribute(tableValueValue);
    this.appendChild(tableFilterSetItem);
    return tableFilterSetItem;
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
