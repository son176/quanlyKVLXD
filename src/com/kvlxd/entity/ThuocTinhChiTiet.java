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
public class ThuocTinhChiTiet { 

    private int MaTTCT;
    private int MaTT;
    private String MaMH;
    private String GiaTri;

    public ThuocTinhChiTiet() {
    }

    public ThuocTinhChiTiet(int MaTTCT, int MaTT, String MaMH, String GiaTri) {
        this.MaTTCT = MaTTCT;
        this.MaTT = MaTT;
        this.MaMH = MaMH;
        this.GiaTri = GiaTri;
    }

    public int getMaTTCT() {
        return MaTTCT;
    }

    public void setMaTTCT(int MaTTCT) {
        this.MaTTCT = MaTTCT;
    }

    public int getMaTT() {
        return MaTT;
    }

    public void setMaTT(int MaTT) {
        this.MaTT = MaTT;
    }

    public String getMaMH() {
        return MaMH;
    }

    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

    public String getGiaTri() {
        return GiaTri;
    }

    public void setGiaTri(String GiaTri) {
        this.GiaTri = GiaTri;
    }

    


   

}
