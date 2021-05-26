/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kvlxd.entity;

/**
 *
 * @author ADMIN
 */
public class HoaDonXuatChiTiet {

    private int ID;
    private int MaHDX;
    private double SoLuong;
    private String MaMH;
    private String GhiChu;
    private double GiaXuat;

    public HoaDonXuatChiTiet() {
    }

    public double getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(double SoLuong) {
        this.SoLuong = SoLuong;
    }

    public double getGiaXuat() {
        return GiaXuat;
    }

    public void setGiaXuat(double GiaXuat) {
        this.GiaXuat = GiaXuat;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getMaHDX() {
        return MaHDX;
    }

    public void setMaHDX(int MaHDX) {
        this.MaHDX = MaHDX;
    }

    public String getMaMH() {
        return MaMH;
    }

    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    @Override
    public String toString() {
        return "HoaDonXuatChiTiet{" + "ID=" + ID + ", MaHDX=" + MaHDX + ", SoLuong=" + SoLuong + ", MaMH=" + MaMH + ", GhiChu=" + GhiChu + ", GiaXuat=" + GiaXuat + '}';
    }

    

}
