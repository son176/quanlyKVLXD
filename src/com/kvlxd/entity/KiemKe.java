/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kvlxd.entity;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class KiemKe {
    String MaMH;
    Date NgayKiemKe;
    double SLKiemKe;
    double SLHong;

    public KiemKe() {
    }

    public KiemKe(String MaMH, Date NgayKiemKe, double SLKiemKe, double SLHong) {
        this.MaMH = MaMH;
        this.NgayKiemKe = NgayKiemKe;
        this.SLKiemKe = SLKiemKe;
        this.SLHong = SLHong;
    }

    public String getMaMH() {
        return MaMH;
    }

    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

    public Date getNgayKiemKe() {
        return NgayKiemKe;
    }

    public void setNgayKiemKe(Date NgayKiemKe) {
        this.NgayKiemKe = NgayKiemKe;
    }

    public double getSLKiemKe() {
        return SLKiemKe;
    }

    public void setSLKiemKe(double SLKiemKe) {
        this.SLKiemKe = SLKiemKe;
    }

    public double getSLHong() {
        return SLHong;
    }

    public void setSLHong(double SLHong) {
        this.SLHong = SLHong;
    }
    
}
