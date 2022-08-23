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
import org.odftoolkit.odfdom.dom.attribute.table.TableNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableObjectNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TablePasswordAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableSourceNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableUserNameAttribute;
import org.odftoolkit.odfdom.dom.element.OdfStylePropertiesBase;

/**
 * DOM implementation of OpenDocument element  {@odf.element table:source-service}.
 *
 */
public class TableSourceServiceElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TABLE, "source-service");

	/**
	 * Create the instance of <code>TableSourceServiceElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableSourceServiceElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:source-service}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableNameAttribute</code> , See {@odf.attribute table:name}
	 *
	 * Attribute is mandatory.
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
	 * Receives the value of the ODFDOM attribute representation <code>TableObjectNameAttribute</code> , See {@odf.attribute table:object-name}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableObjectNameAttribute() {
		TableObjectNameAttribute attr = (TableObjectNameAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "object-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableObjectNameAttribute</code> , See {@odf.attribute table:object-name}
	 *
	 * @param tableObjectNameValue   The type is <code>String</code>
	 */
	public void setTableObjectNameAttribute(String tableObjectNameValue) {
		TableObjectNameAttribute attr = new TableObjectNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableObjectNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TablePasswordAttribute</code> , See {@odf.attribute table:password}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTablePasswordAttribute() {
		TablePasswordAttribute attr = (TablePasswordAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "password");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TablePasswordAttribute</code> , See {@odf.attribute table:password}
	 *
	 * @param tablePasswordValue   The type is <code>String</code>
	 */
	public void setTablePasswordAttribute(String tablePasswordValue) {
		TablePasswordAttribute attr = new TablePasswordAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tablePasswordValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableSourceNameAttribute</code> , See {@odf.attribute table:source-name}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableSourceNameAttribute() {
		TableSourceNameAttribute attr = (TableSourceNameAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "source-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableSourceNameAttribute</code> , See {@odf.attribute table:source-name}
	 *
	 * @param tableSourceNameValue   The type is <code>String</code>
	 */
	public void setTableSourceNameAttribute(String tableSourceNameValue) {
		TableSourceNameAttribute attr = new TableSourceNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableSourceNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableUserNameAttribute</code> , See {@odf.attribute table:user-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableUserNameAttribute() {
		TableUserNameAttribute attr = (TableUserNameAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "user-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableUserNameAttribute</code> , See {@odf.attribute table:user-name}
	 *
	 * @param tableUserNameValue   The type is <code>String</code>
	 */
	public void setTableUserNameAttribute(String tableUserNameValue) {
		TableUserNameAttribute attr = new TableUserNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableUserNameValue);
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
