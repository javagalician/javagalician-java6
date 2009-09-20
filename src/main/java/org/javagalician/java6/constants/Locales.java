/*
 * =============================================================================
 * 
 *   Copyright (c) 2009, The JAVAGALICIAN team (http://www.javagalician.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.javagalician.java6.constants;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class Locales {

    public static final Locale GALICIAN = new Locale("gl");
    public static final Locale GALICIAN_ES = new Locale("gl","ES");
    public static final Locale[] GALICIAN_ARRAY = new Locale[] { GALICIAN_ES };
    public static final List<Locale> GALICIAN_LIST = Arrays.asList(GALICIAN_ARRAY);

    public static final Locale CASTILIAN = new Locale("es","ES");
    
    
    
    private Locales() {
        super();
    }
    
}
