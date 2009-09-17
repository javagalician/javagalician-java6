/*
 * =============================================================================
 * 
 *   Copyright (c) 2008, The JAVAGALICIAN team (http://www.javagalician.org)
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
package org.javagalician.util.spi;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;
import java.util.spi.TimeZoneNameProvider;

public final class GalicianTimeZoneNameProvider extends TimeZoneNameProvider {

    private static final Locale GALICIAN_LOCALE = new Locale("gl","ES");
    private static final Locale[] GALICIAN_LOCALE_ARRAY = new Locale[] { GALICIAN_LOCALE };

    
    public GalicianTimeZoneNameProvider() {
        super();
    }
    
    
    @Override
    public String getDisplayName(final String ID, final boolean daylight, final int style, final Locale locale) {
        if (ID == null) {
            throw new NullPointerException();
        }
        if (locale == null) {
            throw new NullPointerException();
        }
        if (!isStyleValid(style)) {
            throw new IllegalArgumentException("Style \"" + style + "\" is not valid");
        }
        if (GALICIAN_LOCALE.equals(locale)){
            final DateFormatSymbols symbols = DateFormatSymbols.getInstance(GALICIAN_LOCALE);
            final String[][] zoneStrings = symbols.getZoneStrings();
            for (int i = 0; i < zoneStrings.length; i++) {
                
            }
            
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" " +
                "is not one of the supported locales (" +  Arrays.asList(GALICIAN_LOCALE_ARRAY) + ")");
    }
    
    
    
    private static boolean isStyleValid(final int style) {
        if (style == TimeZone.SHORT || style == TimeZone.LONG) {
            return true;
        }
        return false;
    }

    
    @Override
    public Locale[] getAvailableLocales() {
        return GALICIAN_LOCALE_ARRAY;
    }

}
