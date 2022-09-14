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

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.table.TableFunctionAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableIsDataLayoutFieldAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableOrientationAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableSelectedPageAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableSourceFieldNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableUsedHierarchyAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element table:data-pilot-field}.
 *
 */
public class TableDataPilotFieldElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TABLE, "data-pilot-field");

	/**
	 * Create the instance of <code>TableDataPilotFieldElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableDataPilotFieldElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:data-pilot-field}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableFunctionAttribute</code> , See {@odf.attribute table:function}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableFunctionAttribute() {
		TableFunctionAttribute attr = (TableFunctionAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "function");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableFunctionAttribute</code> , See {@odf.attribute table:function}
	 *
	 * @param tableFunctionValue   The type is <code>String</code>
	 */
	public void setTableFunctionAttribute(String tableFunctionValue) {
		TableFunctionAttribute attr = new TableFunctionAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableFunctionValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableIsDataLayoutFieldAttribute</code> , See {@odf.attribute table:is-data-layout-field}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableIsDataLayoutFieldAttribute() {
		TableIsDataLayoutFieldAttribute attr = (TableIsDataLayoutFieldAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "is-data-layout-field");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return TableIsDataLayoutFieldAttribute.DEFAULT_VALUE;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableIsDataLayoutFieldAttribute</code> , See {@odf.attribute table:is-data-layout-field}
	 *
	 * @param tableIsDataLayoutFieldValue   The type is <code>String</code>
	 */
	public void setTableIsDataLayoutFieldAttribute(String tableIsDataLayoutFieldValue) {
		TableIsDataLayoutFieldAttribute attr = new TableIsDataLayoutFieldAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableIsDataLayoutFieldValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableOrientationAttribute</code> , See {@odf.attribute table:orientation}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableOrientationAttribute() {
		TableOrientationAttribute attr = (TableOrientationAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "orientation");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableOrientationAttribute</code> , See {@odf.attribute table:orientation}
	 *
	 * @param tableOrientationValue   The type is <code>String</code>
	 */
	public void setTableOrientationAttribute(String tableOrientationValue) {
		TableOrientationAttribute attr = new TableOrientationAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableOrientationValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableSelectedPageAttribute</code> , See {@odf.attribute table:selected-page}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableSelectedPageAttribute() {
		TableSelectedPageAttribute attr = (TableSelectedPageAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "selected-page");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableSelectedPageAttribute</code> , See {@odf.attribute table:selected-page}
	 *
	 * @param tableSelectedPageValue   The type is <code>String</code>
	 */
	public void setTableSelectedPageAttribute(String tableSelectedPageValue) {
		TableSelectedPageAttribute attr = new TableSelectedPageAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableSelectedPageValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableSourceFieldNameAttribute</code> , See {@odf.attribute table:source-field-name}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableSourceFieldNameAttribute() {
		TableSourceFieldNameAttribute attr = (TableSourceFieldNameAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "source-field-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableSourceFieldNameAttribute</code> , See {@odf.attribute table:source-field-name}
	 *
	 * @param tableSourceFieldNameValue   The type is <code>String</code>
	 */
	public void setTableSourceFieldNameAttribute(String tableSourceFieldNameValue) {
		TableSourceFieldNameAttribute attr = new TableSourceFieldNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableSourceFieldNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableUsedHierarchyAttribute</code> , See {@odf.attribute table:used-hierarchy}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTableUsedHierarchyAttribute() {
		TableUsedHierarchyAttribute attr = (TableUsedHierarchyAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "used-hierarchy");
		if (attr != null && !attr.getValue().isEmpty()) {
			return Integer.valueOf(attr.intValue());
		}
		return Integer.valueOf(TableUsedHierarchyAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableUsedHierarchyAttribute</code> , See {@odf.attribute table:used-hierarchy}
	 *
	 * @param tableUsedHierarchyValue   The type is <code>Integer</code>
	 */
	public void setTableUsedHierarchyAttribute(Integer tableUsedHierarchyValue) {
		TableUsedHierarchyAttribute attr = new TableUsedHierarchyAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(tableUsedHierarchyValue.intValue());
	}

	/**
	 * Create child element {@odf.element table:data-pilot-field-reference}.
	 *
	 * @param tableFieldNameValue  the <code>String</code> value of <code>TableFieldNameAttribute</code>, see {@odf.attribute  table:field-name} at specification
	 * @param tableMemberTypeValue  the <code>String</code> value of <code>TableMemberTypeAttribute</code>, see {@odf.attribute  table:member-type} at specification
	 * @param tableTypeValue  the <code>String</code> value of <code>TableTypeAttribute</code>, see {@odf.attribute  table:type} at specification
	 * @return the element {@odf.element table:data-pilot-field-reference}
	 */
	 public TableDataPilotFieldReferenceElement newTableDataPilotFieldReferenceElement(String tableFieldNameValue, String tableMemberTypeValue, String tableTypeValue) {
		TableDataPilotFieldReferenceElement tableDataPilotFieldReference = ((OdfFileDom) this.ownerDocument).newOdfElement(TableDataPilotFieldReferenceElement.class);
		tableDataPilotFieldReference.setTableFieldNameAttribute(tableFieldNameValue);
		tableDataPilotFieldReference.setTableMemberTypeAttribute(tableMemberTypeValue);
		tableDataPilotFieldReference.setTableTypeAttribute(tableTypeValue);
		this.appendChild(tableDataPilotFieldReference);
		return tableDataPilotFieldReference;
	}

	/**
	 * Create child element {@odf.element table:data-pilot-groups}.
	 *
	 * @param tableGroupedByValue  the <code>String</code> value of <code>TableGroupedByAttribute</code>, see {@odf.attribute  table:grouped-by} at specification
	 * @param tableSourceFieldNameValue  the <code>String</code> value of <code>TableSourceFieldNameAttribute</code>, see {@odf.attribute  table:source-field-name} at specification
	 * @param tableStepValue  the <code>Double</code> value of <code>TableStepAttribute</code>, see {@odf.attribute  table:step} at specification
	 * @return the element {@odf.element table:data-pilot-groups}
	 */
	 public TableDataPilotGroupsElement newTableDataPilotGroupsElement(String tableGroupedByValue, String tableSourceFieldNameValue, double tableStepValue) {
		TableDataPilotGroupsElement tableDataPilotGroups = ((OdfFileDom) this.ownerDocument).newOdfElement(TableDataPilotGroupsElement.class);
		tableDataPilotGroups.setTableGroupedByAttribute(tableGroupedByValue);
		tableDataPilotGroups.setTableSourceFieldNameAttribute(tableSourceFieldNameValue);
		tableDataPilotGroups.setTableStepAttribute(tableStepValue);
		this.appendChild(tableDataPilotGroups);
		return tableDataPilotGroups;
	}

	/**
	 * Create child element {@odf.element table:data-pilot-level}.
	 *
	 * @return the element {@odf.element table:data-pilot-level}
	 */
	public TableDataPilotLevelElement newTableDataPilotLevelElement() {
		TableDataPilotLevelElement tableDataPilotLevel = ((OdfFileDom) this.ownerDocument).newOdfElement(TableDataPilotLevelElement.class);
		this.appendChild(tableDataPilotLevel);
		return tableDataPilotLevel;
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
