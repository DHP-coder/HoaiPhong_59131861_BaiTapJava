/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author DangHoaiPhong
 */
public class NhanVien {
    //Khai bao bien
    public String ten;
    public int tuoi;
    public String diachi;
    public double tienluong;
    public int tongsogiolam;
    //Gan thong tin nhan vien
    public NhanVien(String ten,int tuoi,String diachi,double tienluong,int tongsogiolam){
    this.ten=ten;
    this.tuoi=tuoi;
    this.diachi=diachi;
    this.tienluong=tienluong;
    this.tongsogiolam=tongsogiolam;
    this.getThongTin();
    }
    //Cac phuong thuc
    //Tra ve thong tin nhan vien
    public void getThongTin(){
        System.out.println("Ten nhan vien: "+ ten);
        System.out.println("Tuoi nhan vien: "+ tuoi);
        System.out.println("Dia chi nhan vien: "+ diachi);
        System.out.println("Tien luong nhan vien "+ tienluong);
        System.out.println("Tong so gio lam cua nhan vien "+ tongsogiolam);
        System.out.println("Thuong "+ tinhThuong());
        System.out.println("Tong luong "+ (tienluong+tinhThuong()));
    }
    public double tinhThuong(){
    double tienthuong;
    if(tongsogiolam>=200)
        tienthuong=tienluong*0.2;
    else if (tongsogiolam>=100&&tongsogiolam<200)
        tienthuong=tienluong*0.1;
    else tienthuong=0;
    return tienthuong;
    }
}
