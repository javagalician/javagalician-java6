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
package org.javagalician.text.spi;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.spi.NumberFormatProvider;
import java.util.Arrays;
import java.util.Locale;

import org.javagalician.text.GalicianDecimalFormatSymbols;

public final class GalicianNumberFormatProvider extends NumberFormatProvider {

    private static final Locale GALICIAN_LOCALE = new Locale("gl","ES");
    private static final Locale[] GALICIAN_LOCALE_ARRAY = new Locale[] { GALICIAN_LOCALE };

    private static final Locale CASTILIAN_LOCALE = new Locale("es","ES");
    
    
    public GalicianNumberFormatProvider() {
        super();
    }
    
    
    @Override
    public NumberFormat getCurrencyInstance(final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (GALICIAN_LOCALE.equals(locale)){
            final NumberFormat format = NumberFormat.getCurrencyInstance(CASTILIAN_LOCALE);
            if (format instanceof DecimalFormat) {
                ((DecimalFormat)format).setDecimalFormatSymbols(new GalicianDecimalFormatSymbols());
            }
            return format; 
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" " +
                "is not one of the supported locales (" +  Arrays.asList(GALICIAN_LOCALE_ARRAY) + ")");
    }

    @Override
    public NumberFormat getIntegerInstance(final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (GALICIAN_LOCALE.equals(locale)){
            final NumberFormat format = NumberFormat.getIntegerInstance(CASTILIAN_LOCALE);
            if (format instanceof DecimalFormat) {
                ((DecimalFormat)format).setDecimalFormatSymbols(new GalicianDecimalFormatSymbols());
            }
            return format; 
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" " +
                "is not one of the supported locales (" +  Arrays.asList(GALICIAN_LOCALE_ARRAY) + ")");
    }

    @Override
    public NumberFormat getNumberInstance(final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (GALICIAN_LOCALE.equals(locale)){
            final NumberFormat format = NumberFormat.getNumberInstance(CASTILIAN_LOCALE);
            if (format instanceof DecimalFormat) {
                ((DecimalFormat)format).setDecimalFormatSymbols(new GalicianDecimalFormatSymbols());
            }
            return format; 
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" " +
                "is not one of the supported locales (" +  Arrays.asList(GALICIAN_LOCALE_ARRAY) + ")");
    }

    @Override
    public NumberFormat getPercentInstance(final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (GALICIAN_LOCALE.equals(locale)){
            final NumberFormat format = NumberFormat.getPercentInstance(CASTILIAN_LOCALE);
            if (format instanceof DecimalFormat) {
                ((DecimalFormat)format).setDecimalFormatSymbols(new GalicianDecimalFormatSymbols());
            }
            return format; 
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" " +
                "is not one of the supported locales (" +  Arrays.asList(GALICIAN_LOCALE_ARRAY) + ")");
    }

    
    
    @Override
    public Locale[] getAvailableLocales() {
        return GALICIAN_LOCALE_ARRAY;
    }

}
