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
package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.fo.FoCountryAttribute;
import org.odftoolkit.odfdom.dom.attribute.fo.FoLanguageAttribute;
import org.odftoolkit.odfdom.dom.attribute.fo.FoScriptAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleRfcLanguageTagAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextAlphabeticalSeparatorsAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextCapitalizeEntriesAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextCombineEntriesAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextCombineEntriesWithDashAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextCombineEntriesWithPpAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextCommaSeparatedAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextIgnoreCaseAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextIndexScopeAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextMainEntryStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextRelativeTabStopPositionAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextSortAlgorithmAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextUseKeysAsEntriesAttribute;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element text:alphabetical-index-source}. */
public class TextAlphabeticalIndexSourceElement extends OdfElement {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.TEXT, "alphabetical-index-source");

  /**
   * Create the instance of <code>TextAlphabeticalIndexSourceElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public TextAlphabeticalIndexSourceElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element
   *     text:alphabetical-index-source}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FoCountryAttribute</code> , See
   * {@odf.attribute fo:country}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getFoCountryAttribute() {
    FoCountryAttribute attr =
        (FoCountryAttribute) getOdfAttribute(OdfDocumentNamespace.FO, "country");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FoCountryAttribute</code> , See
   * {@odf.attribute fo:country}
   *
   * @param foCountryValue The type is <code>String</code>
   */
  public void setFoCountryAttribute(String foCountryValue) {
    FoCountryAttribute attr = new FoCountryAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(foCountryValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FoLanguageAttribute</code> ,
   * See {@odf.attribute fo:language}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getFoLanguageAttribute() {
    FoLanguageAttribute attr =
        (FoLanguageAttribute) getOdfAttribute(OdfDocumentNamespace.FO, "language");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FoLanguageAttribute</code> , See
   * {@odf.attribute fo:language}
   *
   * @param foLanguageValue The type is <code>String</code>
   */
  public void setFoLanguageAttribute(String foLanguageValue) {
    FoLanguageAttribute attr = new FoLanguageAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(foLanguageValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FoScriptAttribute</code> , See
   * {@odf.attribute fo:script}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getFoScriptAttribute() {
    FoScriptAttribute attr = (FoScriptAttribute) getOdfAttribute(OdfDocumentNamespace.FO, "script");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FoScriptAttribute</code> , See
   * {@odf.attribute fo:script}
   *
   * @param foScriptValue The type is <code>String</code>
   */
  public void setFoScriptAttribute(String foScriptValue) {
    FoScriptAttribute attr = new FoScriptAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(foScriptValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>StyleRfcLanguageTagAttribute
   * </code> , See {@odf.attribute style:rfc-language-tag}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getStyleRfcLanguageTagAttribute() {
    StyleRfcLanguageTagAttribute attr =
        (StyleRfcLanguageTagAttribute)
            getOdfAttribute(OdfDocumentNamespace.STYLE, "rfc-language-tag");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>StyleRfcLanguageTagAttribute</code> ,
   * See {@odf.attribute style:rfc-language-tag}
   *
   * @param styleRfcLanguageTagValue The type is <code>String</code>
   */
  public void setStyleRfcLanguageTagAttribute(String styleRfcLanguageTagValue) {
    StyleRfcLanguageTagAttribute attr =
        new StyleRfcLanguageTagAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(styleRfcLanguageTagValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>
   * TextAlphabeticalSeparatorsAttribute</code> , See {@odf.attribute text:alphabetical-separators}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getTextAlphabeticalSeparatorsAttribute() {
    TextAlphabeticalSeparatorsAttribute attr =
        (TextAlphabeticalSeparatorsAttribute)
            getOdfAttribute(OdfDocumentNamespace.TEXT, "alphabetical-separators");
    if (attr != null && !attr.getValue().isEmpty()) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return Boolean.valueOf(TextAlphabeticalSeparatorsAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TextAlphabeticalSeparatorsAttribute
   * </code> , See {@odf.attribute text:alphabetical-separators}
   *
   * @param textAlphabeticalSeparatorsValue The type is <code>Boolean</code>
   */
  public void setTextAlphabeticalSeparatorsAttribute(Boolean textAlphabeticalSeparatorsValue) {
    TextAlphabeticalSeparatorsAttribute attr =
        new TextAlphabeticalSeparatorsAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(textAlphabeticalSeparatorsValue.booleanValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TextCapitalizeEntriesAttribute
   * </code> , See {@odf.attribute text:capitalize-entries}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getTextCapitalizeEntriesAttribute() {
    TextCapitalizeEntriesAttribute attr =
        (TextCapitalizeEntriesAttribute)
            getOdfAttribute(OdfDocumentNamespace.TEXT, "capitalize-entries");
    if (attr != null && !attr.getValue().isEmpty()) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return Boolean.valueOf(TextCapitalizeEntriesAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TextCapitalizeEntriesAttribute</code> ,
   * See {@odf.attribute text:capitalize-entries}
   *
   * @param textCapitalizeEntriesValue The type is <code>Boolean</code>
   */
  public void setTextCapitalizeEntriesAttribute(Boolean textCapitalizeEntriesValue) {
    TextCapitalizeEntriesAttribute attr =
        new TextCapitalizeEntriesAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(textCapitalizeEntriesValue.booleanValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TextCombineEntriesAttribute
   * </code> , See {@odf.attribute text:combine-entries}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getTextCombineEntriesAttribute() {
    TextCombineEntriesAttribute attr =
        (TextCombineEntriesAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "combine-entries");
    if (attr != null && !attr.getValue().isEmpty()) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return Boolean.valueOf(TextCombineEntriesAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TextCombineEntriesAttribute</code> ,
   * See {@odf.attribute text:combine-entries}
   *
   * @param textCombineEntriesValue The type is <code>Boolean</code>
   */
  public void setTextCombineEntriesAttribute(Boolean textCombineEntriesValue) {
    TextCombineEntriesAttribute attr =
        new TextCombineEntriesAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(textCombineEntriesValue.booleanValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>
   * TextCombineEntriesWithDashAttribute</code> , See {@odf.attribute
   * text:combine-entries-with-dash}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getTextCombineEntriesWithDashAttribute() {
    TextCombineEntriesWithDashAttribute attr =
        (TextCombineEntriesWithDashAttribute)
            getOdfAttribute(OdfDocumentNamespace.TEXT, "combine-entries-with-dash");
    if (attr != null && !attr.getValue().isEmpty()) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return Boolean.valueOf(TextCombineEntriesWithDashAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TextCombineEntriesWithDashAttribute
   * </code> , See {@odf.attribute text:combine-entries-with-dash}
   *
   * @param textCombineEntriesWithDashValue The type is <code>Boolean</code>
   */
  public void setTextCombineEntriesWithDashAttribute(Boolean textCombineEntriesWithDashValue) {
    TextCombineEntriesWithDashAttribute attr =
        new TextCombineEntriesWithDashAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(textCombineEntriesWithDashValue.booleanValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>
   * TextCombineEntriesWithPpAttribute</code> , See {@odf.attribute text:combine-entries-with-pp}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getTextCombineEntriesWithPpAttribute() {
    TextCombineEntriesWithPpAttribute attr =
        (TextCombineEntriesWithPpAttribute)
            getOdfAttribute(OdfDocumentNamespace.TEXT, "combine-entries-with-pp");
    if (attr != null && !attr.getValue().isEmpty()) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return Boolean.valueOf(TextCombineEntriesWithPpAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TextCombineEntriesWithPpAttribute
   * </code> , See {@odf.attribute text:combine-entries-with-pp}
   *
   * @param textCombineEntriesWithPpValue The type is <code>Boolean</code>
   */
  public void setTextCombineEntriesWithPpAttribute(Boolean textCombineEntriesWithPpValue) {
    TextCombineEntriesWithPpAttribute attr =
        new TextCombineEntriesWithPpAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(textCombineEntriesWithPpValue.booleanValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TextCommaSeparatedAttribute
   * </code> , See {@odf.attribute text:comma-separated}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getTextCommaSeparatedAttribute() {
    TextCommaSeparatedAttribute attr =
        (TextCommaSeparatedAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "comma-separated");
    if (attr != null && !attr.getValue().isEmpty()) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return Boolean.valueOf(TextCommaSeparatedAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TextCommaSeparatedAttribute</code> ,
   * See {@odf.attribute text:comma-separated}
   *
   * @param textCommaSeparatedValue The type is <code>Boolean</code>
   */
  public void setTextCommaSeparatedAttribute(Boolean textCommaSeparatedValue) {
    TextCommaSeparatedAttribute attr =
        new TextCommaSeparatedAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(textCommaSeparatedValue.booleanValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TextIgnoreCaseAttribute</code>
   * , See {@odf.attribute text:ignore-case}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getTextIgnoreCaseAttribute() {
    TextIgnoreCaseAttribute attr =
        (TextIgnoreCaseAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "ignore-case");
    if (attr != null && !attr.getValue().isEmpty()) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return Boolean.valueOf(TextIgnoreCaseAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TextIgnoreCaseAttribute</code> , See
   * {@odf.attribute text:ignore-case}
   *
   * @param textIgnoreCaseValue The type is <code>Boolean</code>
   */
  public void setTextIgnoreCaseAttribute(Boolean textIgnoreCaseValue) {
    TextIgnoreCaseAttribute attr = new TextIgnoreCaseAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(textIgnoreCaseValue.booleanValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TextIndexScopeAttribute</code>
   * , See {@odf.attribute text:index-scope}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTextIndexScopeAttribute() {
    TextIndexScopeAttribute attr =
        (TextIndexScopeAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "index-scope");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return TextIndexScopeAttribute.DEFAULT_VALUE;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TextIndexScopeAttribute</code> , See
   * {@odf.attribute text:index-scope}
   *
   * @param textIndexScopeValue The type is <code>String</code>
   */
  public void setTextIndexScopeAttribute(String textIndexScopeValue) {
    TextIndexScopeAttribute attr = new TextIndexScopeAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(textIndexScopeValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TextMainEntryStyleNameAttribute
   * </code> , See {@odf.attribute text:main-entry-style-name}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTextMainEntryStyleNameAttribute() {
    TextMainEntryStyleNameAttribute attr =
        (TextMainEntryStyleNameAttribute)
            getOdfAttribute(OdfDocumentNamespace.TEXT, "main-entry-style-name");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TextMainEntryStyleNameAttribute</code>
   * , See {@odf.attribute text:main-entry-style-name}
   *
   * @param textMainEntryStyleNameValue The type is <code>String</code>
   */
  public void setTextMainEntryStyleNameAttribute(String textMainEntryStyleNameValue) {
    TextMainEntryStyleNameAttribute attr =
        new TextMainEntryStyleNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(textMainEntryStyleNameValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>
   * TextRelativeTabStopPositionAttribute</code> , See {@odf.attribute
   * text:relative-tab-stop-position}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getTextRelativeTabStopPositionAttribute() {
    TextRelativeTabStopPositionAttribute attr =
        (TextRelativeTabStopPositionAttribute)
            getOdfAttribute(OdfDocumentNamespace.TEXT, "relative-tab-stop-position");
    if (attr != null && !attr.getValue().isEmpty()) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return Boolean.valueOf(TextRelativeTabStopPositionAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TextRelativeTabStopPositionAttribute
   * </code> , See {@odf.attribute text:relative-tab-stop-position}
   *
   * @param textRelativeTabStopPositionValue The type is <code>Boolean</code>
   */
  public void setTextRelativeTabStopPositionAttribute(Boolean textRelativeTabStopPositionValue) {
    TextRelativeTabStopPositionAttribute attr =
        new TextRelativeTabStopPositionAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(textRelativeTabStopPositionValue.booleanValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TextSortAlgorithmAttribute
   * </code> , See {@odf.attribute text:sort-algorithm}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTextSortAlgorithmAttribute() {
    TextSortAlgorithmAttribute attr =
        (TextSortAlgorithmAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "sort-algorithm");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TextSortAlgorithmAttribute</code> , See
   * {@odf.attribute text:sort-algorithm}
   *
   * @param textSortAlgorithmValue The type is <code>String</code>
   */
  public void setTextSortAlgorithmAttribute(String textSortAlgorithmValue) {
    TextSortAlgorithmAttribute attr =
        new TextSortAlgorithmAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(textSortAlgorithmValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TextUseKeysAsEntriesAttribute
   * </code> , See {@odf.attribute text:use-keys-as-entries}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getTextUseKeysAsEntriesAttribute() {
    TextUseKeysAsEntriesAttribute attr =
        (TextUseKeysAsEntriesAttribute)
            getOdfAttribute(OdfDocumentNamespace.TEXT, "use-keys-as-entries");
    if (attr != null && !attr.getValue().isEmpty()) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return Boolean.valueOf(TextUseKeysAsEntriesAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TextUseKeysAsEntriesAttribute</code> ,
   * See {@odf.attribute text:use-keys-as-entries}
   *
   * @param textUseKeysAsEntriesValue The type is <code>Boolean</code>
   */
  public void setTextUseKeysAsEntriesAttribute(Boolean textUseKeysAsEntriesValue) {
    TextUseKeysAsEntriesAttribute attr =
        new TextUseKeysAsEntriesAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(textUseKeysAsEntriesValue.booleanValue());
  }

  /**
   * Create child element {@odf.element text:alphabetical-index-entry-template}.
   *
   * @param textOutlineLevelValue the <code>Integer</code> value of <code>TextOutlineLevelAttribute
   *     </code>, see {@odf.attribute text:outline-level} at specification
   * @param textStyleNameValue the <code>String</code> value of <code>TextStyleNameAttribute</code>,
   *     see {@odf.attribute text:style-name} at specification
   * @return the element {@odf.element text:alphabetical-index-entry-template}
   */
  public TextAlphabeticalIndexEntryTemplateElement newTextAlphabeticalIndexEntryTemplateElement(
      int textOutlineLevelValue, String textStyleNameValue) {
    TextAlphabeticalIndexEntryTemplateElement textAlphabeticalIndexEntryTemplate =
        ((OdfFileDom) this.ownerDocument)
            .newOdfElement(TextAlphabeticalIndexEntryTemplateElement.class);
    textAlphabeticalIndexEntryTemplate.setTextOutlineLevelAttribute(textOutlineLevelValue);
    textAlphabeticalIndexEntryTemplate.setTextStyleNameAttribute(textStyleNameValue);
    this.appendChild(textAlphabeticalIndexEntryTemplate);
    return textAlphabeticalIndexEntryTemplate;
  }

  /**
   * Create child element {@odf.element text:index-title-template}.
   *
   * @return the element {@odf.element text:index-title-template}
   */
  public TextIndexTitleTemplateElement newTextIndexTitleTemplateElement() {
    TextIndexTitleTemplateElement textIndexTitleTemplate =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextIndexTitleTemplateElement.class);
    this.appendChild(textIndexTitleTemplate);
    return textIndexTitleTemplate;
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
