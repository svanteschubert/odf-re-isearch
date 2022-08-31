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

import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.element.OdfStyleableShapeElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.text.TextOutlineLevelAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextStyleNameAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element text:user-index-entry-template}.
 *
 */
public class TextUserIndexEntryTemplateElement extends OdfStylableElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TEXT, "user-index-entry-template");

	/**
	 * Create the instance of <code>TextUserIndexEntryTemplateElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextUserIndexEntryTemplateElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME, OdfStyleFamily.Paragraph, OdfName.newName(OdfDocumentNamespace.TEXT, "style-name"));
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:user-index-entry-template}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextOutlineLevelAttribute</code> , See {@odf.attribute text:outline-level}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTextOutlineLevelAttribute() {
		TextOutlineLevelAttribute attr = (TextOutlineLevelAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "outline-level");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextOutlineLevelAttribute</code> , See {@odf.attribute text:outline-level}
	 *
	 * @param textOutlineLevelValue   The type is <code>Integer</code>
	 */
	public void setTextOutlineLevelAttribute(Integer textOutlineLevelValue) {
		TextOutlineLevelAttribute attr = new TextOutlineLevelAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(textOutlineLevelValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextStyleNameAttribute</code> , See {@odf.attribute text:style-name}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextStyleNameAttribute() {
		TextStyleNameAttribute attr = (TextStyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "style-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextStyleNameAttribute</code> , See {@odf.attribute text:style-name}
	 *
	 * @param textStyleNameValue   The type is <code>String</code>
	 */
	public void setTextStyleNameAttribute(String textStyleNameValue) {
		TextStyleNameAttribute attr = new TextStyleNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textStyleNameValue);
	}

	/**
	 * Create child element {@odf.element text:index-entry-chapter}.
	 *
	 * @return the element {@odf.element text:index-entry-chapter}
	 */
	public TextIndexEntryChapterElement newTextIndexEntryChapterElement() {
		TextIndexEntryChapterElement textIndexEntryChapter = ((OdfFileDom) this.ownerDocument).newOdfElement(TextIndexEntryChapterElement.class);
		this.appendChild(textIndexEntryChapter);
		return textIndexEntryChapter;
	}

	/**
	 * Create child element {@odf.element text:index-entry-link-end}.
	 *
	 * Child element was added in ODF 1.3
	 *
	 * @return the element {@odf.element text:index-entry-link-end}
	 */
	public TextIndexEntryLinkEndElement newTextIndexEntryLinkEndElement() {
		TextIndexEntryLinkEndElement textIndexEntryLinkEnd = ((OdfFileDom) this.ownerDocument).newOdfElement(TextIndexEntryLinkEndElement.class);
		this.appendChild(textIndexEntryLinkEnd);
		return textIndexEntryLinkEnd;
	}

	/**
	 * Create child element {@odf.element text:index-entry-link-start}.
	 *
	 * Child element was added in ODF 1.3
	 *
	 * @return the element {@odf.element text:index-entry-link-start}
	 */
	public TextIndexEntryLinkStartElement newTextIndexEntryLinkStartElement() {
		TextIndexEntryLinkStartElement textIndexEntryLinkStart = ((OdfFileDom) this.ownerDocument).newOdfElement(TextIndexEntryLinkStartElement.class);
		this.appendChild(textIndexEntryLinkStart);
		return textIndexEntryLinkStart;
	}

	/**
	 * Create child element {@odf.element text:index-entry-page-number}.
	 *
	 * @return the element {@odf.element text:index-entry-page-number}
	 */
	public TextIndexEntryPageNumberElement newTextIndexEntryPageNumberElement() {
		TextIndexEntryPageNumberElement textIndexEntryPageNumber = ((OdfFileDom) this.ownerDocument).newOdfElement(TextIndexEntryPageNumberElement.class);
		this.appendChild(textIndexEntryPageNumber);
		return textIndexEntryPageNumber;
	}

	/**
	 * Create child element {@odf.element text:index-entry-span}.
	 *
	 * @return the element {@odf.element text:index-entry-span}
	 */
	public TextIndexEntrySpanElement newTextIndexEntrySpanElement() {
		TextIndexEntrySpanElement textIndexEntrySpan = ((OdfFileDom) this.ownerDocument).newOdfElement(TextIndexEntrySpanElement.class);
		this.appendChild(textIndexEntrySpan);
		return textIndexEntrySpan;
	}

	/**
	 * Create child element {@odf.element text:index-entry-tab-stop}.
	 *
	 * @param styleTypeValue  the <code>String</code> value of <code>StyleTypeAttribute</code>, see {@odf.attribute  style:type} at specification
	 * @return the element {@odf.element text:index-entry-tab-stop}
	 */
	 public TextIndexEntryTabStopElement newTextIndexEntryTabStopElement(String styleTypeValue) {
		TextIndexEntryTabStopElement textIndexEntryTabStop = ((OdfFileDom) this.ownerDocument).newOdfElement(TextIndexEntryTabStopElement.class);
		textIndexEntryTabStop.setStyleTypeAttribute(styleTypeValue);
		this.appendChild(textIndexEntryTabStop);
		return textIndexEntryTabStop;
	}

	/**
	 * Create child element {@odf.element text:index-entry-text}.
	 *
	 * @return the element {@odf.element text:index-entry-text}
	 */
	public TextIndexEntryTextElement newTextIndexEntryTextElement() {
		TextIndexEntryTextElement textIndexEntryText = ((OdfFileDom) this.ownerDocument).newOdfElement(TextIndexEntryTextElement.class);
		this.appendChild(textIndexEntryText);
		return textIndexEntryText;
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
