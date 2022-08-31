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

/**
 * DOM implementation of OpenDocument element  {@odf.element table:cut-offs}.
 *
 */
public class TableCutOffsElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TABLE, "cut-offs");

	/**
	 * Create the instance of <code>TableCutOffsElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableCutOffsElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:cut-offs}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Create child element {@odf.element table:insertion-cut-off}.
	 *
	 * @param tableIdValue  the <code>String</code> value of <code>TableIdAttribute</code>, see {@odf.attribute  table:id} at specification
	 * @param tablePositionValue  the <code>Integer</code> value of <code>TablePositionAttribute</code>, see {@odf.attribute  table:position} at specification
	 * @return the element {@odf.element table:insertion-cut-off}
	 */
	 public TableInsertionCutOffElement newTableInsertionCutOffElement(String tableIdValue, int tablePositionValue) {
		TableInsertionCutOffElement tableInsertionCutOff = ((OdfFileDom) this.ownerDocument).newOdfElement(TableInsertionCutOffElement.class);
		tableInsertionCutOff.setTableIdAttribute(tableIdValue);
		tableInsertionCutOff.setTablePositionAttribute(tablePositionValue);
		this.appendChild(tableInsertionCutOff);
		return tableInsertionCutOff;
	}

	/**
	 * Create child element {@odf.element table:movement-cut-off}.
	 *
	 * @return the element {@odf.element table:movement-cut-off}
	 */
	public TableMovementCutOffElement newTableMovementCutOffElement() {
		TableMovementCutOffElement tableMovementCutOff = ((OdfFileDom) this.ownerDocument).newOdfElement(TableMovementCutOffElement.class);
		this.appendChild(tableMovementCutOff);
		return tableMovementCutOff;
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
