/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

/**
 *
 * @author DangHoaiPhong
 */
abstract class ChuyenXe {
    public String maSoChuyen;
    public String hoTenTaiXe;
    public String soXe;
    public double doanhThu;
    
    public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu){
    this.maSoChuyen=maSoChuyen;
    this.hoTenTaiXe=hoTenTaiXe;
    this.soXe=soXe;
    this.doanhThu=doanhThu;
    }
    
    public void xuat(){
    System.out.println("Ma chuyen xe: " + this.maSoChuyen);
      System.out.println("Ho ten tai xe: " + this.hoTenTaiXe);
      System.out.println("So xe: " + this.soXe);
      System.out.printf("Doanh thu: %.00f\n", this.doanhThu);
    }
}
