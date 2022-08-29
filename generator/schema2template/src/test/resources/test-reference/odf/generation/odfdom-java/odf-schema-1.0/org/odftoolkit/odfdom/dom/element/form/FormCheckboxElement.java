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
package org.odftoolkit.odfdom.dom.element.form;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.element.office.OfficeEventListenersElement;
import org.odftoolkit.odfdom.dom.attribute.form.FormControlImplementationAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormCurrentStateAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormDataFieldAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormDisabledAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormImageAlignAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormImagePositionAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormIsTristateAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormLabelAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormPrintableAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormStateAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormTabIndexAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormTabStopAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormTitleAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormVisualEffectAttribute;
import org.odftoolkit.odfdom.dom.attribute.xforms.XformsBindAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element form:checkbox}.
 *
 */
public class FormCheckboxElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.FORM, "checkbox");

	/**
	 * Create the instance of <code>FormCheckboxElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public FormCheckboxElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element form:checkbox}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormControlImplementationAttribute</code> , See {@odf.attribute form:control-implementation}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormControlImplementationAttribute() {
		FormControlImplementationAttribute attr = (FormControlImplementationAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "control-implementation");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>FormControlImplementationAttribute</code> , See {@odf.attribute form:control-implementation}
	 *
	 * @param formControlImplementationValue   The type is <code>String</code>
	 */
	public void setFormControlImplementationAttribute(String formControlImplementationValue) {
		FormControlImplementationAttribute attr = new FormControlImplementationAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(formControlImplementationValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormCurrentStateAttribute</code> , See {@odf.attribute form:current-state}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormCurrentStateAttribute() {
		FormCurrentStateAttribute attr = (FormCurrentStateAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "current-state");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>FormCurrentStateAttribute</code> , See {@odf.attribute form:current-state}
	 *
	 * @param formCurrentStateValue   The type is <code>String</code>
	 */
	public void setFormCurrentStateAttribute(String formCurrentStateValue) {
		FormCurrentStateAttribute attr = new FormCurrentStateAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(formCurrentStateValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormDataFieldAttribute</code> , See {@odf.attribute form:data-field}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormDataFieldAttribute() {
		FormDataFieldAttribute attr = (FormDataFieldAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "data-field");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>FormDataFieldAttribute</code> , See {@odf.attribute form:data-field}
	 *
	 * @param formDataFieldValue   The type is <code>String</code>
	 */
	public void setFormDataFieldAttribute(String formDataFieldValue) {
		FormDataFieldAttribute attr = new FormDataFieldAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(formDataFieldValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormDisabledAttribute</code> , See {@odf.attribute form:disabled}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getFormDisabledAttribute() {
		FormDisabledAttribute attr = (FormDisabledAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "disabled");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(FormDisabledAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>FormDisabledAttribute</code> , See {@odf.attribute form:disabled}
	 *
	 * @param formDisabledValue   The type is <code>Boolean</code>
	 */
	public void setFormDisabledAttribute(Boolean formDisabledValue) {
		FormDisabledAttribute attr = new FormDisabledAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(formDisabledValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormIdAttribute</code> , See {@odf.attribute form:id}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormIdAttribute() {
		FormIdAttribute attr = (FormIdAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "id");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>FormIdAttribute</code> , See {@odf.attribute form:id}
	 *
	 * @param formIdValue   The type is <code>String</code>
	 */
	public void setFormIdAttribute(String formIdValue) {
		FormIdAttribute attr = new FormIdAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(formIdValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormImageAlignAttribute</code> , See {@odf.attribute form:image-align}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormImageAlignAttribute() {
		FormImageAlignAttribute attr = (FormImageAlignAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "image-align");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return FormImageAlignAttribute.DEFAULT_VALUE;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>FormImageAlignAttribute</code> , See {@odf.attribute form:image-align}
	 *
	 * @param formImageAlignValue   The type is <code>String</code>
	 */
	public void setFormImageAlignAttribute(String formImageAlignValue) {
		FormImageAlignAttribute attr = new FormImageAlignAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(formImageAlignValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormImagePositionAttribute</code> , See {@odf.attribute form:image-position}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormImagePositionAttribute() {
		FormImagePositionAttribute attr = (FormImagePositionAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "image-position");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return FormImagePositionAttribute.DEFAULT_VALUE;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>FormImagePositionAttribute</code> , See {@odf.attribute form:image-position}
	 *
	 * @param formImagePositionValue   The type is <code>String</code>
	 */
	public void setFormImagePositionAttribute(String formImagePositionValue) {
		FormImagePositionAttribute attr = new FormImagePositionAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(formImagePositionValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormIsTristateAttribute</code> , See {@odf.attribute form:is-tristate}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getFormIsTristateAttribute() {
		FormIsTristateAttribute attr = (FormIsTristateAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "is-tristate");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(FormIsTristateAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>FormIsTristateAttribute</code> , See {@odf.attribute form:is-tristate}
	 *
	 * @param formIsTristateValue   The type is <code>Boolean</code>
	 */
	public void setFormIsTristateAttribute(Boolean formIsTristateValue) {
		FormIsTristateAttribute attr = new FormIsTristateAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(formIsTristateValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormLabelAttribute</code> , See {@odf.attribute form:label}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormLabelAttribute() {
		FormLabelAttribute attr = (FormLabelAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "label");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>FormLabelAttribute</code> , See {@odf.attribute form:label}
	 *
	 * @param formLabelValue   The type is <code>String</code>
	 */
	public void setFormLabelAttribute(String formLabelValue) {
		FormLabelAttribute attr = new FormLabelAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(formLabelValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormNameAttribute</code> , See {@odf.attribute form:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormNameAttribute() {
		FormNameAttribute attr = (FormNameAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>FormNameAttribute</code> , See {@odf.attribute form:name}
	 *
	 * @param formNameValue   The type is <code>String</code>
	 */
	public void setFormNameAttribute(String formNameValue) {
		FormNameAttribute attr = new FormNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(formNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormPrintableAttribute</code> , See {@odf.attribute form:printable}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getFormPrintableAttribute() {
		FormPrintableAttribute attr = (FormPrintableAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "printable");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(FormPrintableAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>FormPrintableAttribute</code> , See {@odf.attribute form:printable}
	 *
	 * @param formPrintableValue   The type is <code>Boolean</code>
	 */
	public void setFormPrintableAttribute(Boolean formPrintableValue) {
		FormPrintableAttribute attr = new FormPrintableAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(formPrintableValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormStateAttribute</code> , See {@odf.attribute form:state}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormStateAttribute() {
		FormStateAttribute attr = (FormStateAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "state");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return FormStateAttribute.DEFAULT_VALUE;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>FormStateAttribute</code> , See {@odf.attribute form:state}
	 *
	 * @param formStateValue   The type is <code>String</code>
	 */
	public void setFormStateAttribute(String formStateValue) {
		FormStateAttribute attr = new FormStateAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(formStateValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormTabIndexAttribute</code> , See {@odf.attribute form:tab-index}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getFormTabIndexAttribute() {
		FormTabIndexAttribute attr = (FormTabIndexAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "tab-index");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return Integer.valueOf(FormTabIndexAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>FormTabIndexAttribute</code> , See {@odf.attribute form:tab-index}
	 *
	 * @param formTabIndexValue   The type is <code>Integer</code>
	 */
	public void setFormTabIndexAttribute(Integer formTabIndexValue) {
		FormTabIndexAttribute attr = new FormTabIndexAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(formTabIndexValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormTabStopAttribute</code> , See {@odf.attribute form:tab-stop}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getFormTabStopAttribute() {
		FormTabStopAttribute attr = (FormTabStopAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "tab-stop");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(FormTabStopAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>FormTabStopAttribute</code> , See {@odf.attribute form:tab-stop}
	 *
	 * @param formTabStopValue   The type is <code>Boolean</code>
	 */
	public void setFormTabStopAttribute(Boolean formTabStopValue) {
		FormTabStopAttribute attr = new FormTabStopAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(formTabStopValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormTitleAttribute</code> , See {@odf.attribute form:title}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormTitleAttribute() {
		FormTitleAttribute attr = (FormTitleAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "title");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>FormTitleAttribute</code> , See {@odf.attribute form:title}
	 *
	 * @param formTitleValue   The type is <code>String</code>
	 */
	public void setFormTitleAttribute(String formTitleValue) {
		FormTitleAttribute attr = new FormTitleAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(formTitleValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormValueAttribute</code> , See {@odf.attribute form:value}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormValueAttribute() {
		FormValueAttribute attr = (FormValueAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "value");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>FormValueAttribute</code> , See {@odf.attribute form:value}
	 *
	 * @param formValueValue   The type is <code>String</code>
	 */
	public void setFormValueAttribute(String formValueValue) {
		FormValueAttribute attr = new FormValueAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(formValueValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormVisualEffectAttribute</code> , See {@odf.attribute form:visual-effect}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormVisualEffectAttribute() {
		FormVisualEffectAttribute attr = (FormVisualEffectAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "visual-effect");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>FormVisualEffectAttribute</code> , See {@odf.attribute form:visual-effect}
	 *
	 * @param formVisualEffectValue   The type is <code>String</code>
	 */
	public void setFormVisualEffectAttribute(String formVisualEffectValue) {
		FormVisualEffectAttribute attr = new FormVisualEffectAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(formVisualEffectValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>XformsBindAttribute</code> , See {@odf.attribute xforms:bind}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXformsBindAttribute() {
		XformsBindAttribute attr = (XformsBindAttribute) getOdfAttribute(OdfDocumentNamespace.XFORMS, "bind");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>XformsBindAttribute</code> , See {@odf.attribute xforms:bind}
	 *
	 * @param xformsBindValue   The type is <code>String</code>
	 */
	public void setXformsBindAttribute(String xformsBindValue) {
		XformsBindAttribute attr = new XformsBindAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(xformsBindValue);
	}

	/**
	 * Create child element {@odf.element form:properties}.
	 *
	 * @return the element {@odf.element form:properties}
	 */
	public FormPropertiesElement newFormPropertiesElement() {
		FormPropertiesElement formProperties = ((OdfFileDom) this.ownerDocument).newOdfElement(FormPropertiesElement.class);
		this.appendChild(formProperties);
		return formProperties;
	}

	/**
	 * Create child element {@odf.element office:event-listeners}.
	 *
	 * @return the element {@odf.element office:event-listeners}
	 */
	public OfficeEventListenersElement newOfficeEventListenersElement() {
		OfficeEventListenersElement officeEventListeners = ((OdfFileDom) this.ownerDocument).newOdfElement(OfficeEventListenersElement.class);
		this.appendChild(officeEventListeners);
		return officeEventListeners;
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