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
package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.element.OdfStyleableShapeElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.element.office.OfficeDdeSourceElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeFormsElement;
import org.odftoolkit.odfdom.dom.attribute.table.TableIsSubTableAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TablePrintAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TablePrintRangesAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableProtectedAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableProtectionKeyAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableStyleNameAttribute;
import org.odftoolkit.odfdom.dom.element.OdfStylePropertiesBase;

/**
 * DOM implementation of OpenDocument element  {@odf.element table:table}.
 *
 */
public class TableTableElement extends OdfStylableElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TABLE, "table");

	/**
	 * Create the instance of <code>TableTableElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableTableElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME, OdfStyleFamily.Table, OdfName.newName(OdfDocumentNamespace.TABLE, "style-name"));
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:table}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableIsSubTableAttribute</code> , See {@odf.attribute table:is-sub-table}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableIsSubTableAttribute() {
		TableIsSubTableAttribute attr = (TableIsSubTableAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "is-sub-table");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(TableIsSubTableAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableIsSubTableAttribute</code> , See {@odf.attribute table:is-sub-table}
	 *
	 * @param tableIsSubTableValue   The type is <code>Boolean</code>
	 */
	public void setTableIsSubTableAttribute(Boolean tableIsSubTableValue) {
		TableIsSubTableAttribute attr = new TableIsSubTableAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(tableIsSubTableValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableNameAttribute</code> , See {@odf.attribute table:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableNameAttribute() {
		TableNameAttribute attr = (TableNameAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableNameAttribute</code> , See {@odf.attribute table:name}
	 *
	 * @param tableNameValue   The type is <code>String</code>
	 */
	public void setTableNameAttribute(String tableNameValue) {
		TableNameAttribute attr = new TableNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TablePrintAttribute</code> , See {@odf.attribute table:print}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTablePrintAttribute() {
		TablePrintAttribute attr = (TablePrintAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "print");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(TablePrintAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TablePrintAttribute</code> , See {@odf.attribute table:print}
	 *
	 * @param tablePrintValue   The type is <code>Boolean</code>
	 */
	public void setTablePrintAttribute(Boolean tablePrintValue) {
		TablePrintAttribute attr = new TablePrintAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(tablePrintValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TablePrintRangesAttribute</code> , See {@odf.attribute table:print-ranges}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTablePrintRangesAttribute() {
		TablePrintRangesAttribute attr = (TablePrintRangesAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "print-ranges");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TablePrintRangesAttribute</code> , See {@odf.attribute table:print-ranges}
	 *
	 * @param tablePrintRangesValue   The type is <code>String</code>
	 */
	public void setTablePrintRangesAttribute(String tablePrintRangesValue) {
		TablePrintRangesAttribute attr = new TablePrintRangesAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tablePrintRangesValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableProtectedAttribute</code> , See {@odf.attribute table:protected}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableProtectedAttribute() {
		TableProtectedAttribute attr = (TableProtectedAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "protected");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(TableProtectedAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableProtectedAttribute</code> , See {@odf.attribute table:protected}
	 *
	 * @param tableProtectedValue   The type is <code>Boolean</code>
	 */
	public void setTableProtectedAttribute(Boolean tableProtectedValue) {
		TableProtectedAttribute attr = new TableProtectedAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(tableProtectedValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableProtectionKeyAttribute</code> , See {@odf.attribute table:protection-key}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableProtectionKeyAttribute() {
		TableProtectionKeyAttribute attr = (TableProtectionKeyAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "protection-key");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableProtectionKeyAttribute</code> , See {@odf.attribute table:protection-key}
	 *
	 * @param tableProtectionKeyValue   The type is <code>String</code>
	 */
	public void setTableProtectionKeyAttribute(String tableProtectionKeyValue) {
		TableProtectionKeyAttribute attr = new TableProtectionKeyAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableProtectionKeyValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableStyleNameAttribute</code> , See {@odf.attribute table:style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableStyleNameAttribute() {
		TableStyleNameAttribute attr = (TableStyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "style-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableStyleNameAttribute</code> , See {@odf.attribute table:style-name}
	 *
	 * @param tableStyleNameValue   The type is <code>String</code>
	 */
	public void setTableStyleNameAttribute(String tableStyleNameValue) {
		TableStyleNameAttribute attr = new TableStyleNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableStyleNameValue);
	}

	/**
	 * Create child element {@odf.element office:dde-source}.
	 *
	 * @param officeDdeApplicationValue  the <code>String</code> value of <code>OfficeDdeApplicationAttribute</code>, see {@odf.attribute  office:dde-application} at specification
	 * @param officeDdeItemValue  the <code>String</code> value of <code>OfficeDdeItemAttribute</code>, see {@odf.attribute  office:dde-item} at specification
	 * @param officeDdeTopicValue  the <code>String</code> value of <code>OfficeDdeTopicAttribute</code>, see {@odf.attribute  office:dde-topic} at specification
	 * @return the element {@odf.element office:dde-source}
	 */
	 public OfficeDdeSourceElement newOfficeDdeSourceElement(String officeDdeApplicationValue, String officeDdeItemValue, String officeDdeTopicValue) {
		OfficeDdeSourceElement officeDdeSource = ((OdfFileDom) this.ownerDocument).newOdfElement(OfficeDdeSourceElement.class);
		officeDdeSource.setOfficeDdeApplicationAttribute(officeDdeApplicationValue);
		officeDdeSource.setOfficeDdeItemAttribute(officeDdeItemValue);
		officeDdeSource.setOfficeDdeTopicAttribute(officeDdeTopicValue);
		this.appendChild(officeDdeSource);
		return officeDdeSource;
	}

	/**
	 * Create child element {@odf.element office:forms}.
	 *
	 * @return the element {@odf.element office:forms}
	 */
	public OfficeFormsElement newOfficeFormsElement() {
		OfficeFormsElement officeForms = ((OdfFileDom) this.ownerDocument).newOdfElement(OfficeFormsElement.class);
		this.appendChild(officeForms);
		return officeForms;
	}

	/**
	 * Create child element {@odf.element table:scenario}.
	 *
	 * @param tableIsActiveValue  the <code>Boolean</code> value of <code>TableIsActiveAttribute</code>, see {@odf.attribute  table:is-active} at specification
	 * @param tableScenarioRangesValue  the <code>String</code> value of <code>TableScenarioRangesAttribute</code>, see {@odf.attribute  table:scenario-ranges} at specification
	 * @return the element {@odf.element table:scenario}
	 */
	 public TableScenarioElement newTableScenarioElement(boolean tableIsActiveValue, String tableScenarioRangesValue) {
		TableScenarioElement tableScenario = ((OdfFileDom) this.ownerDocument).newOdfElement(TableScenarioElement.class);
		tableScenario.setTableIsActiveAttribute(tableIsActiveValue);
		tableScenario.setTableScenarioRangesAttribute(tableScenarioRangesValue);
		this.appendChild(tableScenario);
		return tableScenario;
	}

	/**
	 * Create child element {@odf.element table:shapes}.
	 *
	 * @return the element {@odf.element table:shapes}
	 */
	public TableShapesElement newTableShapesElement() {
		TableShapesElement tableShapes = ((OdfFileDom) this.ownerDocument).newOdfElement(TableShapesElement.class);
		this.appendChild(tableShapes);
		return tableShapes;
	}

	/**
	 * Create child element {@odf.element table:table-column}.
	 *
	 * @return the element {@odf.element table:table-column}
	 */
	public TableTableColumnElement newTableTableColumnElement() {
		TableTableColumnElement tableTableColumn = ((OdfFileDom) this.ownerDocument).newOdfElement(TableTableColumnElement.class);
		this.appendChild(tableTableColumn);
		return tableTableColumn;
	}

	/**
	 * Create child element {@odf.element table:table-column-group}.
	 *
	 * @return the element {@odf.element table:table-column-group}
	 */
	public TableTableColumnGroupElement newTableTableColumnGroupElement() {
		TableTableColumnGroupElement tableTableColumnGroup = ((OdfFileDom) this.ownerDocument).newOdfElement(TableTableColumnGroupElement.class);
		this.appendChild(tableTableColumnGroup);
		return tableTableColumnGroup;
	}

	/**
	 * Create child element {@odf.element table:table-columns}.
	 *
	 * @return the element {@odf.element table:table-columns}
	 */
	public TableTableColumnsElement newTableTableColumnsElement() {
		TableTableColumnsElement tableTableColumns = ((OdfFileDom) this.ownerDocument).newOdfElement(TableTableColumnsElement.class);
		this.appendChild(tableTableColumns);
		return tableTableColumns;
	}

	/**
	 * Create child element {@odf.element table:table-header-columns}.
	 *
	 * @return the element {@odf.element table:table-header-columns}
	 */
	public TableTableHeaderColumnsElement newTableTableHeaderColumnsElement() {
		TableTableHeaderColumnsElement tableTableHeaderColumns = ((OdfFileDom) this.ownerDocument).newOdfElement(TableTableHeaderColumnsElement.class);
		this.appendChild(tableTableHeaderColumns);
		return tableTableHeaderColumns;
	}

	/**
	 * Create child element {@odf.element table:table-header-rows}.
	 *
	 * @return the element {@odf.element table:table-header-rows}
	 */
	public TableTableHeaderRowsElement newTableTableHeaderRowsElement() {
		TableTableHeaderRowsElement tableTableHeaderRows = ((OdfFileDom) this.ownerDocument).newOdfElement(TableTableHeaderRowsElement.class);
		this.appendChild(tableTableHeaderRows);
		return tableTableHeaderRows;
	}

	/**
	 * Create child element {@odf.element table:table-row}.
	 *
	 * @return the element {@odf.element table:table-row}
	 */
	public TableTableRowElement newTableTableRowElement() {
		TableTableRowElement tableTableRow = ((OdfFileDom) this.ownerDocument).newOdfElement(TableTableRowElement.class);
		this.appendChild(tableTableRow);
		return tableTableRow;
	}

	/**
	 * Create child element {@odf.element table:table-row-group}.
	 *
	 * @return the element {@odf.element table:table-row-group}
	 */
	public TableTableRowGroupElement newTableTableRowGroupElement() {
		TableTableRowGroupElement tableTableRowGroup = ((OdfFileDom) this.ownerDocument).newOdfElement(TableTableRowGroupElement.class);
		this.appendChild(tableTableRowGroup);
		return tableTableRowGroup;
	}

	/**
	 * Create child element {@odf.element table:table-rows}.
	 *
	 * @return the element {@odf.element table:table-rows}
	 */
	public TableTableRowsElement newTableTableRowsElement() {
		TableTableRowsElement tableTableRows = ((OdfFileDom) this.ownerDocument).newOdfElement(TableTableRowsElement.class);
		this.appendChild(tableTableRows);
		return tableTableRows;
	}

	/**
	 * Create child element {@odf.element table:table-source}.
	 *
	 * @param xlinkHrefValue  the <code>String</code> value of <code>XlinkHrefAttribute</code>, see {@odf.attribute  xlink:href} at specification
	 * @return the element {@odf.element table:table-source}
	 */
	 public TableTableSourceElement newTableTableSourceElement(String xlinkHrefValue) {
		TableTableSourceElement tableTableSource = ((OdfFileDom) this.ownerDocument).newOdfElement(TableTableSourceElement.class);
		tableTableSource.setXlinkHrefAttribute(xlinkHrefValue);
		this.appendChild(tableTableSource);
		return tableTableSource;
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
