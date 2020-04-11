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
public class XeNoiThanh extends ChuyenXe{
    public String soTuyen;
    public double soKm;

    // constructor
    public XeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String soTuyen, double soKm) {
      super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
      this.soTuyen = soTuyen;
      this.soKm = soKm;
    }

    // methods
    // in thong tin
    @Override
    public void xuat() {
      super.xuat();
      System.out.println("Tuyen: " + this.soTuyen);
      System.out.println("So km di duoc: " + this.soKm);
    }
    
}
