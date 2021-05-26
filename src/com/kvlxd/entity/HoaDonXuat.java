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
public class HoaDonXuat {

    private int MaHDX;
    private String MaNV;
    private String MaKH;
    private String TenLaiXe;
    private String SDTLaiXe;
    private Date NgayXuat;
    private boolean TrangThai;

    public HoaDonXuat() {
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    public int getMaHDX() {
        return MaHDX;
    }

    public void setMaHDX(int MaHDX) {
        this.MaHDX = MaHDX;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
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

    public Date getNgayXuat() {
        return NgayXuat;
    }

    public void setNgayXuat(Date NgayXuat) {
        this.NgayXuat = NgayXuat;
    }

}
