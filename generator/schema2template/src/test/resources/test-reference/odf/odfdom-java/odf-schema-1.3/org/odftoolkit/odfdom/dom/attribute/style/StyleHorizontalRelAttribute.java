
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
package org.odftoolkit.odfdom.dom.attribute.style;

import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.pkg.OdfAttribute;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/**
 * DOM implementation of OpenDocument attribute  {@odf.attribute style:horizontal-rel}.
 *
 */
public class StyleHorizontalRelAttribute extends OdfAttribute {

public static final OdfName ATTRIBUTE_NAME = OdfName.newName(OdfDocumentNamespace.STYLE, "horizontal-rel");


	/**
	 * Create the instance of OpenDocument attribute {@odf.attribute style:horizontal-rel}.
	 *
	 * @param ownerDocument       The type is <code>OdfFileDom</code>
	 */
	public StyleHorizontalRelAttribute(OdfFileDom ownerDocument) {
		super(ownerDocument, ATTRIBUTE_NAME);
	}

	/**
	 * Returns the attribute name.
	 *
	 * @return the <code>OdfName</code> for {@odf.attribute style:horizontal-rel}.
	 */
	@Override
	public OdfName getOdfName() {
		return ATTRIBUTE_NAME;
	}

	/**
	 * @return Returns the name of this attribute.
	 */
	@Override
	public String getName() {
		return ATTRIBUTE_NAME.getLocalName();
	}

	/**
	 * The value set of {@odf.attribute style:horizontal-rel}.
	 */
	public enum Value {
		CHAR("char"), FRAME("frame"), FRAME_CONTENT("frame-content"), FRAME_END_MARGIN("frame-end-margin"), FRAME_START_MARGIN("frame-start-margin"), PAGE("page"), PAGE_CONTENT("page-content"), PAGE_END_MARGIN("page-end-margin"), PAGE_START_MARGIN("page-start-margin"), PARAGRAPH("paragraph"), PARAGRAPH_CONTENT("paragraph-content"), PARAGRAPH_END_MARGIN("paragraph-end-margin"), PARAGRAPH_START_MARGIN("paragraph-start-margin");

		private String mValue;

		Value(String value) {
			mValue = value;
		}

		@Override
		public String toString() {
			return mValue;
		}

		public static Value enumValueOf(String value) {
			for(Value aIter : values()) {
				if (value.equals(aIter.toString())) {
				return aIter;
				}
			}
			return null;
		}
	}

	/**
	 * @param attrValue The <code>Enum</code> value of the attribute.
	 */
	public void setEnumValue(Value attrValue) {
		setValue(attrValue.toString());
	}

	/**
	 * @return Returns the <code>Enum</code> value of the attribute
	 */
	public Value getEnumValue() {
		return Value.enumValueOf(this.getValue());
	}

	/**
	 * Returns the default value of {@odf.attribute style:horizontal-rel}.
	 *
	 * @return the default value as <code>String</code> dependent of its element name
	 *         return <code>null</code> if the default value does not exist
	 */
	@Override
	public String getDefault() {
		return null;
	}

	/**
	 * Default value indicator. As the attribute default value is dependent from its element, the attribute has only a default, when a parent element exists.
	 *
	 * @return <code>true</code> if {@odf.attribute style:horizontal-rel} has an element parent
	 *         otherwise return <code>false</code> as undefined.
	 */
	@Override
	public boolean hasDefault() {
		return false;
	}

	/**
	 * @return Returns whether this attribute is known to be of type ID (i.e. xml:id ?)
	 */
	@Override
	public boolean isId() {
		return false;
	}
}
