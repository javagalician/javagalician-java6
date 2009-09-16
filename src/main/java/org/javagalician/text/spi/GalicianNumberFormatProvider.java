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
