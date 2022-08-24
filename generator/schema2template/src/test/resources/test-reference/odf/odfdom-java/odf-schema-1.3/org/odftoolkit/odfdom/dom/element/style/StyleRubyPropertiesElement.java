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
package org.odftoolkit.odfdom.dom.element.style;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.style.props.OdfStyleProperty;
import org.odftoolkit.odfdom.dom.style.props.OdfStylePropertiesSet;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.style.StyleRubyAlignAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleRubyPositionAttribute;
import org.odftoolkit.odfdom.dom.element.OdfStylePropertiesBase;

/**
 * DOM implementation of OpenDocument element  {@odf.element style:ruby-properties}.
 *
 */
public class StyleRubyPropertiesElement extends OdfStylePropertiesBase {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.STYLE, "ruby-properties");

	/**
	 * Create the instance of <code>StyleRubyPropertiesElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public StyleRubyPropertiesElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element style:ruby-properties}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	public final static OdfStyleProperty RubyAlign =
		OdfStyleProperty.get(OdfStylePropertiesSet.RubyProperties, OdfName.newName(OdfDocumentNamespace.STYLE, "ruby-align"));

	public final static OdfStyleProperty RubyPosition =
		OdfStyleProperty.get(OdfStylePropertiesSet.RubyProperties, OdfName.newName(OdfDocumentNamespace.STYLE, "ruby-position"));

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleRubyAlignAttribute</code> , See {@odf.attribute style:ruby-align}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleRubyAlignAttribute() {
		StyleRubyAlignAttribute attr = (StyleRubyAlignAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "ruby-align");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleRubyAlignAttribute</code> , See {@odf.attribute style:ruby-align}
	 *
	 * @param styleRubyAlignValue   The type is <code>String</code>
	 */
	public void setStyleRubyAlignAttribute(String styleRubyAlignValue) {
		StyleRubyAlignAttribute attr = new StyleRubyAlignAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(styleRubyAlignValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleRubyPositionAttribute</code> , See {@odf.attribute style:ruby-position}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleRubyPositionAttribute() {
		StyleRubyPositionAttribute attr = (StyleRubyPositionAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "ruby-position");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleRubyPositionAttribute</code> , See {@odf.attribute style:ruby-position}
	 *
	 * @param styleRubyPositionValue   The type is <code>String</code>
	 */
	public void setStyleRubyPositionAttribute(String styleRubyPositionValue) {
		StyleRubyPositionAttribute attr = new StyleRubyPositionAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(styleRubyPositionValue);
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