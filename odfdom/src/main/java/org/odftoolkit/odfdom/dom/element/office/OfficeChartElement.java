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
package org.odftoolkit.odfdom.dom.element.office;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.element.chart.ChartChartElement;
import org.odftoolkit.odfdom.dom.element.table.TableCalculationSettingsElement;
import org.odftoolkit.odfdom.dom.element.table.TableConsolidationElement;
import org.odftoolkit.odfdom.dom.element.table.TableContentValidationsElement;
import org.odftoolkit.odfdom.dom.element.table.TableDataPilotTablesElement;
import org.odftoolkit.odfdom.dom.element.table.TableDatabaseRangesElement;
import org.odftoolkit.odfdom.dom.element.table.TableDdeLinksElement;
import org.odftoolkit.odfdom.dom.element.table.TableLabelRangesElement;
import org.odftoolkit.odfdom.dom.element.table.TableNamedExpressionsElement;
import org.odftoolkit.odfdom.dom.element.text.TextAlphabeticalIndexAutoMarkFileElement;
import org.odftoolkit.odfdom.dom.element.text.TextDdeConnectionDeclsElement;
import org.odftoolkit.odfdom.dom.element.text.TextSequenceDeclsElement;
import org.odftoolkit.odfdom.dom.element.text.TextUserFieldDeclsElement;
import org.odftoolkit.odfdom.dom.element.text.TextVariableDeclsElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element office:chart}. */
public class OfficeChartElement extends OdfElement {

