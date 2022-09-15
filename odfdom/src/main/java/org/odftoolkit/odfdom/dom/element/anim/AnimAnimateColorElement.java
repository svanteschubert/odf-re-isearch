/**
 * **********************************************************************
 *
 * <p>DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * <p>Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * <p>Use is subject to license terms.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0. You can also obtain a copy of the License at
 * http://odftoolkit.org/docs/license.txt
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied.
 *
 * <p>See the License for the specific language governing permissions and limitations under the
 * License.
 *
 * <p>**********************************************************************
 */

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.anim;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.anim.AnimColorInterpolationAttribute;
import org.odftoolkit.odfdom.dom.attribute.anim.AnimColorInterpolationDirectionAttribute;
import org.odftoolkit.odfdom.dom.attribute.anim.AnimFormulaAttribute;
import org.odftoolkit.odfdom.dom.attribute.anim.AnimSubItemAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilAccelerateAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilAccumulateAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilAdditiveAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilAttributeNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilAutoReverseAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilBeginAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilByAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilCalcModeAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilDecelerateAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilDurAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilEndAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilFillAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilFillDefaultAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilFromAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilKeySplinesAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilKeyTimesAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilRepeatCountAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilRepeatDurAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilRestartAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilRestartDefaultAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilTargetElementAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilToAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilValuesAttribute;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element anim:animateColor}. */
public class AnimAnimateColorElement extends OdfElement {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.ANIM, "animateColor");

  /**
   * Create the instance of <code>AnimAnimateColorElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public AnimAnimateColorElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element anim:animateColor}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>AnimColorInterpolationAttribute
   * </code> , See {@odf.attribute anim:color-interpolation}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getAnimColorInterpolationAttribute() {
    AnimColorInterpolationAttribute attr =
        (AnimColorInterpolationAttribute)
            getOdfAttribute(OdfDocumentNamespace.ANIM, "color-interpolation");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return AnimColorInterpolationAttribute.DEFAULT_VALUE;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>AnimColorInterpolationAttribute</code>
   * , See {@odf.attribute anim:color-interpolation}
   *
   * @param animColorInterpolationValue The type is <code>String</code>
   */
  public void setAnimColorInterpolationAttribute(String animColorInterpolationValue) {
    AnimColorInterpolationAttribute attr =
        new AnimColorInterpolationAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(animColorInterpolationValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>
   * AnimColorInterpolationDirectionAttribute</code> , See {@odf.attribute
   * anim:color-interpolation-direction}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getAnimColorInterpolationDirectionAttribute() {
    AnimColorInterpolationDirectionAttribute attr =
        (AnimColorInterpolationDirectionAttribute)
            getOdfAttribute(OdfDocumentNamespace.ANIM, "color-interpolation-direction");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return AnimColorInterpolationDirectionAttribute.DEFAULT_VALUE;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>
   * AnimColorInterpolationDirectionAttribute</code> , See {@odf.attribute
   * anim:color-interpolation-direction}
   *
   * @param animColorInterpolationDirectionValue The type is <code>String</code>
   */
  public void setAnimColorInterpolationDirectionAttribute(
      String animColorInterpolationDirectionValue) {
    AnimColorInterpolationDirectionAttribute attr =
        new AnimColorInterpolationDirectionAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(animColorInterpolationDirectionValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>AnimFormulaAttribute</code> ,
   * See {@odf.attribute anim:formula}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getAnimFormulaAttribute() {
    AnimFormulaAttribute attr =
        (AnimFormulaAttribute) getOdfAttribute(OdfDocumentNamespace.ANIM, "formula");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>AnimFormulaAttribute</code> , See
   * {@odf.attribute anim:formula}
   *
   * @param animFormulaValue The type is <code>String</code>
   */
  public void setAnimFormulaAttribute(String animFormulaValue) {
    AnimFormulaAttribute attr = new AnimFormulaAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(animFormulaValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>AnimSubItemAttribute</code> ,
   * See {@odf.attribute anim:sub-item}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getAnimSubItemAttribute() {
    AnimSubItemAttribute attr =
        (AnimSubItemAttribute) getOdfAttribute(OdfDocumentNamespace.ANIM, "sub-item");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>AnimSubItemAttribute</code> , See
   * {@odf.attribute anim:sub-item}
   *
   * @param animSubItemValue The type is <code>String</code>
   */
  public void setAnimSubItemAttribute(String animSubItemValue) {
    AnimSubItemAttribute attr = new AnimSubItemAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(animSubItemValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SmilAccelerateAttribute</code>
   * , See {@odf.attribute smil:accelerate}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSmilAccelerateAttribute() {
    SmilAccelerateAttribute attr =
        (SmilAccelerateAttribute) getOdfAttribute(OdfDocumentNamespace.SMIL, "accelerate");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return SmilAccelerateAttribute.DEFAULT_VALUE;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SmilAccelerateAttribute</code> , See
   * {@odf.attribute smil:accelerate}
   *
   * @param smilAccelerateValue The type is <code>String</code>
   */
  public void setSmilAccelerateAttribute(String smilAccelerateValue) {
    SmilAccelerateAttribute attr = new SmilAccelerateAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(smilAccelerateValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SmilAccumulateAttribute</code>
   * , See {@odf.attribute smil:accumulate}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSmilAccumulateAttribute() {
    SmilAccumulateAttribute attr =
        (SmilAccumulateAttribute) getOdfAttribute(OdfDocumentNamespace.SMIL, "accumulate");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SmilAccumulateAttribute</code> , See
   * {@odf.attribute smil:accumulate}
   *
   * @param smilAccumulateValue The type is <code>String</code>
   */
  public void setSmilAccumulateAttribute(String smilAccumulateValue) {
    SmilAccumulateAttribute attr = new SmilAccumulateAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(smilAccumulateValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SmilAdditiveAttribute</code> ,
   * See {@odf.attribute smil:additive}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSmilAdditiveAttribute() {
    SmilAdditiveAttribute attr =
        (SmilAdditiveAttribute) getOdfAttribute(OdfDocumentNamespace.SMIL, "additive");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SmilAdditiveAttribute</code> , See
   * {@odf.attribute smil:additive}
   *
   * @param smilAdditiveValue The type is <code>String</code>
   */
  public void setSmilAdditiveAttribute(String smilAdditiveValue) {
    SmilAdditiveAttribute attr = new SmilAdditiveAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(smilAdditiveValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SmilAttributeNameAttribute
   * </code> , See {@odf.attribute smil:attributeName}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSmilAttributeNameAttribute() {
    SmilAttributeNameAttribute attr =
        (SmilAttributeNameAttribute) getOdfAttribute(OdfDocumentNamespace.SMIL, "attributeName");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SmilAttributeNameAttribute</code> , See
   * {@odf.attribute smil:attributeName}
   *
   * @param smilAttributeNameValue The type is <code>String</code>
   */
  public void setSmilAttributeNameAttribute(String smilAttributeNameValue) {
    SmilAttributeNameAttribute attr =
        new SmilAttributeNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(smilAttributeNameValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SmilAutoReverseAttribute</code>
   * , See {@odf.attribute smil:autoReverse}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getSmilAutoReverseAttribute() {
    SmilAutoReverseAttribute attr =
        (SmilAutoReverseAttribute) getOdfAttribute(OdfDocumentNamespace.SMIL, "autoReverse");
    if (attr != null && !attr.getValue().isEmpty()) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return Boolean.valueOf(SmilAutoReverseAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SmilAutoReverseAttribute</code> , See
   * {@odf.attribute smil:autoReverse}
   *
   * @param smilAutoReverseValue The type is <code>Boolean</code>
   */
  public void setSmilAutoReverseAttribute(Boolean smilAutoReverseValue) {
    SmilAutoReverseAttribute attr = new SmilAutoReverseAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(smilAutoReverseValue.booleanValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SmilBeginAttribute</code> , See
   * {@odf.attribute smil:begin}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSmilBeginAttribute() {
    SmilBeginAttribute attr =
        (SmilBeginAttribute) getOdfAttribute(OdfDocumentNamespace.SMIL, "begin");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SmilBeginAttribute</code> , See
   * {@odf.attribute smil:begin}
   *
   * @param smilBeginValue The type is <code>String</code>
   */
  public void setSmilBeginAttribute(String smilBeginValue) {
    SmilBeginAttribute attr = new SmilBeginAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(smilBeginValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SmilByAttribute</code> , See
   * {@odf.attribute smil:by}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSmilByAttribute() {
    SmilByAttribute attr = (SmilByAttribute) getOdfAttribute(OdfDocumentNamespace.SMIL, "by");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SmilByAttribute</code> , See
   * {@odf.attribute smil:by}
   *
   * @param smilByValue The type is <code>String</code>
   */
  public void setSmilByAttribute(String smilByValue) {
    SmilByAttribute attr = new SmilByAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(smilByValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SmilCalcModeAttribute</code> ,
   * See {@odf.attribute smil:calcMode}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSmilCalcModeAttribute() {
    SmilCalcModeAttribute attr =
        (SmilCalcModeAttribute) getOdfAttribute(OdfDocumentNamespace.SMIL, "calcMode");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return SmilCalcModeAttribute.DEFAULT_VALUE_DISCRETE;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SmilCalcModeAttribute</code> , See
   * {@odf.attribute smil:calcMode}
   *
   * @param smilCalcModeValue The type is <code>String</code>
   */
  public void setSmilCalcModeAttribute(String smilCalcModeValue) {
    SmilCalcModeAttribute attr = new SmilCalcModeAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(smilCalcModeValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SmilDecelerateAttribute</code>
   * , See {@odf.attribute smil:decelerate}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSmilDecelerateAttribute() {
    SmilDecelerateAttribute attr =
        (SmilDecelerateAttribute) getOdfAttribute(OdfDocumentNamespace.SMIL, "decelerate");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return SmilDecelerateAttribute.DEFAULT_VALUE;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SmilDecelerateAttribute</code> , See
   * {@odf.attribute smil:decelerate}
   *
   * @param smilDecelerateValue The type is <code>String</code>
   */
  public void setSmilDecelerateAttribute(String smilDecelerateValue) {
    SmilDecelerateAttribute attr = new SmilDecelerateAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(smilDecelerateValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SmilDurAttribute</code> , See
   * {@odf.attribute smil:dur}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSmilDurAttribute() {
    SmilDurAttribute attr = (SmilDurAttribute) getOdfAttribute(OdfDocumentNamespace.SMIL, "dur");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SmilDurAttribute</code> , See
   * {@odf.attribute smil:dur}
   *
   * @param smilDurValue The type is <code>String</code>
   */
  public void setSmilDurAttribute(String smilDurValue) {
    SmilDurAttribute attr = new SmilDurAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(smilDurValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SmilEndAttribute</code> , See
   * {@odf.attribute smil:end}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSmilEndAttribute() {
    SmilEndAttribute attr = (SmilEndAttribute) getOdfAttribute(OdfDocumentNamespace.SMIL, "end");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SmilEndAttribute</code> , See
   * {@odf.attribute smil:end}
   *
   * @param smilEndValue The type is <code>String</code>
   */
  public void setSmilEndAttribute(String smilEndValue) {
    SmilEndAttribute attr = new SmilEndAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(smilEndValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SmilFillAttribute</code> , See
   * {@odf.attribute smil:fill}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSmilFillAttribute() {
    SmilFillAttribute attr = (SmilFillAttribute) getOdfAttribute(OdfDocumentNamespace.SMIL, "fill");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SmilFillAttribute</code> , See
   * {@odf.attribute smil:fill}
   *
   * @param smilFillValue The type is <code>String</code>
   */
  public void setSmilFillAttribute(String smilFillValue) {
    SmilFillAttribute attr = new SmilFillAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(smilFillValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SmilFillDefaultAttribute</code>
   * , See {@odf.attribute smil:fillDefault}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSmilFillDefaultAttribute() {
    SmilFillDefaultAttribute attr =
        (SmilFillDefaultAttribute) getOdfAttribute(OdfDocumentNamespace.SMIL, "fillDefault");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SmilFillDefaultAttribute</code> , See
   * {@odf.attribute smil:fillDefault}
   *
   * @param smilFillDefaultValue The type is <code>String</code>
   */
  public void setSmilFillDefaultAttribute(String smilFillDefaultValue) {
    SmilFillDefaultAttribute attr = new SmilFillDefaultAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(smilFillDefaultValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SmilFromAttribute</code> , See
   * {@odf.attribute smil:from}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSmilFromAttribute() {
    SmilFromAttribute attr = (SmilFromAttribute) getOdfAttribute(OdfDocumentNamespace.SMIL, "from");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SmilFromAttribute</code> , See
   * {@odf.attribute smil:from}
   *
   * @param smilFromValue The type is <code>String</code>
   */
  public void setSmilFromAttribute(String smilFromValue) {
    SmilFromAttribute attr = new SmilFromAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(smilFromValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SmilKeySplinesAttribute</code>
   * , See {@odf.attribute smil:keySplines}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSmilKeySplinesAttribute() {
    SmilKeySplinesAttribute attr =
        (SmilKeySplinesAttribute) getOdfAttribute(OdfDocumentNamespace.SMIL, "keySplines");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SmilKeySplinesAttribute</code> , See
   * {@odf.attribute smil:keySplines}
   *
   * @param smilKeySplinesValue The type is <code>String</code>
   */
  public void setSmilKeySplinesAttribute(String smilKeySplinesValue) {
    SmilKeySplinesAttribute attr = new SmilKeySplinesAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(smilKeySplinesValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SmilKeyTimesAttribute</code> ,
   * See {@odf.attribute smil:keyTimes}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSmilKeyTimesAttribute() {
    SmilKeyTimesAttribute attr =
        (SmilKeyTimesAttribute) getOdfAttribute(OdfDocumentNamespace.SMIL, "keyTimes");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SmilKeyTimesAttribute</code> , See
   * {@odf.attribute smil:keyTimes}
   *
   * @param smilKeyTimesValue The type is <code>String</code>
   */
  public void setSmilKeyTimesAttribute(String smilKeyTimesValue) {
    SmilKeyTimesAttribute attr = new SmilKeyTimesAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(smilKeyTimesValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SmilRepeatCountAttribute</code>
   * , See {@odf.attribute smil:repeatCount}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSmilRepeatCountAttribute() {
    SmilRepeatCountAttribute attr =
        (SmilRepeatCountAttribute) getOdfAttribute(OdfDocumentNamespace.SMIL, "repeatCount");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SmilRepeatCountAttribute</code> , See
   * {@odf.attribute smil:repeatCount}
   *
   * @param smilRepeatCountValue The type is <code>String</code>
   */
  public void setSmilRepeatCountAttribute(String smilRepeatCountValue) {
    SmilRepeatCountAttribute attr = new SmilRepeatCountAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(smilRepeatCountValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SmilRepeatDurAttribute</code> ,
   * See {@odf.attribute smil:repeatDur}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSmilRepeatDurAttribute() {
    SmilRepeatDurAttribute attr =
        (SmilRepeatDurAttribute) getOdfAttribute(OdfDocumentNamespace.SMIL, "repeatDur");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SmilRepeatDurAttribute</code> , See
   * {@odf.attribute smil:repeatDur}
   *
   * @param smilRepeatDurValue The type is <code>String</code>
   */
  public void setSmilRepeatDurAttribute(String smilRepeatDurValue) {
    SmilRepeatDurAttribute attr = new SmilRepeatDurAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(smilRepeatDurValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SmilRestartAttribute</code> ,
   * See {@odf.attribute smil:restart}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSmilRestartAttribute() {
    SmilRestartAttribute attr =
        (SmilRestartAttribute) getOdfAttribute(OdfDocumentNamespace.SMIL, "restart");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return SmilRestartAttribute.DEFAULT_VALUE;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SmilRestartAttribute</code> , See
   * {@odf.attribute smil:restart}
   *
   * @param smilRestartValue The type is <code>String</code>
   */
  public void setSmilRestartAttribute(String smilRestartValue) {
    SmilRestartAttribute attr = new SmilRestartAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(smilRestartValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SmilRestartDefaultAttribute
   * </code> , See {@odf.attribute smil:restartDefault}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSmilRestartDefaultAttribute() {
    SmilRestartDefaultAttribute attr =
        (SmilRestartDefaultAttribute) getOdfAttribute(OdfDocumentNamespace.SMIL, "restartDefault");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return SmilRestartDefaultAttribute.DEFAULT_VALUE;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SmilRestartDefaultAttribute</code> ,
   * See {@odf.attribute smil:restartDefault}
   *
   * @param smilRestartDefaultValue The type is <code>String</code>
   */
  public void setSmilRestartDefaultAttribute(String smilRestartDefaultValue) {
    SmilRestartDefaultAttribute attr =
        new SmilRestartDefaultAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(smilRestartDefaultValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SmilTargetElementAttribute
   * </code> , See {@odf.attribute smil:targetElement}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSmilTargetElementAttribute() {
    SmilTargetElementAttribute attr =
        (SmilTargetElementAttribute) getOdfAttribute(OdfDocumentNamespace.SMIL, "targetElement");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SmilTargetElementAttribute</code> , See
   * {@odf.attribute smil:targetElement}
   *
   * @param smilTargetElementValue The type is <code>String</code>
   */
  public void setSmilTargetElementAttribute(String smilTargetElementValue) {
    SmilTargetElementAttribute attr =
        new SmilTargetElementAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(smilTargetElementValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SmilToAttribute</code> , See
   * {@odf.attribute smil:to}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSmilToAttribute() {
    SmilToAttribute attr = (SmilToAttribute) getOdfAttribute(OdfDocumentNamespace.SMIL, "to");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SmilToAttribute</code> , See
   * {@odf.attribute smil:to}
   *
   * @param smilToValue The type is <code>String</code>
   */
  public void setSmilToAttribute(String smilToValue) {
    SmilToAttribute attr = new SmilToAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(smilToValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SmilValuesAttribute</code> ,
   * See {@odf.attribute smil:values}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSmilValuesAttribute() {
    SmilValuesAttribute attr =
        (SmilValuesAttribute) getOdfAttribute(OdfDocumentNamespace.SMIL, "values");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SmilValuesAttribute</code> , See
   * {@odf.attribute smil:values}
   *
   * @param smilValuesValue The type is <code>String</code>
   */
  public void setSmilValuesAttribute(String smilValuesValue) {
    SmilValuesAttribute attr = new SmilValuesAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(smilValuesValue);
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
