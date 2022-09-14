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
import org.odftoolkit.odfdom.dom.attribute.table.TableMaximumDifferenceAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableStatusAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableStepsAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element table:iteration}.
 *
 */
public class TableIterationElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TABLE, "iteration");

	/**
	 * Create the instance of <code>TableIterationElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableIterationElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:iteration}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableMaximumDifferenceAttribute</code> , See {@odf.attribute table:maximum-difference}
	 *
	 * @return - the <code>Double</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Double getTableMaximumDifferenceAttribute() {
		TableMaximumDifferenceAttribute attr = (TableMaximumDifferenceAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "maximum-difference");
		if (attr != null && !attr.getValue().isEmpty()) {
			return Double.valueOf(attr.doubleValue());
		}
		return Double.valueOf(TableMaximumDifferenceAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableMaximumDifferenceAttribute</code> , See {@odf.attribute table:maximum-difference}
	 *
	 * @param tableMaximumDifferenceValue   The type is <code>Double</code>
	 */
	public void setTableMaximumDifferenceAttribute(Double tableMaximumDifferenceValue) {
		TableMaximumDifferenceAttribute attr = new TableMaximumDifferenceAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setDoubleValue(tableMaximumDifferenceValue.doubleValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableStatusAttribute</code> , See {@odf.attribute table:status}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableStatusAttribute() {
		TableStatusAttribute attr = (TableStatusAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "status");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return TableStatusAttribute.DEFAULT_VALUE;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableStatusAttribute</code> , See {@odf.attribute table:status}
	 *
	 * @param tableStatusValue   The type is <code>String</code>
	 */
	public void setTableStatusAttribute(String tableStatusValue) {
		TableStatusAttribute attr = new TableStatusAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableStatusValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableStepsAttribute</code> , See {@odf.attribute table:steps}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTableStepsAttribute() {
		TableStepsAttribute attr = (TableStepsAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "steps");
		if (attr != null && !attr.getValue().isEmpty()) {
			return Integer.valueOf(attr.intValue());
		}
		return Integer.valueOf(TableStepsAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableStepsAttribute</code> , See {@odf.attribute table:steps}
	 *
	 * @param tableStepsValue   The type is <code>Integer</code>
	 */
	public void setTableStepsAttribute(Integer tableStepsValue) {
		TableStepsAttribute attr = new TableStepsAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(tableStepsValue.intValue());
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
