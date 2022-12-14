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
package org.odftoolkit.odfdom.type;

/** This class represents the in OpenDocument format used data type {@odf.datatype styleName} */
public class StyleName implements OdfDataType {

  private String mStyleName;

  /**
   * Construct StyleName by the parsing the given string
   *
   * @param styleName The String to be parsed into StyleName
   * @throws IllegalArgumentException If the given StyleName is null or not valid.
   */
  public StyleName(String styleName) throws IllegalArgumentException {
    if (styleName == null) {
      throw new IllegalArgumentException("A StyleName have to be set and can not be 'null'!");
    }

    // validate 'NCName' type which is defined in W3C schema
    // http://www.w3.org/TR/xmlschema-2/#NCName
    if (W3CSchemaType.isValid("NCName", styleName)) {
      mStyleName = styleName;
    } else {
      throw new IllegalArgumentException("The given StyleName " + styleName + " is invalid!");
    }
  }

  /**
   * Returns a String Object representing this StyleName's value
   *
   * @return a string representation of the value of this StyleName object
   */
  @Override
  public String toString() {
    return mStyleName;
  }

  /**
   * Returns StyleName which is represented by the specified String value
   *
   * @param styleName a String value which can construct an StyleName
   * @return a String representation of an StyleName instance constructed by styleName
   * @throws IllegalArgumentException If the given StyleName is null or not valid.
   */
  public static StyleName valueOf(String styleName) throws IllegalArgumentException {
    return new StyleName(styleName);
  }

  /**
   * check if the specified String is a valid {@odf.datatype styleName} data type
   *
   * @param styleName the value to be tested
   * @return true if the value of argument is valid for {@odf.datatype styleName} data type false
   *     otherwise
   */
  public static boolean isValid(String styleName) {
    if (styleName == null) {
      return false;
    } else {
      return W3CSchemaType.isValid("NCName", styleName);
    }
  }
}
