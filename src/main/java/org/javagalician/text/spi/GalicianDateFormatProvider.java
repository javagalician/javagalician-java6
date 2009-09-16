package org.javagalician.text.spi;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.spi.DateFormatProvider;
import java.util.Arrays;
import java.util.Locale;


public class GalicianDateFormatProvider extends DateFormatProvider {

    private static final Locale GALICIAN_LOCALE = new Locale("gl","ES");
    private static final Locale[] GALICIAN_LOCALE_ARRAY = new Locale[] { GALICIAN_LOCALE };
    
    private static final String PATTERN_DATE_SHORT = "d'/'MM'/'yy";
    private static final String PATTERN_DATE_MEDIUM = "dd'-'MMM'-'yyyy";
    private static final String PATTERN_DATE_LONG = "d 'de' MMMM 'de' yyyy";
    private static final String PATTERN_DATE_FULL = "EEEE d 'de' MMMM 'de' yyyy";
    
    private static final String PATTERN_TIME_SHORT = "H':'mm";
    private static final String PATTERN_TIME_MEDIUM = "H':'mm':'ss";
    private static final String PATTERN_TIME_LONG = "H':'mm':'ss z";
    private static final String PATTERN_TIME_FULL = "HH'H'mm'' z";
    
    
    
    public GalicianDateFormatProvider() {
        super();
    }
    
    

    @Override
    public DateFormat getDateInstance(final int style, final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (!isStyleValid(style)) {
            throw new IllegalArgumentException("Style \"" + style + "\" is not valid");
        }
        if (GALICIAN_LOCALE.equals(locale)){
            if (style == DateFormat.FULL) {
                return new SimpleDateFormat(PATTERN_DATE_FULL, locale); 
            }
            if (style == DateFormat.LONG) {
                return new SimpleDateFormat(PATTERN_DATE_LONG, locale); 
            }
            if (style == DateFormat.MEDIUM) {
                return new SimpleDateFormat(PATTERN_DATE_MEDIUM, locale); 
            }
            if (style == DateFormat.SHORT) {
                return new SimpleDateFormat(PATTERN_DATE_SHORT, locale); 
            }
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" " +
                "is not one of the supported locales (" +  Arrays.asList(GALICIAN_LOCALE_ARRAY) + ")");
    }



    @Override
    public DateFormat getDateTimeInstance(final int dateStyle, final int timeStyle, final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (!isStyleValid(dateStyle)) {
            throw new IllegalArgumentException("Style \"" + dateStyle + "\" is not valid");
        }
        if (!isStyleValid(timeStyle)) {
            throw new IllegalArgumentException("Style \"" + timeStyle + "\" is not valid");
        }
        if (GALICIAN_LOCALE.equals(locale)){
            
            final StringBuffer pattern = new StringBuffer();
            if (dateStyle == DateFormat.FULL) {
                pattern.append(PATTERN_DATE_FULL); 
            } else if (dateStyle == DateFormat.LONG) {
                pattern.append(PATTERN_DATE_LONG); 
            } else if (dateStyle == DateFormat.MEDIUM) {
                pattern.append(PATTERN_DATE_MEDIUM); 
            } else  if (dateStyle == DateFormat.SHORT) {
                pattern.append(PATTERN_DATE_SHORT); 
            }
            pattern.append(" ");
            if (timeStyle == DateFormat.FULL) {
                pattern.append(PATTERN_TIME_FULL); 
            } else if (timeStyle == DateFormat.LONG) {
                pattern.append(PATTERN_TIME_LONG); 
            } else if (timeStyle == DateFormat.MEDIUM) {
                pattern.append(PATTERN_TIME_MEDIUM); 
            } else  if (timeStyle == DateFormat.SHORT) {
                pattern.append(PATTERN_TIME_SHORT); 
            }
            
            return new SimpleDateFormat(pattern.toString(), locale);
            
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" " +
                "is not one of the supported locales (" +  Arrays.asList(GALICIAN_LOCALE_ARRAY) + ")");
    }



    @Override
    public DateFormat getTimeInstance(final int style, final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (!isStyleValid(style)) {
            throw new IllegalArgumentException("Style \"" + style + "\" is not valid");
        }
        if (GALICIAN_LOCALE.equals(locale)){
            if (style == DateFormat.FULL) {
                return new SimpleDateFormat(PATTERN_TIME_FULL, locale); 
            }
            if (style == DateFormat.LONG) {
                return new SimpleDateFormat(PATTERN_TIME_LONG, locale); 
            }
            if (style == DateFormat.MEDIUM) {
                return new SimpleDateFormat(PATTERN_TIME_MEDIUM, locale); 
            }
            if (style == DateFormat.SHORT) {
                return new SimpleDateFormat(PATTERN_TIME_SHORT, locale); 
            }
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" " +
                "is not one of the supported locales (" +  Arrays.asList(GALICIAN_LOCALE_ARRAY) + ")");
    }

    
    
    private static boolean isStyleValid(final int style) {
        if (style == DateFormat.SHORT || style == DateFormat.MEDIUM || 
                style == DateFormat.LONG || style == DateFormat.FULL) {
            return true;
        }
        return false;
    }
    
    
    @Override
    public Locale[] getAvailableLocales() {
        return GALICIAN_LOCALE_ARRAY;
    }

}
