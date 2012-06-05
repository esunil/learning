package net.sunilkumar.showcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumralCalculatorTest {
    
    private RomanNumralCalculator cal;
    
    @Before
    public void setUp() throws Exception {
        NumralConverter converter = new NumralConverter();
        cal = new RomanNumralCalculator(converter);
    }

    @After
    public void tearDown() throws Exception {
        cal = null;
    }

    @Test
    public void testAddOperation1() {
        String sum = cal.add("I", "V");
        assertEquals(sum, "VI");
    }

    @Test
    public void testAddOperation2() {
        String sum = cal.add("I", "V");
        assertEquals(sum, "VI");
    }

}
