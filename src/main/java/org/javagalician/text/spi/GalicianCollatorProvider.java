package org.javagalician.text.spi;

import java.text.Collator;
import java.text.spi.CollatorProvider;
import java.util.Arrays;
import java.util.Locale;

public final class GalicianCollatorProvider extends CollatorProvider {

    private static final Locale GALICIAN_LOCALE = new Locale("gl","ES");
    private static final Locale[] GALICIAN_LOCALE_ARRAY = new Locale[] { GALICIAN_LOCALE };

    private static final Locale CASTILIAN_LOCALE = new Locale("es","ES");

    
    public GalicianCollatorProvider() {
        super();
    }
    
    
    
    @Override
    public Collator getInstance(final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (GALICIAN_LOCALE.equals(locale)){
            return Collator.getInstance(CASTILIAN_LOCALE); 
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" " +
                "is not one of the supported locales (" +  Arrays.asList(GALICIAN_LOCALE_ARRAY) + ")");
    }
    
    

    @Override
    public Locale[] getAvailableLocales() {
        return GALICIAN_LOCALE_ARRAY;
    }

}
