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

import java.text.BreakIterator;
import java.text.spi.BreakIteratorProvider;
import java.util.Arrays;
import java.util.Locale;

import org.javagalician.constants.Locales;

public final class GalicianBreakIteratorProvider extends BreakIteratorProvider {

    
    
    public GalicianBreakIteratorProvider() {
        super();
    }

    
    
    @Override
    public BreakIterator getCharacterInstance(final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (Locales.GALICIAN.equals(locale)){
            return BreakIterator.getCharacterInstance(Locales.CASTILIAN); 
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" " +
                "is not one of the supported locales (" +  Arrays.asList(Locales.GALICIAN_ARRAY) + ")");
    }

    @Override
    public BreakIterator getLineInstance(final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (Locales.GALICIAN.equals(locale)){
            return BreakIterator.getLineInstance(Locales.CASTILIAN); 
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" " +
                "is not one of the supported locales (" +  Arrays.asList(Locales.GALICIAN_ARRAY) + ")");
    }

    @Override
    public BreakIterator getSentenceInstance(final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (Locales.GALICIAN.equals(locale)){
            return BreakIterator.getSentenceInstance(Locales.CASTILIAN); 
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" " +
                "is not one of the supported locales (" +  Arrays.asList(Locales.GALICIAN_ARRAY) + ")");
    }

    @Override
    public BreakIterator getWordInstance(final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (Locales.GALICIAN.equals(locale)){
            return BreakIterator.getWordInstance(Locales.CASTILIAN); 
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" " +
                "is not one of the supported locales (" +  Arrays.asList(Locales.GALICIAN_ARRAY) + ")");
    }

    @Override
    public Locale[] getAvailableLocales() {
        return Locales.GALICIAN_ARRAY;
    }

}
