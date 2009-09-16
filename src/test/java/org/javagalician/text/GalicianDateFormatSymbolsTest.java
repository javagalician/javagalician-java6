package org.javagalician.text;

import java.util.Calendar;

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

}
