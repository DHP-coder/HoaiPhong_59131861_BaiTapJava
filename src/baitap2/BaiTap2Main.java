/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import baitap1.NhanVien;

/**
 *
 * @author DangHoaiPhong
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Khoi tao danh sach nhan vien
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        
        //Khoi tao 5 nhan vien
        NhanVien nv1 = new NhanVien("Lionel Messi", 30, "Agentina", 80000000, 210);
        NhanVien nv2 = new NhanVien("Uchiha Itachi", 24, "Konoha", 1000000, 100);
        NhanVien nv3 = new NhanVien("Dang Van Lam", 26, "Viet Nam", 4000000, 80);
        NhanVien nv4 = new NhanVien("Shen Long", 57, "Trung Quoc", 10000000, 200);
        NhanVien nv5 = new NhanVien("Kiatisak", 37, "Thai Lan", 8000000, 220);
        
        // Them 5 nhan vien vao danh sach
        qlnv.them(nv1);
        qlnv.them(nv2);
        qlnv.them(nv3);
        qlnv.them(nv4);
        qlnv.them(nv5);
        
        // In danh sach nhan vien ra man hinh
        qlnv.inDS();
    }
    
}
