package Bai5;

import java.util.Scanner;

public class NhanVien {
    public String tenNhanVien;
    public double luongCoBan;
    public double heSoLuong;
    public double LUONG_MAX;

    public NhanVien(){

    }
    public NhanVien(String tenNhanVien ,double luongCoBan , double heSoLuong , double LUONG_MAX ){
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.LUONG_MAX = LUONG_MAX;
    }
    public String gettenNhanvien(){
        return tenNhanVien;
    }
    public double getluongCoban(){
        return luongCoBan ;
    }
    public double getheSoLuong(){
        return heSoLuong;
    }
    public double getLUONG_MAX(){
        return LUONG_MAX;
    }
    public void settenNhanvien(String tenNhanVien){
        this.tenNhanVien = tenNhanVien;
    }
    public void setluongCoBan(double luongCoBan){
        this.luongCoBan = luongCoBan;
    }
    public void setheSoLuong(double heSoLuong){
        this.heSoLuong = heSoLuong;
    }
    public void setLUONG_MAX(double LUONG_MAX){
        this.LUONG_MAX = LUONG_MAX;
    }

    public double Luong(){
        return luongCoBan * heSoLuong;
    }
    public String inTTin(){
        return " Ten nhan vien : " + tenNhanVien ;
    }
    Scanner input = new Scanner(System.in);
    public boolean tangLuong(){
        System.out.print("Nhap he so luong tang them :");
        double hesoTangThem = input.nextDouble();
        double luong = luongCoBan * (heSoLuong + hesoTangThem);
        if (luong> LUONG_MAX){
            System.out.print("Khong duoc phep thay doi");
            return false;
        }
        else{
            return true ;
        }
    }

}
