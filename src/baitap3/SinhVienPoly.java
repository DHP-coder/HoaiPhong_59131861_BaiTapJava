/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author DangHoaiPhong
 */
//Lop truu tuong SinhVienPoly
abstract class SinhVienPoly {
    public String hoTen;
    public String nganh;
    
    public SinhVienPoly(String hoTen, String nganh){
    this.hoTen=hoTen;
    this.nganh=nganh;
    }
    
    //Phuong thuc truu tuong getDiem()
    abstract double getDiem();
    
    //Phuong thuc xet hoc luc
    public String getHocLuc(){
    if(this.getDiem()<5){
    return "Yeu";
    }
    if(this.getDiem()>=5&&this.getDiem()<6.5){
    return "Trung binh";
    }
    if(this.getDiem()>=6.5&&this.getDiem()<7.5){
    return "Kha";
    }
    if(this.getDiem()>=7.5&&this.getDiem()<9){
    return "Gioi";
    }
    return "Xuat sac";
    };
    
    //Phuong thuc xuat ho ten va nganh hoc
    public void xuat(){
    System.out.println("Ho ten: " + this.hoTen + ", nganh hoc: " + this.nganh);
    }
}
