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
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.element.presentation.PresentationPlaceholderElement;
import org.odftoolkit.odfdom.dom.attribute.style.StyleDisplayNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleNameAttribute;
import org.odftoolkit.odfdom.dom.element.OdfStylePropertiesBase;

/**
 * DOM implementation of OpenDocument element  {@odf.element style:presentation-page-layout}.
 *
 */
public class StylePresentationPageLayoutElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.STYLE, "presentation-page-layout");

	/**
	 * Create the instance of <code>StylePresentationPageLayoutElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public StylePresentationPageLayoutElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element style:presentation-page-layout}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleDisplayNameAttribute</code> , See {@odf.attribute style:display-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleDisplayNameAttribute() {
		StyleDisplayNameAttribute attr = (StyleDisplayNameAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "display-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleDisplayNameAttribute</code> , See {@odf.attribute style:display-name}
	 *
	 * @param styleDisplayNameValue   The type is <code>String</code>
	 */
	public void setStyleDisplayNameAttribute(String styleDisplayNameValue) {
		StyleDisplayNameAttribute attr = new StyleDisplayNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(styleDisplayNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleNameAttribute</code> , See {@odf.attribute style:name}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleNameAttribute() {
		StyleNameAttribute attr = (StyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleNameAttribute</code> , See {@odf.attribute style:name}
	 *
	 * @param styleNameValue   The type is <code>String</code>
	 */
	public void setStyleNameAttribute(String styleNameValue) {
		StyleNameAttribute attr = new StyleNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(styleNameValue);
	}

	/**
	 * Create child element {@odf.element presentation:placeholder}.
	 *
	 * @param presentationObjectValue  the <code>String</code> value of <code>PresentationObjectAttribute</code>, see {@odf.attribute  presentation:object} at specification
	 * @param svgHeightValue  the <code>String</code> value of <code>SvgHeightAttribute</code>, see {@odf.attribute  svg:height} at specification
	 * @param svgWidthValue  the <code>String</code> value of <code>SvgWidthAttribute</code>, see {@odf.attribute  svg:width} at specification
	 * @param svgXValue  the <code>String</code> value of <code>SvgXAttribute</code>, see {@odf.attribute  svg:x} at specification
	 * @param svgYValue  the <code>String</code> value of <code>SvgYAttribute</code>, see {@odf.attribute  svg:y} at specification
	 * @return the element {@odf.element presentation:placeholder}
	 */
	 public PresentationPlaceholderElement newPresentationPlaceholderElement(String presentationObjectValue, String svgHeightValue, String svgWidthValue, String svgXValue, String svgYValue) {
		PresentationPlaceholderElement presentationPlaceholder = ((OdfFileDom) this.ownerDocument).newOdfElement(PresentationPlaceholderElement.class);
		presentationPlaceholder.setPresentationObjectAttribute(presentationObjectValue);
		presentationPlaceholder.setSvgHeightAttribute(svgHeightValue);
		presentationPlaceholder.setSvgWidthAttribute(svgWidthValue);
		presentationPlaceholder.setSvgXAttribute(svgXValue);
		presentationPlaceholder.setSvgYAttribute(svgYValue);
		this.appendChild(presentationPlaceholder);
		return presentationPlaceholder;
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
