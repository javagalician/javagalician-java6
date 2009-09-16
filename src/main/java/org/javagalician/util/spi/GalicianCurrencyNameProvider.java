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
