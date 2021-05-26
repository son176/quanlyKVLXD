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
public class KeHang {

    private String MaKe;
    private boolean TrangThai;
    private String MaKho;
    private double SucChua;

    public KeHang() {
    }

    public String getMaKe() {
        return MaKe;
    }

    public void setMaKe(String MaKe) {
        this.MaKe = MaKe;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getMaKho() {
        return MaKho;
    }

    public void setMaKho(String MaKho) {
        this.MaKho = MaKho;
    }

    public double getSucChua() {
        return SucChua;
    }

    public void setSucChua(double SucChua) {
        this.SucChua = SucChua;
    }

    @Override
    public String toString() {
        return this.MaKe;
    }
    
    

}
