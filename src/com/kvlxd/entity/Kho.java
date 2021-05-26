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
public class Kho {

    private String MaKho;
    private String TenKho;
    private String MaLH;
    private String ViTri;
    private double DienTich;

    public Kho() {
    }

    public Kho(String MaKho, String TenKho, String MaLH, String ViTri, float DienTich) {
        this.MaKho = MaKho;
        this.TenKho = TenKho;
        this.MaLH = MaLH;
        this.ViTri = ViTri;
        this.DienTich = DienTich;
    }

    public String getMaKho() {
        return MaKho;
    }

    public void setMaKho(String MaKho) {
        this.MaKho = MaKho;
    }

    public String getTenKho() {
        return TenKho;
    }

    public void setTenKho(String TenKho) {
        this.TenKho = TenKho;
    }

    public String getMaLH() {
        return MaLH;
    }

    public void setMaLH(String MaLH) {
        this.MaLH = MaLH;
    }

    public String getViTri() {
        return ViTri;
    }

    public void setViTri(String ViTri) {
        this.ViTri = ViTri;
    }

    public double getDienTich() {
        return DienTich;
    }

    public void setDienTich(double DienTich) {
        this.DienTich = DienTich;
    }

    @Override
    public String toString() {
        return this.TenKho + " - " +this.MaKho;
    }

}
