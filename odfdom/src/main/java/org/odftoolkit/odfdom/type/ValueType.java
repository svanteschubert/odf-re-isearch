/**
 * **********************************************************************
 *
 * <p>Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * <p>**********************************************************************
 */
package org.odftoolkit.odfdom.type;

/** This class represents the in OpenDocument format used data type {@odf.datatype valueType} */
public enum ValueType implements OdfDataType {
  STRING("string"),
  TIME("time"),
  CURRENCY("currency"),
  FLOAT("float"),
  DATE("date"),
  BOOLEAN("boolean"),
  PERCENTAGE("percentage");
  private String mValue;

  ValueType(String aValue) {
    mValue = aValue;
  }

  /**
   * gets the name of this enum.
   *
   * @return return the name of ValueType
   */
  @Override
  public String toString() {
    return mValue;
  }

  /**
   * enum to String, gets the name of this enum constant as a string.
   *
   * @param aEnum the constant of ValueType
   * @return return the name of ValueType
   */
  public static String toString(ValueType aEnum) {
    return aEnum.toString();
  }

  /**
   * String to enum, turns a String into its corresponding enum constant
   *
   * @param stringValue the name of ValueType
   * @return return the constant of ValueType
   */
  public static ValueType enumValueOf(String stringValue) {
    for (ValueType aIter : values()) {
      if (stringValue.equals(aIter.toString())) {
        return aIter;
      }
    }
    return null;
  }

  /**
   * check if the specified String is a valid {@odf.datatype valueType} data type
   *
   * @param stringValue the value to be tested
   * @return true if the value of argument is valid for {@odf.datatype valueType} data type false
   *     otherwise
   */
  public static boolean isValid(String stringValue) {
    if (stringValue == null) {
      return false;
    }

    if (ValueType.enumValueOf(stringValue) != null) {
      return true;
    } else {
      return false;
    }
  }
}
