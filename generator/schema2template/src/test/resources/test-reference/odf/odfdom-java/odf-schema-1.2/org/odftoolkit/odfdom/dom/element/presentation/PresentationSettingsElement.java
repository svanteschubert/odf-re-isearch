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
package org.odftoolkit.odfdom.dom.element.presentation;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationAnimationsAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationEndlessAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationForceManualAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationFullScreenAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationMouseAsPenAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationMouseVisibleAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationPauseAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationShowAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationShowEndOfPresentationSlideAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationShowLogoAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationStartPageAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationStartWithNavigatorAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationStayOnTopAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationTransitionOnClickAttribute;
import org.odftoolkit.odfdom.pkg.OdfContainerElementBase;

/**
 * DOM implementation of OpenDocument element  {@odf.element presentation:settings}.
 *
 */
public class PresentationSettingsElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.PRESENTATION, "settings");

	/**
	 * Create the instance of <code>PresentationSettingsElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public PresentationSettingsElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element presentation:settings}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationAnimationsAttribute</code> , See {@odf.attribute presentation:animations}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationAnimationsAttribute() {
		PresentationAnimationsAttribute attr = (PresentationAnimationsAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "animations");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return PresentationAnimationsAttribute.DEFAULT_VALUE;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationAnimationsAttribute</code> , See {@odf.attribute presentation:animations}
	 *
	 * @param presentationAnimationsValue   The type is <code>String</code>
	 */
	public void setPresentationAnimationsAttribute(String presentationAnimationsValue) {
		PresentationAnimationsAttribute attr = new PresentationAnimationsAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(presentationAnimationsValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationEndlessAttribute</code> , See {@odf.attribute presentation:endless}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getPresentationEndlessAttribute() {
		PresentationEndlessAttribute attr = (PresentationEndlessAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "endless");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(PresentationEndlessAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationEndlessAttribute</code> , See {@odf.attribute presentation:endless}
	 *
	 * @param presentationEndlessValue   The type is <code>Boolean</code>
	 */
	public void setPresentationEndlessAttribute(Boolean presentationEndlessValue) {
		PresentationEndlessAttribute attr = new PresentationEndlessAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(presentationEndlessValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationForceManualAttribute</code> , See {@odf.attribute presentation:force-manual}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getPresentationForceManualAttribute() {
		PresentationForceManualAttribute attr = (PresentationForceManualAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "force-manual");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(PresentationForceManualAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationForceManualAttribute</code> , See {@odf.attribute presentation:force-manual}
	 *
	 * @param presentationForceManualValue   The type is <code>Boolean</code>
	 */
	public void setPresentationForceManualAttribute(Boolean presentationForceManualValue) {
		PresentationForceManualAttribute attr = new PresentationForceManualAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(presentationForceManualValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationFullScreenAttribute</code> , See {@odf.attribute presentation:full-screen}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getPresentationFullScreenAttribute() {
		PresentationFullScreenAttribute attr = (PresentationFullScreenAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "full-screen");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(PresentationFullScreenAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationFullScreenAttribute</code> , See {@odf.attribute presentation:full-screen}
	 *
	 * @param presentationFullScreenValue   The type is <code>Boolean</code>
	 */
	public void setPresentationFullScreenAttribute(Boolean presentationFullScreenValue) {
		PresentationFullScreenAttribute attr = new PresentationFullScreenAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(presentationFullScreenValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationMouseAsPenAttribute</code> , See {@odf.attribute presentation:mouse-as-pen}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getPresentationMouseAsPenAttribute() {
		PresentationMouseAsPenAttribute attr = (PresentationMouseAsPenAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "mouse-as-pen");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(PresentationMouseAsPenAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationMouseAsPenAttribute</code> , See {@odf.attribute presentation:mouse-as-pen}
	 *
	 * @param presentationMouseAsPenValue   The type is <code>Boolean</code>
	 */
	public void setPresentationMouseAsPenAttribute(Boolean presentationMouseAsPenValue) {
		PresentationMouseAsPenAttribute attr = new PresentationMouseAsPenAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(presentationMouseAsPenValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationMouseVisibleAttribute</code> , See {@odf.attribute presentation:mouse-visible}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getPresentationMouseVisibleAttribute() {
		PresentationMouseVisibleAttribute attr = (PresentationMouseVisibleAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "mouse-visible");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(PresentationMouseVisibleAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationMouseVisibleAttribute</code> , See {@odf.attribute presentation:mouse-visible}
	 *
	 * @param presentationMouseVisibleValue   The type is <code>Boolean</code>
	 */
	public void setPresentationMouseVisibleAttribute(Boolean presentationMouseVisibleValue) {
		PresentationMouseVisibleAttribute attr = new PresentationMouseVisibleAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(presentationMouseVisibleValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationPauseAttribute</code> , See {@odf.attribute presentation:pause}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationPauseAttribute() {
		PresentationPauseAttribute attr = (PresentationPauseAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "pause");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationPauseAttribute</code> , See {@odf.attribute presentation:pause}
	 *
	 * @param presentationPauseValue   The type is <code>String</code>
	 */
	public void setPresentationPauseAttribute(String presentationPauseValue) {
		PresentationPauseAttribute attr = new PresentationPauseAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(presentationPauseValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationShowAttribute</code> , See {@odf.attribute presentation:show}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationShowAttribute() {
		PresentationShowAttribute attr = (PresentationShowAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "show");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationShowAttribute</code> , See {@odf.attribute presentation:show}
	 *
	 * @param presentationShowValue   The type is <code>String</code>
	 */
	public void setPresentationShowAttribute(String presentationShowValue) {
		PresentationShowAttribute attr = new PresentationShowAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(presentationShowValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationShowEndOfPresentationSlideAttribute</code> , See {@odf.attribute presentation:show-end-of-presentation-slide}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getPresentationShowEndOfPresentationSlideAttribute() {
		PresentationShowEndOfPresentationSlideAttribute attr = (PresentationShowEndOfPresentationSlideAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "show-end-of-presentation-slide");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(PresentationShowEndOfPresentationSlideAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationShowEndOfPresentationSlideAttribute</code> , See {@odf.attribute presentation:show-end-of-presentation-slide}
	 *
	 * @param presentationShowEndOfPresentationSlideValue   The type is <code>Boolean</code>
	 */
	public void setPresentationShowEndOfPresentationSlideAttribute(Boolean presentationShowEndOfPresentationSlideValue) {
		PresentationShowEndOfPresentationSlideAttribute attr = new PresentationShowEndOfPresentationSlideAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(presentationShowEndOfPresentationSlideValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationShowLogoAttribute</code> , See {@odf.attribute presentation:show-logo}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getPresentationShowLogoAttribute() {
		PresentationShowLogoAttribute attr = (PresentationShowLogoAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "show-logo");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(PresentationShowLogoAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationShowLogoAttribute</code> , See {@odf.attribute presentation:show-logo}
	 *
	 * @param presentationShowLogoValue   The type is <code>Boolean</code>
	 */
	public void setPresentationShowLogoAttribute(Boolean presentationShowLogoValue) {
		PresentationShowLogoAttribute attr = new PresentationShowLogoAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(presentationShowLogoValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationStartPageAttribute</code> , See {@odf.attribute presentation:start-page}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationStartPageAttribute() {
		PresentationStartPageAttribute attr = (PresentationStartPageAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "start-page");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationStartPageAttribute</code> , See {@odf.attribute presentation:start-page}
	 *
	 * @param presentationStartPageValue   The type is <code>String</code>
	 */
	public void setPresentationStartPageAttribute(String presentationStartPageValue) {
		PresentationStartPageAttribute attr = new PresentationStartPageAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(presentationStartPageValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationStartWithNavigatorAttribute</code> , See {@odf.attribute presentation:start-with-navigator}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getPresentationStartWithNavigatorAttribute() {
		PresentationStartWithNavigatorAttribute attr = (PresentationStartWithNavigatorAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "start-with-navigator");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(PresentationStartWithNavigatorAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationStartWithNavigatorAttribute</code> , See {@odf.attribute presentation:start-with-navigator}
	 *
	 * @param presentationStartWithNavigatorValue   The type is <code>Boolean</code>
	 */
	public void setPresentationStartWithNavigatorAttribute(Boolean presentationStartWithNavigatorValue) {
		PresentationStartWithNavigatorAttribute attr = new PresentationStartWithNavigatorAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(presentationStartWithNavigatorValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationStayOnTopAttribute</code> , See {@odf.attribute presentation:stay-on-top}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getPresentationStayOnTopAttribute() {
		PresentationStayOnTopAttribute attr = (PresentationStayOnTopAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "stay-on-top");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(PresentationStayOnTopAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationStayOnTopAttribute</code> , See {@odf.attribute presentation:stay-on-top}
	 *
	 * @param presentationStayOnTopValue   The type is <code>Boolean</code>
	 */
	public void setPresentationStayOnTopAttribute(Boolean presentationStayOnTopValue) {
		PresentationStayOnTopAttribute attr = new PresentationStayOnTopAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(presentationStayOnTopValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationTransitionOnClickAttribute</code> , See {@odf.attribute presentation:transition-on-click}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationTransitionOnClickAttribute() {
		PresentationTransitionOnClickAttribute attr = (PresentationTransitionOnClickAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "transition-on-click");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return PresentationTransitionOnClickAttribute.DEFAULT_VALUE;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationTransitionOnClickAttribute</code> , See {@odf.attribute presentation:transition-on-click}
	 *
	 * @param presentationTransitionOnClickValue   The type is <code>String</code>
	 */
	public void setPresentationTransitionOnClickAttribute(String presentationTransitionOnClickValue) {
		PresentationTransitionOnClickAttribute attr = new PresentationTransitionOnClickAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(presentationTransitionOnClickValue);
	}

	/**
	 * Create child element {@odf.element presentation:show}.
	 *
	 * @param presentationNameValue  the <code>String</code> value of <code>PresentationNameAttribute</code>, see {@odf.attribute  presentation:name} at specification
	 * @param presentationPagesValue  the <code>String</code> value of <code>PresentationPagesAttribute</code>, see {@odf.attribute  presentation:pages} at specification
	 * @return the element {@odf.element presentation:show}
	 */
	 public PresentationShowElement newPresentationShowElement(String presentationNameValue, String presentationPagesValue) {
		PresentationShowElement presentationShow = ((OdfFileDom) this.ownerDocument).newOdfElement(PresentationShowElement.class);
		presentationShow.setPresentationNameAttribute(presentationNameValue);
		presentationShow.setPresentationPagesAttribute(presentationPagesValue);
		this.appendChild(presentationShow);
		return presentationShow;
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
