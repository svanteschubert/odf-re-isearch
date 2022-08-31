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

import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.element.OdfStyleableShapeElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.element.dr3d.Dr3dSceneElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawAElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawCaptionElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawCircleElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawConnectorElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawControlElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawCustomShapeElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawEllipseElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawFrameElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawGElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawLineElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawMeasureElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawPageThumbnailElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawPathElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawPolygonElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawPolylineElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawRectElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawRegularPolygonElement;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationPresentationPageLayoutNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationUseDateTimeNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationUseFooterNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationUseHeaderNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StylePageLayoutNameAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element style:handout-master}.
 *
 */
public class StyleHandoutMasterElement extends OdfStylableElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.STYLE, "handout-master");

	/**
	 * Create the instance of <code>StyleHandoutMasterElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public StyleHandoutMasterElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME, OdfStyleFamily.DrawingPage, OdfName.newName(OdfDocumentNamespace.STYLE, "style-name"));
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element style:handout-master}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawStyleNameAttribute</code> , See {@odf.attribute draw:style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawStyleNameAttribute() {
		DrawStyleNameAttribute attr = (DrawStyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "style-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawStyleNameAttribute</code> , See {@odf.attribute draw:style-name}
	 *
	 * @param drawStyleNameValue   The type is <code>String</code>
	 */
	public void setDrawStyleNameAttribute(String drawStyleNameValue) {
		DrawStyleNameAttribute attr = new DrawStyleNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawStyleNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationPresentationPageLayoutNameAttribute</code> , See {@odf.attribute presentation:presentation-page-layout-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationPresentationPageLayoutNameAttribute() {
		PresentationPresentationPageLayoutNameAttribute attr = (PresentationPresentationPageLayoutNameAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "presentation-page-layout-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationPresentationPageLayoutNameAttribute</code> , See {@odf.attribute presentation:presentation-page-layout-name}
	 *
	 * @param presentationPresentationPageLayoutNameValue   The type is <code>String</code>
	 */
	public void setPresentationPresentationPageLayoutNameAttribute(String presentationPresentationPageLayoutNameValue) {
		PresentationPresentationPageLayoutNameAttribute attr = new PresentationPresentationPageLayoutNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(presentationPresentationPageLayoutNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationUseDateTimeNameAttribute</code> , See {@odf.attribute presentation:use-date-time-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationUseDateTimeNameAttribute() {
		PresentationUseDateTimeNameAttribute attr = (PresentationUseDateTimeNameAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "use-date-time-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationUseDateTimeNameAttribute</code> , See {@odf.attribute presentation:use-date-time-name}
	 *
	 * @param presentationUseDateTimeNameValue   The type is <code>String</code>
	 */
	public void setPresentationUseDateTimeNameAttribute(String presentationUseDateTimeNameValue) {
		PresentationUseDateTimeNameAttribute attr = new PresentationUseDateTimeNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(presentationUseDateTimeNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationUseFooterNameAttribute</code> , See {@odf.attribute presentation:use-footer-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationUseFooterNameAttribute() {
		PresentationUseFooterNameAttribute attr = (PresentationUseFooterNameAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "use-footer-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationUseFooterNameAttribute</code> , See {@odf.attribute presentation:use-footer-name}
	 *
	 * @param presentationUseFooterNameValue   The type is <code>String</code>
	 */
	public void setPresentationUseFooterNameAttribute(String presentationUseFooterNameValue) {
		PresentationUseFooterNameAttribute attr = new PresentationUseFooterNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(presentationUseFooterNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationUseHeaderNameAttribute</code> , See {@odf.attribute presentation:use-header-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationUseHeaderNameAttribute() {
		PresentationUseHeaderNameAttribute attr = (PresentationUseHeaderNameAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "use-header-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationUseHeaderNameAttribute</code> , See {@odf.attribute presentation:use-header-name}
	 *
	 * @param presentationUseHeaderNameValue   The type is <code>String</code>
	 */
	public void setPresentationUseHeaderNameAttribute(String presentationUseHeaderNameValue) {
		PresentationUseHeaderNameAttribute attr = new PresentationUseHeaderNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(presentationUseHeaderNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StylePageLayoutNameAttribute</code> , See {@odf.attribute style:page-layout-name}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStylePageLayoutNameAttribute() {
		StylePageLayoutNameAttribute attr = (StylePageLayoutNameAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "page-layout-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>StylePageLayoutNameAttribute</code> , See {@odf.attribute style:page-layout-name}
	 *
	 * @param stylePageLayoutNameValue   The type is <code>String</code>
	 */
	public void setStylePageLayoutNameAttribute(String stylePageLayoutNameValue) {
		StylePageLayoutNameAttribute attr = new StylePageLayoutNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(stylePageLayoutNameValue);
	}

	/**
	 * Create child element {@odf.element dr3d:scene}.
	 *
	 * @return the element {@odf.element dr3d:scene}
	 */
	public Dr3dSceneElement newDr3dSceneElement() {
		Dr3dSceneElement dr3dScene = ((OdfFileDom) this.ownerDocument).newOdfElement(Dr3dSceneElement.class);
		this.appendChild(dr3dScene);
		return dr3dScene;
	}

	/**
	 * Create child element {@odf.element draw:a}.
	 *
	 * @param xlinkHrefValue  the <code>String</code> value of <code>XlinkHrefAttribute</code>, see {@odf.attribute  xlink:href} at specification
	 * @param xlinkTypeValue  the <code>String</code> value of <code>XlinkTypeAttribute</code>, see {@odf.attribute  xlink:type} at specification
	 * Child element was added in ODF 1.2
	 *
	 * @return the element {@odf.element draw:a}
	 */
	 public DrawAElement newDrawAElement(String xlinkHrefValue, String xlinkTypeValue) {
		DrawAElement drawA = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawAElement.class);
		drawA.setXlinkHrefAttribute(xlinkHrefValue);
		drawA.setXlinkTypeAttribute(xlinkTypeValue);
		this.appendChild(drawA);
		return drawA;
	}

	/**
	 * Create child element {@odf.element draw:caption}.
	 *
	 * @return the element {@odf.element draw:caption}
	 */
	public DrawCaptionElement newDrawCaptionElement() {
		DrawCaptionElement drawCaption = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawCaptionElement.class);
		this.appendChild(drawCaption);
		return drawCaption;
	}

	/**
	 * Create child element {@odf.element draw:circle}.
	 *
	 * @return the element {@odf.element draw:circle}
	 */
	public DrawCircleElement newDrawCircleElement() {
		DrawCircleElement drawCircle = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawCircleElement.class);
		this.appendChild(drawCircle);
		return drawCircle;
	}

	/**
	 * Create child element {@odf.element draw:connector}.
	 *
	 * @param svgViewBoxValue  the <code>Integer</code> value of <code>SvgViewBoxAttribute</code>, see {@odf.attribute  svg:viewBox} at specification
	 * @return the element {@odf.element draw:connector}
	 */
	 public DrawConnectorElement newDrawConnectorElement(int svgViewBoxValue) {
		DrawConnectorElement drawConnector = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawConnectorElement.class);
		drawConnector.setSvgViewBoxAttribute(svgViewBoxValue);
		this.appendChild(drawConnector);
		return drawConnector;
	}

	/**
	 * Create child element {@odf.element draw:control}.
	 *
	 * @param drawControlValue  the <code>String</code> value of <code>DrawControlAttribute</code>, see {@odf.attribute  draw:control} at specification
	 * @return the element {@odf.element draw:control}
	 */
	 public DrawControlElement newDrawControlElement(String drawControlValue) {
		DrawControlElement drawControl = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawControlElement.class);
		drawControl.setDrawControlAttribute(drawControlValue);
		this.appendChild(drawControl);
		return drawControl;
	}

	/**
	 * Create child element {@odf.element draw:custom-shape}.
	 *
	 * @return the element {@odf.element draw:custom-shape}
	 */
	public DrawCustomShapeElement newDrawCustomShapeElement() {
		DrawCustomShapeElement drawCustomShape = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawCustomShapeElement.class);
		this.appendChild(drawCustomShape);
		return drawCustomShape;
	}

	/**
	 * Create child element {@odf.element draw:ellipse}.
	 *
	 * @return the element {@odf.element draw:ellipse}
	 */
	public DrawEllipseElement newDrawEllipseElement() {
		DrawEllipseElement drawEllipse = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawEllipseElement.class);
		this.appendChild(drawEllipse);
		return drawEllipse;
	}

	/**
	 * Create child element {@odf.element draw:frame}.
	 *
	 * @return the element {@odf.element draw:frame}
	 */
	public DrawFrameElement newDrawFrameElement() {
		DrawFrameElement drawFrame = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawFrameElement.class);
		this.appendChild(drawFrame);
		return drawFrame;
	}

	/**
	 * Create child element {@odf.element draw:g}.
	 *
	 * @return the element {@odf.element draw:g}
	 */
	public DrawGElement newDrawGElement() {
		DrawGElement drawG = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawGElement.class);
		this.appendChild(drawG);
		return drawG;
	}

	/**
	 * Create child element {@odf.element draw:line}.
	 *
	 * @param svgX1Value  the <code>String</code> value of <code>SvgX1Attribute</code>, see {@odf.attribute  svg:x1} at specification
	 * @param svgX2Value  the <code>String</code> value of <code>SvgX2Attribute</code>, see {@odf.attribute  svg:x2} at specification
	 * @param svgY1Value  the <code>String</code> value of <code>SvgY1Attribute</code>, see {@odf.attribute  svg:y1} at specification
	 * @param svgY2Value  the <code>String</code> value of <code>SvgY2Attribute</code>, see {@odf.attribute  svg:y2} at specification
	 * @return the element {@odf.element draw:line}
	 */
	 public DrawLineElement newDrawLineElement(String svgX1Value, String svgX2Value, String svgY1Value, String svgY2Value) {
		DrawLineElement drawLine = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawLineElement.class);
		drawLine.setSvgX1Attribute(svgX1Value);
		drawLine.setSvgX2Attribute(svgX2Value);
		drawLine.setSvgY1Attribute(svgY1Value);
		drawLine.setSvgY2Attribute(svgY2Value);
		this.appendChild(drawLine);
		return drawLine;
	}

	/**
	 * Create child element {@odf.element draw:measure}.
	 *
	 * @param svgX1Value  the <code>String</code> value of <code>SvgX1Attribute</code>, see {@odf.attribute  svg:x1} at specification
	 * @param svgX2Value  the <code>String</code> value of <code>SvgX2Attribute</code>, see {@odf.attribute  svg:x2} at specification
	 * @param svgY1Value  the <code>String</code> value of <code>SvgY1Attribute</code>, see {@odf.attribute  svg:y1} at specification
	 * @param svgY2Value  the <code>String</code> value of <code>SvgY2Attribute</code>, see {@odf.attribute  svg:y2} at specification
	 * @return the element {@odf.element draw:measure}
	 */
	 public DrawMeasureElement newDrawMeasureElement(String svgX1Value, String svgX2Value, String svgY1Value, String svgY2Value) {
		DrawMeasureElement drawMeasure = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawMeasureElement.class);
		drawMeasure.setSvgX1Attribute(svgX1Value);
		drawMeasure.setSvgX2Attribute(svgX2Value);
		drawMeasure.setSvgY1Attribute(svgY1Value);
		drawMeasure.setSvgY2Attribute(svgY2Value);
		this.appendChild(drawMeasure);
		return drawMeasure;
	}

	/**
	 * Create child element {@odf.element draw:page-thumbnail}.
	 *
	 * @return the element {@odf.element draw:page-thumbnail}
	 */
	public DrawPageThumbnailElement newDrawPageThumbnailElement() {
		DrawPageThumbnailElement drawPageThumbnail = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawPageThumbnailElement.class);
		this.appendChild(drawPageThumbnail);
		return drawPageThumbnail;
	}

	/**
	 * Create child element {@odf.element draw:path}.
	 *
	 * @param svgDValue  the <code>String</code> value of <code>SvgDAttribute</code>, see {@odf.attribute  svg:d} at specification
	 * @param svgViewBoxValue  the <code>Integer</code> value of <code>SvgViewBoxAttribute</code>, see {@odf.attribute  svg:viewBox} at specification
	 * @return the element {@odf.element draw:path}
	 */
	 public DrawPathElement newDrawPathElement(String svgDValue, int svgViewBoxValue) {
		DrawPathElement drawPath = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawPathElement.class);
		drawPath.setSvgDAttribute(svgDValue);
		drawPath.setSvgViewBoxAttribute(svgViewBoxValue);
		this.appendChild(drawPath);
		return drawPath;
	}

	/**
	 * Create child element {@odf.element draw:polygon}.
	 *
	 * @param drawPointsValue  the <code>String</code> value of <code>DrawPointsAttribute</code>, see {@odf.attribute  draw:points} at specification
	 * @param svgViewBoxValue  the <code>Integer</code> value of <code>SvgViewBoxAttribute</code>, see {@odf.attribute  svg:viewBox} at specification
	 * @return the element {@odf.element draw:polygon}
	 */
	 public DrawPolygonElement newDrawPolygonElement(String drawPointsValue, int svgViewBoxValue) {
		DrawPolygonElement drawPolygon = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawPolygonElement.class);
		drawPolygon.setDrawPointsAttribute(drawPointsValue);
		drawPolygon.setSvgViewBoxAttribute(svgViewBoxValue);
		this.appendChild(drawPolygon);
		return drawPolygon;
	}

	/**
	 * Create child element {@odf.element draw:polyline}.
	 *
	 * @param drawPointsValue  the <code>String</code> value of <code>DrawPointsAttribute</code>, see {@odf.attribute  draw:points} at specification
	 * @param svgViewBoxValue  the <code>Integer</code> value of <code>SvgViewBoxAttribute</code>, see {@odf.attribute  svg:viewBox} at specification
	 * @return the element {@odf.element draw:polyline}
	 */
	 public DrawPolylineElement newDrawPolylineElement(String drawPointsValue, int svgViewBoxValue) {
		DrawPolylineElement drawPolyline = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawPolylineElement.class);
		drawPolyline.setDrawPointsAttribute(drawPointsValue);
		drawPolyline.setSvgViewBoxAttribute(svgViewBoxValue);
		this.appendChild(drawPolyline);
		return drawPolyline;
	}

	/**
	 * Create child element {@odf.element draw:rect}.
	 *
	 * @return the element {@odf.element draw:rect}
	 */
	public DrawRectElement newDrawRectElement() {
		DrawRectElement drawRect = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawRectElement.class);
		this.appendChild(drawRect);
		return drawRect;
	}

	/**
	 * Create child element {@odf.element draw:regular-polygon}.
	 *
	 * @param drawConcaveValue  the <code>Boolean</code> value of <code>DrawConcaveAttribute</code>, see {@odf.attribute  draw:concave} at specification
	 * @param drawCornersValue  the <code>Integer</code> value of <code>DrawCornersAttribute</code>, see {@odf.attribute  draw:corners} at specification
	 * @return the element {@odf.element draw:regular-polygon}
	 */
	 public DrawRegularPolygonElement newDrawRegularPolygonElement(boolean drawConcaveValue, int drawCornersValue) {
		DrawRegularPolygonElement drawRegularPolygon = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawRegularPolygonElement.class);
		drawRegularPolygon.setDrawConcaveAttribute(drawConcaveValue);
		drawRegularPolygon.setDrawCornersAttribute(drawCornersValue);
		this.appendChild(drawRegularPolygon);
		return drawRegularPolygon;
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
