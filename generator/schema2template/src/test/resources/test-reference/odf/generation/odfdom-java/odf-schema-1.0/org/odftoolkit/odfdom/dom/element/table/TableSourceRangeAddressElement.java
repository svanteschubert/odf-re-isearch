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
import org.odftoolkit.odfdom.dom.attribute.table.TableColumnAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableEndColumnAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableEndRowAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableEndTableAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableRowAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableStartColumnAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableStartRowAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableStartTableAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableTableAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element table:source-range-address}.
 *
 */
public class TableSourceRangeAddressElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TABLE, "source-range-address");

	/**
	 * Create the instance of <code>TableSourceRangeAddressElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableSourceRangeAddressElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:source-range-address}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableColumnAttribute</code> , See {@odf.attribute table:column}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTableColumnAttribute() {
		TableColumnAttribute attr = (TableColumnAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "column");
		if (attr != null && !attr.getValue().isEmpty()) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableColumnAttribute</code> , See {@odf.attribute table:column}
	 *
	 * @param tableColumnValue   The type is <code>Integer</code>
	 */
	public void setTableColumnAttribute(Integer tableColumnValue) {
		TableColumnAttribute attr = new TableColumnAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(tableColumnValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableEndColumnAttribute</code> , See {@odf.attribute table:end-column}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTableEndColumnAttribute() {
		TableEndColumnAttribute attr = (TableEndColumnAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "end-column");
		if (attr != null && !attr.getValue().isEmpty()) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableEndColumnAttribute</code> , See {@odf.attribute table:end-column}
	 *
	 * @param tableEndColumnValue   The type is <code>Integer</code>
	 */
	public void setTableEndColumnAttribute(Integer tableEndColumnValue) {
		TableEndColumnAttribute attr = new TableEndColumnAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(tableEndColumnValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableEndRowAttribute</code> , See {@odf.attribute table:end-row}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTableEndRowAttribute() {
		TableEndRowAttribute attr = (TableEndRowAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "end-row");
		if (attr != null && !attr.getValue().isEmpty()) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableEndRowAttribute</code> , See {@odf.attribute table:end-row}
	 *
	 * @param tableEndRowValue   The type is <code>Integer</code>
	 */
	public void setTableEndRowAttribute(Integer tableEndRowValue) {
		TableEndRowAttribute attr = new TableEndRowAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(tableEndRowValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableEndTableAttribute</code> , See {@odf.attribute table:end-table}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTableEndTableAttribute() {
		TableEndTableAttribute attr = (TableEndTableAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "end-table");
		if (attr != null && !attr.getValue().isEmpty()) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableEndTableAttribute</code> , See {@odf.attribute table:end-table}
	 *
	 * @param tableEndTableValue   The type is <code>Integer</code>
	 */
	public void setTableEndTableAttribute(Integer tableEndTableValue) {
		TableEndTableAttribute attr = new TableEndTableAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(tableEndTableValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableRowAttribute</code> , See {@odf.attribute table:row}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTableRowAttribute() {
		TableRowAttribute attr = (TableRowAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "row");
		if (attr != null && !attr.getValue().isEmpty()) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableRowAttribute</code> , See {@odf.attribute table:row}
	 *
	 * @param tableRowValue   The type is <code>Integer</code>
	 */
	public void setTableRowAttribute(Integer tableRowValue) {
		TableRowAttribute attr = new TableRowAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(tableRowValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableStartColumnAttribute</code> , See {@odf.attribute table:start-column}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTableStartColumnAttribute() {
		TableStartColumnAttribute attr = (TableStartColumnAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "start-column");
		if (attr != null && !attr.getValue().isEmpty()) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableStartColumnAttribute</code> , See {@odf.attribute table:start-column}
	 *
	 * @param tableStartColumnValue   The type is <code>Integer</code>
	 */
	public void setTableStartColumnAttribute(Integer tableStartColumnValue) {
		TableStartColumnAttribute attr = new TableStartColumnAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(tableStartColumnValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableStartRowAttribute</code> , See {@odf.attribute table:start-row}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTableStartRowAttribute() {
		TableStartRowAttribute attr = (TableStartRowAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "start-row");
		if (attr != null && !attr.getValue().isEmpty()) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableStartRowAttribute</code> , See {@odf.attribute table:start-row}
	 *
	 * @param tableStartRowValue   The type is <code>Integer</code>
	 */
	public void setTableStartRowAttribute(Integer tableStartRowValue) {
		TableStartRowAttribute attr = new TableStartRowAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(tableStartRowValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableStartTableAttribute</code> , See {@odf.attribute table:start-table}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTableStartTableAttribute() {
		TableStartTableAttribute attr = (TableStartTableAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "start-table");
		if (attr != null && !attr.getValue().isEmpty()) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableStartTableAttribute</code> , See {@odf.attribute table:start-table}
	 *
	 * @param tableStartTableValue   The type is <code>Integer</code>
	 */
	public void setTableStartTableAttribute(Integer tableStartTableValue) {
		TableStartTableAttribute attr = new TableStartTableAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(tableStartTableValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableTableAttribute</code> , See {@odf.attribute table:table}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTableTableAttribute() {
		TableTableAttribute attr = (TableTableAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "table");
		if (attr != null && !attr.getValue().isEmpty()) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableTableAttribute</code> , See {@odf.attribute table:table}
	 *
	 * @param tableTableValue   The type is <code>Integer</code>
	 */
	public void setTableTableAttribute(Integer tableTableValue) {
		TableTableAttribute attr = new TableTableAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(tableTableValue.intValue());
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
