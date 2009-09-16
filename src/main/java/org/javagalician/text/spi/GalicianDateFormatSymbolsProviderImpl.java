package org.javagalician.text.spi;

import java.text.DateFormatSymbols;
import java.text.spi.DateFormatSymbolsProvider;
import java.util.Arrays;
import java.util.Locale;

import org.javagalician.text.GalicianDateFormatSymbols;


public class GalicianDateFormatSymbolsProviderImpl extends DateFormatSymbolsProvider {

    private static final Locale GALICIAN_LOCALE = new Locale("gl","ES");
    private static final Locale[] GALICIAN_LOCALE_ARRAY = new Locale[] { GALICIAN_LOCALE };
    
    
    
    
    public GalicianDateFormatSymbolsProviderImpl() {
        super();
    }
    
    

    @Override
    public DateFormatSymbols getInstance(final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (GALICIAN_LOCALE.equals(locale)){
            return GalicianDateFormatSymbols.INSTANCE;
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" " +
        		"is not one of the supported locales (" +  Arrays.asList(GALICIAN_LOCALE_ARRAY) + ")");
    }

    @Override
    public Locale[] getAvailableLocales() {
        return GALICIAN_LOCALE_ARRAY;
    }

}
