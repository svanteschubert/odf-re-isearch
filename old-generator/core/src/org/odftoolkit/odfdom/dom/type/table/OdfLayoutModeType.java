/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
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
package org.odftoolkit.odfdom.dom.type.table;

public enum OdfLayoutModeType
{
              OUTLINE_SUBTOTALS_BOTTOM( "outline-subtotals-bottom" ), OUTLINE_SUBTOTALS_TOP( "outline-subtotals-top" ), TABULAR_LAYOUT( "tabular-layout" );

    private String m_aValue;

    OdfLayoutModeType( String _aValue )
    {
        m_aValue = _aValue;
    }

    public String toString()
    {
        return m_aValue;
    }

    public static String toString( OdfLayoutModeType _aEnum )
    {
        return _aEnum.toString();
    }

    public static OdfLayoutModeType enumValueOf( String _aString )
    {
        for( OdfLayoutModeType aIter : values() )
        {
            if( _aString.equals( aIter.toString() ) )
            {
                return aIter;
            }
        }
        return null;
    }

}
