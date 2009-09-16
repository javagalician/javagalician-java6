package org.javagalician.text.spi;

import java.text.DecimalFormatSymbols;
import java.text.spi.DecimalFormatSymbolsProvider;
import java.util.Arrays;
import java.util.Locale;

import org.javagalician.text.GalicianDecimalFormatSymbols;

public class GalicianDecimalFormatSymbolsProvider extends DecimalFormatSymbolsProvider {

    private static final Locale GALICIAN_LOCALE = new Locale("gl","ES");
    private static final Locale[] GALICIAN_LOCALE_ARRAY = new Locale[] { GALICIAN_LOCALE };

    
    public GalicianDecimalFormatSymbolsProvider() {
        super();
    }
    

    
    @Override
    public DecimalFormatSymbols getInstance(final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (GALICIAN_LOCALE.equals(locale)){
            return GalicianDecimalFormatSymbols.INSTANCE;
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" " +
                "is not one of the supported locales (" +  Arrays.asList(GALICIAN_LOCALE_ARRAY) + ")");
    }
    
    

    @Override
    public Locale[] getAvailableLocales() {
        return GALICIAN_LOCALE_ARRAY;
    }

}
