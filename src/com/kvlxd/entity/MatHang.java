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
public class MatHang {

    private String MaMH;
    private String MaLH;
    private String MaKe;
    private String TenMH;
    private double DonGia;
    private String DonVi;
    private double SoLuong;
    private double SLHong;
    private Date NgaySanXuat;
    private String Hang;

    public MatHang() {
    }

    public MatHang(String MaMH, String MaLH, String MaKe, String TenMH, double DonGia, String DonVi, double SoLuong, double SLHong, Date NgaySanXuat, String Hang) {
        this.MaMH = MaMH;
        this.MaLH = MaLH;
        this.MaKe = MaKe;
        this.TenMH = TenMH;
        this.DonGia = DonGia;
        this.DonVi = DonVi;
        this.SoLuong = SoLuong;
        this.SLHong = SLHong;
        this.NgaySanXuat = NgaySanXuat;
        this.Hang = Hang;
    }



    public String getMaMH() {
        return MaMH;
    }

    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

    public String getMaLH() {
        return MaLH;
    }

    public void setMaLH(String MaLH) {
        this.MaLH = MaLH;
    }

    public String getMaKe() {
        return MaKe;
    }

    public void setMaKe(String MaKe) {
        this.MaKe = MaKe;
    }

    public String getTenMH() {
        return TenMH;
    }

    public void setTenMH(String TenMH) {
        this.TenMH = TenMH;
    }

    public String getDonVi() {
        return DonVi;
    }

    public void setDonVi(String DonVi) {
        this.DonVi = DonVi;
    }

    public Date getNgaySanXuat() {
        return NgaySanXuat;
    }

    public void setNgaySanXuat(Date NgaySanXuat) {
        this.NgaySanXuat = NgaySanXuat;
    }

    public String getHang() {
        return Hang;
    }

    public void setHang(String Hang) {
        this.Hang = Hang;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

    public double getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(double SoLuong) {
        this.SoLuong = SoLuong;
    }

    public double getSLHong() {
        return SLHong;
    }

    public void setSLHong(double SLHong) {
        this.SLHong = SLHong;
    }

    @Override
    public String toString() {
        //return TenMH + " - " + MaMH;
        return TenMH;
    }
    
}
