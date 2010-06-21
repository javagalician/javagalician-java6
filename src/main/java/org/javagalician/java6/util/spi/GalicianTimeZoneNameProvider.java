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
package org.javagalician.java6.util.spi;

import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;
import java.util.spi.TimeZoneNameProvider;

import org.javagalician.java6.constants.Locales;

public final class GalicianTimeZoneNameProvider extends TimeZoneNameProvider {

    
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
        if (Locales.GALICIAN_LIST.contains(locale)){
            
            final DateFormatSymbols symbols = DateFormatSymbols.getInstance(Locales.GALICIAN_ES);
            final String[][] zoneStrings = symbols.getZoneStrings();
            /*
             * First, try to retrieve a name using the specified ID as the main timezone ID
             */
            for (int i = 0; i < zoneStrings.length; i++) {
                if (ID.equalsIgnoreCase(zoneStrings[i][0])) {
                    switch (style) {
                        case TimeZone.LONG :
                            return (daylight? zoneStrings[i][3] : zoneStrings[i][1]);
                        case TimeZone.SHORT :
                            return (daylight? zoneStrings[i][4] : zoneStrings[i][2]);
                    }
                }
            }
            /*
             * Then try to retrieve a name using the specified ID as a short name 
             * (first, non-daylight saving - then, daylight-saving).
             */
            if (!daylight) {
                for (int i = 0; i < zoneStrings.length; i++) {
                    if (ID.equalsIgnoreCase(zoneStrings[i][2])) {
                        switch (style) {
                            case TimeZone.LONG :
                                return (daylight? zoneStrings[i][3] : zoneStrings[i][1]);
                            case TimeZone.SHORT :
                                return (daylight? zoneStrings[i][4] : zoneStrings[i][2]);
                        }
                    }
                }
            } else {
                for (int i = 0; i < zoneStrings.length; i++) {
                    if (ID.equalsIgnoreCase(zoneStrings[i][4])) {
                        switch (style) {
                            case TimeZone.LONG :
                                return (daylight? zoneStrings[i][3] : zoneStrings[i][1]);
                            case TimeZone.SHORT :
                                return (daylight? zoneStrings[i][4] : zoneStrings[i][2]);
                        }
                    }
                }
            }
            
            /*
             * If we don't have a name yet, default to en_US
             */
            final TimeZone timeZone = TimeZone.getTimeZone(ID);
            return timeZone.getDisplayName(new Locale("en","US"));
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" " +
                "is not one of the supported locales (" +  Arrays.asList(Locales.GALICIAN_ARRAY) + ")");
    }
    
    
    
    private static boolean isStyleValid(final int style) {
        return (style == TimeZone.SHORT || style == TimeZone.LONG);
    }

    
    @Override
    public Locale[] getAvailableLocales() {
        return Locales.GALICIAN_ARRAY;
    }

    
}
