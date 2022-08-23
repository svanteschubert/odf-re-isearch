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
package org.odftoolkit.odfdom.dom.element.chart;

import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.element.OdfStyleableShapeElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.chart.ChartAttachedAxisAttribute;
import org.odftoolkit.odfdom.dom.attribute.chart.ChartClassAttribute;
import org.odftoolkit.odfdom.dom.attribute.chart.ChartLabelCellAddressAttribute;
import org.odftoolkit.odfdom.dom.attribute.chart.ChartStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.chart.ChartValuesCellRangeAddressAttribute;
import org.odftoolkit.odfdom.dom.attribute.xml.XmlIdAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element chart:series}.
 *
 */
public class ChartSeriesElement extends OdfStylableElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.CHART, "series");

	/**
	 * Create the instance of <code>ChartSeriesElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public ChartSeriesElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME, OdfStyleFamily.Chart, OdfName.newName(OdfDocumentNamespace.CHART, "style-name"));
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element chart:series}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>ChartAttachedAxisAttribute</code> , See {@odf.attribute chart:attached-axis}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getChartAttachedAxisAttribute() {
		ChartAttachedAxisAttribute attr = (ChartAttachedAxisAttribute) getOdfAttribute(OdfDocumentNamespace.CHART, "attached-axis");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>ChartAttachedAxisAttribute</code> , See {@odf.attribute chart:attached-axis}
	 *
	 * @param chartAttachedAxisValue   The type is <code>String</code>
	 */
	public void setChartAttachedAxisAttribute(String chartAttachedAxisValue) {
		ChartAttachedAxisAttribute attr = new ChartAttachedAxisAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(chartAttachedAxisValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>ChartClassAttribute</code> , See {@odf.attribute chart:class}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getChartClassAttribute() {
		ChartClassAttribute attr = (ChartClassAttribute) getOdfAttribute(OdfDocumentNamespace.CHART, "class");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>ChartClassAttribute</code> , See {@odf.attribute chart:class}
	 *
	 * @param chartClassValue   The type is <code>String</code>
	 */
	public void setChartClassAttribute(String chartClassValue) {
		ChartClassAttribute attr = new ChartClassAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(chartClassValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>ChartLabelCellAddressAttribute</code> , See {@odf.attribute chart:label-cell-address}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getChartLabelCellAddressAttribute() {
		ChartLabelCellAddressAttribute attr = (ChartLabelCellAddressAttribute) getOdfAttribute(OdfDocumentNamespace.CHART, "label-cell-address");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>ChartLabelCellAddressAttribute</code> , See {@odf.attribute chart:label-cell-address}
	 *
	 * @param chartLabelCellAddressValue   The type is <code>String</code>
	 */
	public void setChartLabelCellAddressAttribute(String chartLabelCellAddressValue) {
		ChartLabelCellAddressAttribute attr = new ChartLabelCellAddressAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(chartLabelCellAddressValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>ChartStyleNameAttribute</code> , See {@odf.attribute chart:style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getChartStyleNameAttribute() {
		ChartStyleNameAttribute attr = (ChartStyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.CHART, "style-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>ChartStyleNameAttribute</code> , See {@odf.attribute chart:style-name}
	 *
	 * @param chartStyleNameValue   The type is <code>String</code>
	 */
	public void setChartStyleNameAttribute(String chartStyleNameValue) {
		ChartStyleNameAttribute attr = new ChartStyleNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(chartStyleNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>ChartValuesCellRangeAddressAttribute</code> , See {@odf.attribute chart:values-cell-range-address}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getChartValuesCellRangeAddressAttribute() {
		ChartValuesCellRangeAddressAttribute attr = (ChartValuesCellRangeAddressAttribute) getOdfAttribute(OdfDocumentNamespace.CHART, "values-cell-range-address");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>ChartValuesCellRangeAddressAttribute</code> , See {@odf.attribute chart:values-cell-range-address}
	 *
	 * @param chartValuesCellRangeAddressValue   The type is <code>String</code>
	 */
	public void setChartValuesCellRangeAddressAttribute(String chartValuesCellRangeAddressValue) {
		ChartValuesCellRangeAddressAttribute attr = new ChartValuesCellRangeAddressAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(chartValuesCellRangeAddressValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>XmlIdAttribute</code> , See {@odf.attribute xml:id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXmlIdAttribute() {
		XmlIdAttribute attr = (XmlIdAttribute) getOdfAttribute(OdfDocumentNamespace.XML, "id");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>XmlIdAttribute</code> , See {@odf.attribute xml:id}
	 *
	 * @param xmlIdValue   The type is <code>String</code>
	 */
	public void setXmlIdAttribute(String xmlIdValue) {
		XmlIdAttribute attr = new XmlIdAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(xmlIdValue);
	}

	/**
	 * Create child element {@odf.element chart:data-label}.
	 *
	 * Child element was added in ODF 1.2
	 *
	 * @return the element {@odf.element chart:data-label}
	 */
	public ChartDataLabelElement newChartDataLabelElement() {
		ChartDataLabelElement chartDataLabel = ((OdfFileDom) this.ownerDocument).newOdfElement(ChartDataLabelElement.class);
		this.appendChild(chartDataLabel);
		return chartDataLabel;
	}

	/**
	 * Create child element {@odf.element chart:data-point}.
	 *
	 * @return the element {@odf.element chart:data-point}
	 */
	public ChartDataPointElement newChartDataPointElement() {
		ChartDataPointElement chartDataPoint = ((OdfFileDom) this.ownerDocument).newOdfElement(ChartDataPointElement.class);
		this.appendChild(chartDataPoint);
		return chartDataPoint;
	}

	/**
	 * Create child element {@odf.element chart:domain}.
	 *
	 * @return the element {@odf.element chart:domain}
	 */
	public ChartDomainElement newChartDomainElement() {
		ChartDomainElement chartDomain = ((OdfFileDom) this.ownerDocument).newOdfElement(ChartDomainElement.class);
		this.appendChild(chartDomain);
		return chartDomain;
	}

	/**
	 * Create child element {@odf.element chart:error-indicator}.
	 *
	 * @param chartDimensionValue  the <code>String</code> value of <code>ChartDimensionAttribute</code>, see {@odf.attribute  chart:dimension} at specification
	 * @return the element {@odf.element chart:error-indicator}
	 */
	 public ChartErrorIndicatorElement newChartErrorIndicatorElement(String chartDimensionValue) {
		ChartErrorIndicatorElement chartErrorIndicator = ((OdfFileDom) this.ownerDocument).newOdfElement(ChartErrorIndicatorElement.class);
		chartErrorIndicator.setChartDimensionAttribute(chartDimensionValue);
		this.appendChild(chartErrorIndicator);
		return chartErrorIndicator;
	}

	/**
	 * Create child element {@odf.element chart:mean-value}.
	 *
	 * @return the element {@odf.element chart:mean-value}
	 */
	public ChartMeanValueElement newChartMeanValueElement() {
		ChartMeanValueElement chartMeanValue = ((OdfFileDom) this.ownerDocument).newOdfElement(ChartMeanValueElement.class);
		this.appendChild(chartMeanValue);
		return chartMeanValue;
	}

	/**
	 * Create child element {@odf.element chart:regression-curve}.
	 *
	 * @return the element {@odf.element chart:regression-curve}
	 */
	public ChartRegressionCurveElement newChartRegressionCurveElement() {
		ChartRegressionCurveElement chartRegressionCurve = ((OdfFileDom) this.ownerDocument).newOdfElement(ChartRegressionCurveElement.class);
		this.appendChild(chartRegressionCurve);
		return chartRegressionCurve;
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
