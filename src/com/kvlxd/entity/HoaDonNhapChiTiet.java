/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kvlxd.entity;

public class HoaDonNhapChiTiet {

    private int ID;
    private int MaHDN;
    private String TenMH;
    private double SoLuong;
    private String MaMH;
    private String DVT;
    private String GhiChu;
    private double GiaNiemYet;

    public HoaDonNhapChiTiet() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getMaHDN() {
        return MaHDN;
    }

    public void setMaHDN(int MaHDN) {
        this.MaHDN = MaHDN;
    }

    public String getTenMH() {
        return TenMH;
    }

    public void setTenMH(String TenMH) {
        this.TenMH = TenMH;
    }

    public double getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(double SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getMaMH() {
        return MaMH;
    }

    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

    public String getDVT() {
        return DVT;
    }

    public void setDVT(String DVT) {
        this.DVT = DVT;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public double getGiaNiemYet() {
        return GiaNiemYet;
    }

    public void setGiaNiemYet(double GiaNiemYet) {
        this.GiaNiemYet = GiaNiemYet;
    }

    

    @Override
    public String toString() {
        return "HoaDonNhapChiTiet{" + "ID=" + ID + ", MaHDN=" + MaHDN + ", TenMH=" + TenMH + ", SoLuong=" + SoLuong + ", MaMH=" + MaMH + ", DVT=" + DVT + ", GhiChu=" + GhiChu + ", GiaNiemYet=" + GiaNiemYet + '}';
    }

   
}
