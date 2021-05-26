/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kvlxd.entity;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class HoaDonNhap {
   private  int MaHDN;
   private String MaNV;
   private String MaNCC;
   private String TenLaiXe;
   private String SDTLaiXe;
   private Date NgayNhap;

    public HoaDonNhap() {
    }

    public int getMaHDN() {
        return MaHDN;
    }

    public void setMaHDN(int MaHDN) {
        this.MaHDN = MaHDN;
    }

    

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public String getTenLaiXe() {
        return TenLaiXe;
    }

    public void setTenLaiXe(String TenLaiXe) {
        this.TenLaiXe = TenLaiXe;
    }

    public String getSDTLaiXe() {
        return SDTLaiXe;
    }

    public void setSDTLaiXe(String SDTLaiXe) {
        this.SDTLaiXe = SDTLaiXe;
    }

    public Date getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(Date NgayNhap) {
        this.NgayNhap = NgayNhap;
    }
   
   
}
