package org.javagalician.text;

import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class GalicianDecimalFormatSymbols extends DecimalFormatSymbols {

    private static final long serialVersionUID = 1695685661887828997L;

    public static GalicianDecimalFormatSymbols INSTANCE = new GalicianDecimalFormatSymbols();

    
    public GalicianDecimalFormatSymbols() {
        super(new Locale("es","ES"));
    }
    

}
