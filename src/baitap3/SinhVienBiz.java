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
public class SinhVienBiz extends SinhVienPoly{

    public double diemMarketing;
    public double diemSales;
    
    public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSales){
    super(hoTen, nganh);
    this.diemMarketing=diemMarketing;
    this.diemSales=diemSales;
    }
    
    @Override
    double getDiem() {
        return (2*diemMarketing+diemSales)/3;
    }
    
}
