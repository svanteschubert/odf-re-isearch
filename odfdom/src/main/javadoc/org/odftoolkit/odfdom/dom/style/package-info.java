 /*
  DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER

  Copyright 2018-2019 The Document Foundation. All rights reserved.
  Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.

  Use is subject to license terms.

  Licensed under the Apache License, Version 2.0 (the "License"); you may not
  use this file except in compliance with the License. You may obtain a copy
  of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
  obtain a copy of the License at http://odftoolkit.org/docs/license.txt

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

  See the License for the specific language governing permissions and
  limitations under the License.

 ************************************************************************/

/**     Provides classes to create and access ODF styles and ODF style families.
        (DEPRECATED: functionality will be moved to element.style for version 0.8 see <a href="https://odftoolkit.org/bugzilla/show_bug.cgi?id=72">
        <b>Bug&nbsp;72</b></a>)
        Instances of class OdfStyle represent the style of ODF elements.
        Derived style classes for stylable elements were generated from the RelaxNG schema
        and implement Interfaces which specify their possible style property attributes.

        <br>Note:
        Classes OdfListStyle and ListStyle were not generated yet. This will follow in
        upcoming versions.
        <p>
        The class OdfStyleCollection provides access to all styles used in
        the document. The class OdfDocument uses instances of the OdfStyleCollection
        respectively for default-styles, document-styles and for automatic-styles.
        <p>
        Each style-family is associated with a set of properties, e.g. style:family="text"
        is associated with a style:text-properties child element. Some style families contain
        multiple style properties.The associations which properties go with which style
        families were generated from the RelaxNG schema. The class OdfStyleFamily holds a static
        instance for every possible style family which itself contains all possible style
        property attributes.
        <p>
        <!-- ToDo: update class diagram after style refactoring in 0.8
        The following class diagram is neither complete nor very detailed. It has the purpose
        to give a basic overview about how styles are handled by ODFDOM
        <p align="center">
        <img src="../../../../../resources/Abstract_ODFDOM_style.jpg">
         */
package org.odftoolkit.odfdom.dom.style;
