package net.sunilkumar.showcase;


public class NumralConverter {

    int convertToDecimal(String number){
        
        char[] romanDigits = number.toCharArray();
        int num =0;
        switch (romanDigits.length) {
            case 1:
                num = toInt(romanDigits[0]);
                break;
            case 2:
                int num1 = toInt(romanDigits[0]);
                int num2 = toInt(romanDigits[1]);
                if (num1 < num2){
                    num = - num1 + num2;
                } else {
                    num = num1 + num2;
                }
                break;
            case 3:
                 int num3 = toInt(romanDigits[0]);
                 int num4 = toInt(romanDigits[1]);
                 int num5 = toInt(romanDigits[2]);
                 if(num3 < num4) {
                     num = -num3 + num4 +num5;
                 } else if (num4 < num5){
                     num = num3 - num4 + num5;
                 } else {
                     num = num3  + num4 + num5;
                 }
                break;
            case 4:
                int num6 = toInt(romanDigits[0]);
                int num7 = toInt(romanDigits[1]);
                int num8 = toInt(romanDigits[2]);
                int num9 = toInt(romanDigits[3]);
                if( num8 < num9){
                    num = num6 + num7 - num8 + num9;
                }else {
                    num = num6 + num7 + num8 + num9;
                }
                break;
        }

        return num;
    }

    private int toInt(char ch) {
        return RomanNumrals.valueOf(Character.toString(ch)).decimalValue();
    }

    public String convertToRoman(int number) {
        String numberOfDigit = String.valueOf(number);
        char[] decimalChar = numberOfDigit.toCharArray();
        StringBuilder str = new StringBuilder();
        switch (decimalChar.length) {
            case 1:
                str.append(createRomanNumralForSingleDigit(number, decimalChar[0]));
                break;
            case 2:
                String char1 = String.valueOf(decimalChar[0]);
                String char2 = String.valueOf(decimalChar[1]);
                
                for(int tenthPlace = 0; tenthPlace < Integer.parseInt(char1); tenthPlace++){
                    str.append("X");
                }
                str.append(createRomanNumralForSingleDigit(Integer.parseInt(char2), decimalChar[1]));
                break;
            case 3 :
                String char3 = String.valueOf(decimalChar[0]);
                String char4 = String.valueOf(decimalChar[1]);
                String char5 = String.valueOf(decimalChar[2]);
                for(int hundredThPlace = 0; hundredThPlace < Integer.parseInt(char3); hundredThPlace++){
                    str.append("C");
                }
                
                for(int tenthPlace = 0; tenthPlace < Integer.parseInt(char4); tenthPlace++){
                    str.append("X");
                }
                str.append(createRomanNumralForSingleDigit(Integer.parseInt(char5), decimalChar[2]));
                break;
                
                
        }
        return str.toString();
    }

    private String createRomanNumralForSingleDigit(int number, char character) {
        RomanNumrals[] numrals = RomanNumrals.values();
        StringBuilder str = new StringBuilder();
        for(int i=0; i< numrals.length; i++){
            if (Integer.parseInt(String.valueOf(character)) == numrals[i].decimalValue()){
                str.append(numrals[i]);
                break;
            }
        }
            
        if (numrals[1].decimalValue() > number ){
            int diff = numrals[1].decimalValue() - number;
            if(diff == 1){
                str.append("I");
                str.append("V");
            }
            if(diff == 2){
                str.append("III");
            }
            if(diff == 3){
                str.append("II");
            }
        } else {
            int diff = numrals[2].decimalValue() - number;
            if(diff == 1){
                str.append("I");
                str.append("X");
            }
            if(diff == 2){
                str.append("VIII");
            }
            if(diff == 3){
                str.append("VII");
            }
            if(diff == 4){
                str.append("VI");
            }
            
        }
        return str.toString();
    }
}
