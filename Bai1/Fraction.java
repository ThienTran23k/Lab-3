package Bai1;

public class Fraction {
    public int numerator ;
    public int denominator;

    public Fraction(){
        this.numerator = 0 ;
        this.denominator = 1;

    }
    public Fraction(int num ,int den){
        this.numerator = num;
        this.denominator = den;

    }
    public  Fraction(float Fraction){

    }
    public Fraction add(float Fraction){
        return null ;
    }
    public Fraction sub(float Fraction){
        return null ;
    }
    public Fraction mul(float Fraction){
        return null ;
    }
    public Fraction div(float Fraction){
        return null ;
    }
    public void reducer(){
    
    }
    public String toString(){
        return "(" + " num = " + this.numerator + " and den = " + this.denominator + ")";
    }

}
