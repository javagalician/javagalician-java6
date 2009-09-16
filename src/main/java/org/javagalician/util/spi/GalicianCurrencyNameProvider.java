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

import java.util.Arrays;
import java.util.Currency;
import java.util.Locale;
import java.util.spi.CurrencyNameProvider;

public final class GalicianCurrencyNameProvider extends CurrencyNameProvider {

    private static final Locale GALICIAN_LOCALE = new Locale("gl","ES");
    private static final Locale[] GALICIAN_LOCALE_ARRAY = new Locale[] { GALICIAN_LOCALE };

    private static final Locale CASTILIAN_LOCALE = new Locale("es","ES");

    
    public GalicianCurrencyNameProvider() {
        super();
    }
    
    @Override
    public String getSymbol(final String currencyCode, final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (GALICIAN_LOCALE.equals(locale)){
            return Currency.getInstance(currencyCode).getSymbol(CASTILIAN_LOCALE); 
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" " +
                "is not one of the supported locales (" +  Arrays.asList(GALICIAN_LOCALE_ARRAY) + ")");
    }

    @Override
    public Locale[] getAvailableLocales() {
        return GALICIAN_LOCALE_ARRAY;
    }

}
