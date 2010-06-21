package org.javagalician.java6.text;

import java.util.Calendar;
import java.util.TimeZone;

import org.javagalician.java6.constants.Locales;
import org.javagalician.java6.text.GalicianDateFormatSymbols;
import org.javagalician.java6.util.spi.GalicianTimeZoneNameProvider;

import junit.framework.Assert;
import junit.framework.TestCase;

public class GalicianDateFormatSymbolsTest extends TestCase {

    private GalicianDateFormatSymbols dateFormatSymbols;

    public GalicianDateFormatSymbolsTest(final String name) {
        super(name);
    }
    
    @Override
    protected void setUp() throws Exception {
        this.dateFormatSymbols = new GalicianDateFormatSymbols();
    }
    
    
    public void testWeekdays() throws Exception {
        Assert.assertEquals("luns", this.dateFormatSymbols.getWeekdays()[Calendar.MONDAY]);
        Assert.assertEquals("xoves", this.dateFormatSymbols.getWeekdays()[Calendar.THURSDAY]);
        Assert.assertEquals("venres", this.dateFormatSymbols.getWeekdays()[Calendar.FRIDAY]);
    }
    
    public void testTimeZoneNames() throws Exception {
        final TimeZone timeZone1 = TimeZone.getTimeZone("CEST");
        System.out.println(timeZone1.getDisplayName(Locales.GALICIAN_ES));
        System.out.println(timeZone1.getDisplayName(Locales.CASTILIAN));
        final GalicianTimeZoneNameProvider prov = new GalicianTimeZoneNameProvider();
        System.out.println("-"+prov.getDisplayName("CEST", false, TimeZone.LONG, Locales.GALICIAN_ES) + "-");
    }

}
