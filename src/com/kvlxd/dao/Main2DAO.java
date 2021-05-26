/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kvlxd.dao;

import com.kvlxd.util.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cuong
 */
public class Main2DAO {

    String TT_Kho = "select Kho.MaKho,TenKho,ROUND(Sum(KeHang.SucChua),0)as TSC,ROUND(SUM(MatHang.SoLuong),0) as TSL,Round(Sum(MatHang.SoLuong*MatHang.DonGia),0) as TGT from Kho \n"
            + "join KeHang on KeHang.MaKho=Kho.MaKho \n"
            + "join MatHang on MatHang.MaKe=KeHang.MaKe\n"
            + "group by Kho.MaKho,TenKho";

    String DSMHBanChay = "select top 5 HDXuatCT.MaMH,TenMH,ROUND(Sum(HDXuatCT.SoLuong*HDXuatCT.GiaXuat),0) as TGT  from HDXuatCT \n"
            + "join MatHang on MatHang.MaMH=HDXuatCT.MaMH\n"
            + "group by HDXuatCT.MaMH,TenMH order by TGT desc";

    String TT_HDX = "select MaHDX,NhanVien.TenNV,KhachHang.TenKH,KhachHang.SDT,KhachHang.DiaChi,TenLaiXe,SDTLaiXe from HDXuat \n"
            + "join NhanVien on NhanVien.MaNV=HDXuat.MaNV\n"
            + "join KhachHang on KhachHang.MaKH=HDXuat.MaKH\n"
            + "where HDXuat.TrangThai=0";

    public List<Object[]> selectBySQL(String sql, String... args) {
        try {
            List<Object[]> list = new ArrayList();
            ResultSet rs = JDBCHelper.query(sql);
            while (rs.next()) {
                Object[] ob = new Object[args.length];
                for (int i = 0; i < args.length; i++) {
                    ob[i] = rs.getObject(args[i]);
                }
                list.add(ob);
            }
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException();
        }
    }

    public List<Object[]> TTKho() {
        return selectBySQL(TT_Kho, "MaKho", "TenKho", "TSC", "TSL", "TGT");
    }

    public List<Object[]> DSMHBanChay() {
        return selectBySQL(DSMHBanChay, "MaMH", "TenMH", "TGT");
    }

    public List<Object[]> TTHDX() {
        return selectBySQL(TT_HDX, "MaHDX", "TenNV", "TenKH", "SDT", "DiaChi", "TenLaiXe", "SDTLaiXe");
    }

}
