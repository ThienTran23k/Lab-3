package Bai4;

public class Vector {
    public double a ;
    public double b ;
    public double c ;

    public Vector(){

    }
    public Vector(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double geta(){
        return a;
    }
    public double getb(){
        return b;
    }
    public double getc(){
        return c ;
    }
    public void seta(double a){
        this.a = a;
    }
    public void setb(double b){
        this.b = b;
    }
    public void setc(double c){
        this.c = c;
    }
    public double add(double a , double b , double c){
        return 0;
    }
    public double sub(double a , double b , double c){
        return 0;
    }
    public double mul(double a , double b , double c){
        return 0;
    }
    public double TichVoHuong(double a1 , double b1 , double c1 , double a2 , double b2 , double c2){
        return a1 * a2 + b1 * b2 + c1 * c2 ;
    }
}
