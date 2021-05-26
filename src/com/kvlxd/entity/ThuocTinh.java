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
public class ThuocTinh {  

    private int MaTT;
    private String TenTT;
    private String Mota;

    public ThuocTinh() {
    }

    public ThuocTinh(int MaTT, String TenTT, String Mota) {
        this.MaTT = MaTT;
        this.TenTT = TenTT;
        this.Mota = Mota;
    }

    public int getMaTT() {
        return MaTT;
    }

    public void setMaTT(int MaTT) {
        this.MaTT = MaTT;
    }

    public String getTenTT() {
        return TenTT;
    }

    public void setTenTT(String TenTT) {
        this.TenTT = TenTT;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }

    @Override
    public String toString() {
        return TenTT+"";
    }
   
}
