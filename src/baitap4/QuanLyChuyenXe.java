/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

import java.util.ArrayList;

/**
 *
 * @author DangHoaiPhong
 */
public class QuanLyChuyenXe {
    
    public ArrayList<ChuyenXe> dsChuyenXe = new ArrayList<>();

    
    public void themChuyenXe(ChuyenXe cx) {
      dsChuyenXe.add(cx);
    }

    
    public ArrayList<ChuyenXe> xuatDsChuyenXe() {
      return dsChuyenXe;
    }

    
    public void inThongTin() {
      for(ChuyenXe cx : dsChuyenXe) {
        cx.xuat();
      }
    }

    
    public double tongDoanhThuNoiThanh() {
      double doanhThu = 0;
      for (ChuyenXe cx : dsChuyenXe) {
        if (cx instanceof XeNoiThanh) {
          doanhThu += cx.doanhThu;
        }
      }
      return doanhThu;
    }

    
    public double tongDoanhThuNgoaiThanh() {
      double doanhThu = 0;
      for (ChuyenXe cx : dsChuyenXe) {
        if (cx instanceof XeNgoaiThanh) {
          doanhThu += cx.doanhThu;
        }
      }
      return doanhThu;
    }

    
    public double tongDoanhThu() {
      double doanhThu = 0;
      for (ChuyenXe cx : dsChuyenXe) {
        doanhThu += cx.doanhThu;
      }
      return doanhThu;
    }
}
