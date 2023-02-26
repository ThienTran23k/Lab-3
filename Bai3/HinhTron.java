package Bai3;


public class HinhTron {
    public double DuongKinh ;
    public double BanKinh ;
    public double pi = 3.14 ;

    public HinhTron(){

    }

    public HinhTron(double DuongKinh ,double BanKinh ,double pi ){
        this.DuongKinh = DuongKinh;
        this.BanKinh = BanKinh;
        this.pi = pi ;
    }
    public double getD(){
        return DuongKinh;
    }
    public double getR(){
        return BanKinh;
    }
    public double getPi(){
        return pi;
    }
    public void setD(double D){
        this.DuongKinh = D;
    }
    public void setR(double R){
        this.BanKinh = R;
    }
    public void setPi(double Pi){
        this.pi = Pi;
    }
    

}
