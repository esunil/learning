package net.sunilkumar.showcase;

import net.sunilkumar.showcase.NumralConverter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumralConverterTest {
    
    NumralConverter converter;

    @Before
    public void setUp() throws Exception {
        converter = new NumralConverter();
    }

    @After
    public void tearDown() throws Exception {
        converter = null;
    }

    @Test
    public void testTwoDigitNumralwhenFirstIsLess() {
    int convertToDecimal = converter.convertToDecimal("IV");
    assertEquals(4, convertToDecimal);
    }

    @Test
    public void testTwoDigitNumralwhenFirstIsMore() {
        int convertToDecimal = converter.convertToDecimal("XI");
        assertEquals(11, convertToDecimal);
    }

    @Test
    public void testThreeDigitNumral() {
        int convertToDecimal = converter.convertToDecimal("XVI");
        assertEquals(16, convertToDecimal);
    }

    @Test
    public void testThreeDigitNumral1() {
        int convertToDecimal = converter.convertToDecimal("XIV");
        assertEquals(14, convertToDecimal);
    }

    @Test
    public void testThreeDigitNumral2() {
        int convertToDecimal = converter.convertToDecimal("XXI");
        assertEquals(21, convertToDecimal);
    }

    @Test
    public void testThreeDigitNumral3() {
        int convertToDecimal = converter.convertToDecimal("XIX");
        assertEquals(19, convertToDecimal);
    }

    @Test
    public void testFourDigitNumral() {
        int convertToDecimal = converter.convertToDecimal("XIII");
        assertEquals(13, convertToDecimal);
    }

    @Test
    public void testFourDigitNumral1() {
        int convertToDecimal = converter.convertToDecimal("XXIV");
        assertEquals(24, convertToDecimal);
    }

    @Test
    public void testFourDigitNumral2() {
        int convertToDecimal = converter.convertToDecimal("XXVI");
        assertEquals(26, convertToDecimal);
    }

    @Test
    public void testConvertToRoman() {
        String roman = converter.convertToRoman(6);
        assertEquals("VI", roman);
    }

    @Test
    public void testConvertToRoman1() {
        String roman = converter.convertToRoman(9);
        assertEquals("IX", roman);
    }

    @Test
    public void testConvertToRoman2() {
        String roman = converter.convertToRoman(11);
        assertEquals("XI", roman);
    }

    @Test
    public void testConvertToRoman3() {
        String roman = converter.convertToRoman(1);
        assertEquals("I", roman);
    }

    @Test
    public void testConvertToRoman4() {
        String roman = converter.convertToRoman(21);
        assertEquals("XXI", roman);
    }

    @Test
    public void testConvertToRoman5() {
        String roman = converter.convertToRoman(101);
        assertEquals("CI", roman);
    }

}
