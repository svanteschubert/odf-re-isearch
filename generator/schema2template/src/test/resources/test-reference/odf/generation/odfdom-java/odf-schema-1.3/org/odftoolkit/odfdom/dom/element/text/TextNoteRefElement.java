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
package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.text.TextNoteClassAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextRefNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextReferenceFormatAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element text:note-ref}.
 *
 */
public class TextNoteRefElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TEXT, "note-ref");

	/**
	 * Create the instance of <code>TextNoteRefElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextNoteRefElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:note-ref}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextNoteClassAttribute</code> , See {@odf.attribute text:note-class}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextNoteClassAttribute() {
		TextNoteClassAttribute attr = (TextNoteClassAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "note-class");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextNoteClassAttribute</code> , See {@odf.attribute text:note-class}
	 *
	 * @param textNoteClassValue   The type is <code>String</code>
	 */
	public void setTextNoteClassAttribute(String textNoteClassValue) {
		TextNoteClassAttribute attr = new TextNoteClassAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textNoteClassValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextRefNameAttribute</code> , See {@odf.attribute text:ref-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextRefNameAttribute() {
		TextRefNameAttribute attr = (TextRefNameAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "ref-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextRefNameAttribute</code> , See {@odf.attribute text:ref-name}
	 *
	 * @param textRefNameValue   The type is <code>String</code>
	 */
	public void setTextRefNameAttribute(String textRefNameValue) {
		TextRefNameAttribute attr = new TextRefNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textRefNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextReferenceFormatAttribute</code> , See {@odf.attribute text:reference-format}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextReferenceFormatAttribute() {
		TextReferenceFormatAttribute attr = (TextReferenceFormatAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "reference-format");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextReferenceFormatAttribute</code> , See {@odf.attribute text:reference-format}
	 *
	 * @param textReferenceFormatValue   The type is <code>String</code>
	 */
	public void setTextReferenceFormatAttribute(String textReferenceFormatValue) {
		TextReferenceFormatAttribute attr = new TextReferenceFormatAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textReferenceFormatValue);
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

	/**
	 * Add text content. Only elements which are allowed to have text content offer this method.
	 */
	 public void newTextNode(String content) {
		if (content != null && !content.equals("")) {
			this.appendChild(this.getOwnerDocument().createTextNode(content));
		}
	 }
}
