package net.sunilkumar.showcase;

public enum RomanNumrals {
    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);
    
    private int value;

    private RomanNumrals(int value) {
        this.value = value;
    }
    
    public int decimalValue(){
        return this.value;
    }
}
