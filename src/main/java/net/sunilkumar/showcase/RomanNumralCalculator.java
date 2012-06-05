package net.sunilkumar.showcase;

public class RomanNumralCalculator {

    private final NumralConverter converter;

    public RomanNumralCalculator(NumralConverter converter) {
        this.converter = converter;
    }

    public String add(String romanNumral1, String romanNumral2) {
        int sum = converter.convertToDecimal(romanNumral1) + converter.convertToDecimal(romanNumral2);
        return converter.convertToRoman(sum);
    }


}
