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
public class LoaiHang {

    private String MaLH;
    private String TenLH;

    public LoaiHang() {
    }

    public LoaiHang(String MaLH, String TenLH) {
        this.MaLH = MaLH;
        this.TenLH = TenLH;
    }

    public String getMaLH() {
        return MaLH;
    }

    public void setMaLH(String MaLH) {
        this.MaLH = MaLH;
    }

    public String getTenLH() {
        return TenLH;
    }

    public void setTenLH(String TenLH) {
        this.TenLH = TenLH;
    }

    @Override
    public String toString() {
        return TenLH;
    }

}
