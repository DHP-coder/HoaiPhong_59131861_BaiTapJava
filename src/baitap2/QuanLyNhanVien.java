/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import baitap1.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author DangHoaiPhong
 */
public class QuanLyNhanVien implements IQuanLy{

    ArrayList<NhanVien> arrListNhanVien = new ArrayList<>();
    @Override
    public void them(NhanVien nv) {
        arrListNhanVien.add(nv);
    }

    @Override
    public void inDS() {
        arrListNhanVien.forEach((nv) -> {
            nv.getThongTin();
        });
    }
    
}