  public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.OFFICE, "chart");

  /**
   * Create the instance of <code>OfficeChartElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public OfficeChartElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element office:chart}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Create child element {@odf.element chart:chart}.
   *
   * @param chartClassValue the <code>String</code> value of <code>ChartClassAttribute</code>, see
   *     {@odf.attribute chart:class} at specification Child element is mandatory.
   * @return the element {@odf.element chart:chart}
   */
  public ChartChartElement newChartChartElement(String chartClassValue) {
    ChartChartElement chartChart =
        ((OdfFileDom) this.ownerDocument).newOdfElement(ChartChartElement.class);
    chartChart.setChartClassAttribute(chartClassValue);
    this.appendChild(chartChart);
    return chartChart;
  }

  /**
   * Create child element {@odf.element table:calculation-settings}.
   *
   * @return the element {@odf.element table:calculation-settings}
   */
  public TableCalculationSettingsElement newTableCalculationSettingsElement() {
    TableCalculationSettingsElement tableCalculationSettings =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TableCalculationSettingsElement.class);
    this.appendChild(tableCalculationSettings);
    return tableCalculationSettings;
  }

  /**
   * Create child element {@odf.element table:consolidation}.
   *
   * @param tableFunctionValue the <code>String</code> value of <code>TableFunctionAttribute</code>,
   *     see {@odf.attribute table:function} at specification
   * @param tableSourceCellRangeAddressesValue the <code>String</code> value of <code>
   *     TableSourceCellRangeAddressesAttribute</code>, see {@odf.attribute
   *     table:source-cell-range-addresses} at specification
   * @param tableTargetCellAddressValue the <code>String</code> value of <code>
   *     TableTargetCellAddressAttribute</code>, see {@odf.attribute table:target-cell-address} at
   *     specification
   * @return the element {@odf.element table:consolidation}
   */
  public TableConsolidationElement newTableConsolidationElement(
      String tableFunctionValue,
      String tableSourceCellRangeAddressesValue,
      String tableTargetCellAddressValue) {
    TableConsolidationElement tableConsolidation =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TableConsolidationElement.class);
    tableConsolidation.setTableFunctionAttribute(tableFunctionValue);
    tableConsolidation.setTableSourceCellRangeAddressesAttribute(
        tableSourceCellRangeAddressesValue);
    tableConsolidation.setTableTargetCellAddressAttribute(tableTargetCellAddressValue);
    this.appendChild(tableConsolidation);
    return tableConsolidation;
  }

  /**
   * Create child element {@odf.element table:content-validations}.
   *
   * @return the element {@odf.element table:content-validations}
   */
  public TableContentValidationsElement newTableContentValidationsElement() {
    TableContentValidationsElement tableContentValidations =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TableContentValidationsElement.class);
    this.appendChild(tableContentValidations);
    return tableContentValidations;
  }

  /**
   * Create child element {@odf.element table:data-pilot-tables}.
   *
   * @return the element {@odf.element table:data-pilot-tables}
   */
  public TableDataPilotTablesElement newTableDataPilotTablesElement() {
    TableDataPilotTablesElement tableDataPilotTables =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TableDataPilotTablesElement.class);
    this.appendChild(tableDataPilotTables);
    return tableDataPilotTables;
  }

  /**
   * Create child element {@odf.element table:database-ranges}.
   *
   * @return the element {@odf.element table:database-ranges}
   */
  public TableDatabaseRangesElement newTableDatabaseRangesElement() {
    TableDatabaseRangesElement tableDatabaseRanges =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TableDatabaseRangesElement.class);
    this.appendChild(tableDatabaseRanges);
    return tableDatabaseRanges;
  }

  /**
   * Create child element {@odf.element table:dde-links}.
   *
   * @return the element {@odf.element table:dde-links}
   */
  public TableDdeLinksElement newTableDdeLinksElement() {
    TableDdeLinksElement tableDdeLinks =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TableDdeLinksElement.class);
    this.appendChild(tableDdeLinks);
    return tableDdeLinks;
  }

  /**
   * Create child element {@odf.element table:label-ranges}.
   *
   * @return the element {@odf.element table:label-ranges}
   */
  public TableLabelRangesElement newTableLabelRangesElement() {
    TableLabelRangesElement tableLabelRanges =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TableLabelRangesElement.class);
    this.appendChild(tableLabelRanges);
    return tableLabelRanges;
  }

  /**
   * Create child element {@odf.element table:named-expressions}.
   *
   * @return the element {@odf.element table:named-expressions}
   */
  public TableNamedExpressionsElement newTableNamedExpressionsElement() {
    TableNamedExpressionsElement tableNamedExpressions =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TableNamedExpressionsElement.class);
    this.appendChild(tableNamedExpressions);
    return tableNamedExpressions;
  }

  /**
   * Create child element {@odf.element text:alphabetical-index-auto-mark-file}.
   *
   * @param xlinkHrefValue the <code>String</code> value of <code>XlinkHrefAttribute</code>, see
   *     {@odf.attribute xlink:href} at specification
   * @param xlinkTypeValue the <code>String</code> value of <code>XlinkTypeAttribute</code>, see
   *     {@odf.attribute xlink:type} at specification
   * @return the element {@odf.element text:alphabetical-index-auto-mark-file}
   */
  public TextAlphabeticalIndexAutoMarkFileElement newTextAlphabeticalIndexAutoMarkFileElement(
      String xlinkHrefValue, String xlinkTypeValue) {
    TextAlphabeticalIndexAutoMarkFileElement textAlphabeticalIndexAutoMarkFile =
        ((OdfFileDom) this.ownerDocument)
            .newOdfElement(TextAlphabeticalIndexAutoMarkFileElement.class);
    textAlphabeticalIndexAutoMarkFile.setXlinkHrefAttribute(xlinkHrefValue);
    textAlphabeticalIndexAutoMarkFile.setXlinkTypeAttribute(xlinkTypeValue);
    this.appendChild(textAlphabeticalIndexAutoMarkFile);
    return textAlphabeticalIndexAutoMarkFile;
  }

  /**
   * Create child element {@odf.element text:dde-connection-decls}.
   *
   * @return the element {@odf.element text:dde-connection-decls}
   */
  public TextDdeConnectionDeclsElement newTextDdeConnectionDeclsElement() {
    TextDdeConnectionDeclsElement textDdeConnectionDecls =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextDdeConnectionDeclsElement.class);
    this.appendChild(textDdeConnectionDecls);
    return textDdeConnectionDecls;
  }

  /**
   * Create child element {@odf.element text:sequence-decls}.
   *
   * @return the element {@odf.element text:sequence-decls}
   */
  public TextSequenceDeclsElement newTextSequenceDeclsElement() {
    TextSequenceDeclsElement textSequenceDecls =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextSequenceDeclsElement.class);
    this.appendChild(textSequenceDecls);
    return textSequenceDecls;
  }

  /**
   * Create child element {@odf.element text:user-field-decls}.
   *
   * @return the element {@odf.element text:user-field-decls}
   */
  public TextUserFieldDeclsElement newTextUserFieldDeclsElement() {
    TextUserFieldDeclsElement textUserFieldDecls =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextUserFieldDeclsElement.class);
    this.appendChild(textUserFieldDecls);
    return textUserFieldDecls;
  }

  /**
   * Create child element {@odf.element text:variable-decls}.
   *
   * @return the element {@odf.element text:variable-decls}
   */
  public TextVariableDeclsElement newTextVariableDeclsElement() {
    TextVariableDeclsElement textVariableDecls =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextVariableDeclsElement.class);
    this.appendChild(textVariableDecls);
    return textVariableDecls;
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
