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
public class XeNgoaiThanh extends ChuyenXe{
    public String noiDen;
    public int soNgay;
  
    
    public XeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String noiDen, int soNgay) {
    super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
    this.noiDen = noiDen;
    this.soNgay = soNgay;
    }
    
    @Override
    public void xuat() {
      super.xuat();
      System.out.println("Noi den: " + this.noiDen);
      System.out.println("So ngay: " + this.soNgay);
    }
    
}
