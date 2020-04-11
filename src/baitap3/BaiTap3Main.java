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
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SinhVienIT it = new SinhVienIT("Dang Hoai Phong", "CNTT", 8, 9, 10);
        SinhVienBiz biz = new SinhVienBiz("Nguyen Thi A", "Biz", 6, 7);
        it.xuat();
        System.out.println("diem: " + it.getDiem());
        System.out.println("hoc luc: " + it.getHocLuc());
        biz.xuat();
        System.out.println("diem: " + biz.getDiem());
        System.out.println("hoc luc: " + biz.getHocLuc());
    }
    
}
