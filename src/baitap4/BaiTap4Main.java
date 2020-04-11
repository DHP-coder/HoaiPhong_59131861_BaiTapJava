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
public class BaiTap4Main {

    
    public static void main(String[] args) {
        QuanLyChuyenXe qlcx = new QuanLyChuyenXe();

        ChuyenXe xeNoiThanh1 = new XeNoiThanh("A1", "Dang Van A", "79A-111111", 1000, "Bình Tân - Lê Hồng Phong", 20);
        ChuyenXe xeNoiThanh2 = new XeNoiThanh("A2", "Duong Van B", "79B-222222", 2000, "Bình Tân - Trần Phú", 21);
        ChuyenXe xeNoiThanh3 = new XeNoiThanh("A3", "Nguyen Thi C", "79C-333333", 3000, "Chợ Đầm - Ngô Gia Tự - Sông Lô", 22);

        qlcx.themChuyenXe(xeNoiThanh1);
        qlcx.themChuyenXe(xeNoiThanh2);
        qlcx.themChuyenXe(xeNoiThanh3);

        ChuyenXe xeNgoaiThanh1 = new XeNgoaiThanh("N1", "Dao Quynh D", "80A-444444", 4000, "Nha Trang - Van Gia", 1);
        ChuyenXe xeNgoaiThanh2 = new XeNgoaiThanh("N2", "Tran Van E", "80B-555555", 5000, "Nha Trang - Ninh Tay", 1);
        ChuyenXe xeNgoaiThanh3 = new XeNgoaiThanh("N3", "Nguyen Thi F", "80C-666666", 6000, "Nha Trang - Doc Lech", 1);

        qlcx.themChuyenXe(xeNgoaiThanh1);
        qlcx.themChuyenXe(xeNgoaiThanh2);
        qlcx.themChuyenXe(xeNgoaiThanh3);

        qlcx.inThongTin();

        
        System.out.printf("\nTong doanh thu xe noi thanh: %.00f\n" , qlcx.tongDoanhThuNoiThanh());

        
        System.out.printf("Tong doanh thu xe ngoai thanh: %.00f\n", qlcx.tongDoanhThuNgoaiThanh());

        
        System.out.printf("Tong doanh thu: %.00f\n", qlcx.tongDoanhThu());

        
    }
    
}
