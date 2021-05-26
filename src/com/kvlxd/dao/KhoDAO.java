/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kvlxd.dao;

import com.kvlxd.entity.Kho;
import com.kvlxd.util.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class KhoDAO extends kvlxdDAO<Kho, String> {

    String INSERT_SQL = "insert into Kho values (?,?,?,?,?)";
    String UPDATE_SQL = "update Kho set TenKho = ?, MaLH =?, ViTri = ?,DienTich=? where MaKho=?";
    String DELETE_SQL = "delete from Kho where MaKho = ?";
    String SELECT_ALL_SQL = "select * from Kho";
    String SELECT_BY_ID_SQL = "select * from Kho where MaKho = ?";
    String SELECT_BY_TENKHO = "select * from Kho inner join LoaiHang on LoaiHang.MaLH=Kho.MaLH\n"
            + "inner join MatHang on MatHang.MaLH=LoaiHang.MaLH\n"
            + "where TenMH =?";
    String SELECT_BY_MAMH = "select * from Kho inner join LoaiHang on LoaiHang.MaLH=Kho.MaLH\n"
            + "inner join MatHang on MatHang.MaLH=LoaiHang.MaLH\n"
            + "where MaMH =?";
    String SELECT_BY_TENKHO2=" select * from Kho where Kho.TenKho =?";
        String Select_By_MaKe = "select * from Kho join KeHang on KeHang.MaKho=Kho.MaKho where MaKe = ?";
   
    @Override
    public void insert(Kho entity) {
        JDBCHelper.update(INSERT_SQL, entity.getMaKho(), entity.getTenKho(), entity.getMaLH(), entity.getViTri(),
                entity.getDienTich()
        );
    }

    @Override
    public void update(Kho entity) {
        JDBCHelper.update(UPDATE_SQL, entity.getTenKho(), entity.getMaLH(), entity.getViTri(),
                entity.getDienTich(), entity.getMaKho()
        );
    }
    public Kho selectByMaKe(String make) {
        return selectBySql(Select_By_MaKe, make).get(0);
    }

    @Override
    public void delete(String key) {
        JDBCHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<Kho> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public Kho selectById(String key) {
        List<Kho> list = selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<Kho> selectBySql(String sql, Object... args) {
        List<Kho> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                Kho k = new Kho();
                k.setMaKho(rs.getString("MaKho"));
                k.setTenKho(rs.getString("TenKho"));
                k.setMaLH(rs.getString("MaLH"));
                k.setViTri(rs.getString("ViTri"));
                k.setDienTich(rs.getFloat("DienTich"));
                list.add(k);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public Kho selectByTENKHO(String TenMH) {
        List<Kho> list = selectBySql(SELECT_BY_TENKHO, TenMH);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public Kho selectByMaMH(String MaMH) {
        List<Kho> list = selectBySql(SELECT_BY_MAMH, MaMH);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    public Kho selectMaKho(String tenKho){
        List<Kho> list=selectBySql(SELECT_BY_TENKHO2, tenKho);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
