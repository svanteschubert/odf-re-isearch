/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 * 
 * Use is subject to license terms.
 * 
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.pkg.dsig;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;


/**
 * Data signature implementation of OpenDocument element  {@odf.element dsig:document-signatures}.
 *
 */
public class DocumentSignaturesElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfPackageNamespace.DSIG, "document-signatures");

	/**
	 * Create the instance of <code>DocumentSignaturesElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public DocumentSignaturesElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element dsig:document-signatures}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>VersionAttribute</code> , See {@odf.attribute dsig:version}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getVersionAttribute() {
		VersionAttribute attr = (VersionAttribute) getOdfAttribute(VersionAttribute.ATTRIBUTE_NAME);
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>VersionAttribute</code> , See {@odf.attribute dsig:version}
	 *
	 * @param versionValue   The type is <code>String</code>
	 */
	public void setVersionAttribute(String versionValue) {
		VersionAttribute attr = new VersionAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(versionValue);
	}

	/**
	 * Create child element {@odf.element ds:Signature}.
	 *
	 * Child element is mandatory.
	 *
	 * @return the element {@odf.element Signature}
	 */
	public SignatureElement newSignatureElement() {
		SignatureElement signature = ((OdfFileDom) this.ownerDocument).newOdfElement(SignatureElement.class);
		this.appendChild(signature);
		return signature;
	}

}
