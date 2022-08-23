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
import org.odftoolkit.odfdom.dom.attribute.table.TableBorderColorAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableCommentAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableCopyBackAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableCopyFormulasAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableCopyStylesAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableDisplayBorderAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableIsActiveAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableProtectedAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableScenarioRangesAttribute;
import org.odftoolkit.odfdom.dom.element.OdfStylePropertiesBase;

/**
 * DOM implementation of OpenDocument element  {@odf.element table:scenario}.
 *
 */
public class TableScenarioElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TABLE, "scenario");

	/**
	 * Create the instance of <code>TableScenarioElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableScenarioElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:scenario}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableBorderColorAttribute</code> , See {@odf.attribute table:border-color}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableBorderColorAttribute() {
		TableBorderColorAttribute attr = (TableBorderColorAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "border-color");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableBorderColorAttribute</code> , See {@odf.attribute table:border-color}
	 *
	 * @param tableBorderColorValue   The type is <code>String</code>
	 */
	public void setTableBorderColorAttribute(String tableBorderColorValue) {
		TableBorderColorAttribute attr = new TableBorderColorAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableBorderColorValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableCommentAttribute</code> , See {@odf.attribute table:comment}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableCommentAttribute() {
		TableCommentAttribute attr = (TableCommentAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "comment");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableCommentAttribute</code> , See {@odf.attribute table:comment}
	 *
	 * @param tableCommentValue   The type is <code>String</code>
	 */
	public void setTableCommentAttribute(String tableCommentValue) {
		TableCommentAttribute attr = new TableCommentAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableCommentValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableCopyBackAttribute</code> , See {@odf.attribute table:copy-back}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableCopyBackAttribute() {
		TableCopyBackAttribute attr = (TableCopyBackAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "copy-back");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(TableCopyBackAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableCopyBackAttribute</code> , See {@odf.attribute table:copy-back}
	 *
	 * @param tableCopyBackValue   The type is <code>Boolean</code>
	 */
	public void setTableCopyBackAttribute(Boolean tableCopyBackValue) {
		TableCopyBackAttribute attr = new TableCopyBackAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(tableCopyBackValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableCopyFormulasAttribute</code> , See {@odf.attribute table:copy-formulas}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableCopyFormulasAttribute() {
		TableCopyFormulasAttribute attr = (TableCopyFormulasAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "copy-formulas");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(TableCopyFormulasAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableCopyFormulasAttribute</code> , See {@odf.attribute table:copy-formulas}
	 *
	 * @param tableCopyFormulasValue   The type is <code>Boolean</code>
	 */
	public void setTableCopyFormulasAttribute(Boolean tableCopyFormulasValue) {
		TableCopyFormulasAttribute attr = new TableCopyFormulasAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(tableCopyFormulasValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableCopyStylesAttribute</code> , See {@odf.attribute table:copy-styles}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableCopyStylesAttribute() {
		TableCopyStylesAttribute attr = (TableCopyStylesAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "copy-styles");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(TableCopyStylesAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableCopyStylesAttribute</code> , See {@odf.attribute table:copy-styles}
	 *
	 * @param tableCopyStylesValue   The type is <code>Boolean</code>
	 */
	public void setTableCopyStylesAttribute(Boolean tableCopyStylesValue) {
		TableCopyStylesAttribute attr = new TableCopyStylesAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(tableCopyStylesValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableDisplayBorderAttribute</code> , See {@odf.attribute table:display-border}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableDisplayBorderAttribute() {
		TableDisplayBorderAttribute attr = (TableDisplayBorderAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "display-border");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(TableDisplayBorderAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableDisplayBorderAttribute</code> , See {@odf.attribute table:display-border}
	 *
	 * @param tableDisplayBorderValue   The type is <code>Boolean</code>
	 */
	public void setTableDisplayBorderAttribute(Boolean tableDisplayBorderValue) {
		TableDisplayBorderAttribute attr = new TableDisplayBorderAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(tableDisplayBorderValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableIsActiveAttribute</code> , See {@odf.attribute table:is-active}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableIsActiveAttribute() {
		TableIsActiveAttribute attr = (TableIsActiveAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "is-active");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableIsActiveAttribute</code> , See {@odf.attribute table:is-active}
	 *
	 * @param tableIsActiveValue   The type is <code>Boolean</code>
	 */
	public void setTableIsActiveAttribute(Boolean tableIsActiveValue) {
		TableIsActiveAttribute attr = new TableIsActiveAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(tableIsActiveValue.booleanValue());
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
		return null;
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
	 * Receives the value of the ODFDOM attribute representation <code>TableScenarioRangesAttribute</code> , See {@odf.attribute table:scenario-ranges}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableScenarioRangesAttribute() {
		TableScenarioRangesAttribute attr = (TableScenarioRangesAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "scenario-ranges");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableScenarioRangesAttribute</code> , See {@odf.attribute table:scenario-ranges}
	 *
	 * @param tableScenarioRangesValue   The type is <code>String</code>
	 */
	public void setTableScenarioRangesAttribute(String tableScenarioRangesValue) {
		TableScenarioRangesAttribute attr = new TableScenarioRangesAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableScenarioRangesValue);
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
