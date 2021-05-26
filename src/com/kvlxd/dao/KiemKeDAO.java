/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kvlxd.dao;

import com.kvlxd.entity.KiemKe;
import com.kvlxd.util.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class KiemKeDAO extends kvlxdDAO<KiemKe, String> {

    String INSERT_SQL = "insert into KiemKe values (?,?,?,?)";
    String UPDATE_SQL = "update KiemKe set SLKiemKe =?,SLHong =? where MaMH =? and NgayKiemKe =? ";
    String DELETE_SQL = "delete from KiemKe where MaMH =? and NgayKiemKe =?";
    String SELECT_ALL_SQL = "select * from KiemKe";
    String SELECT_BY_ID_SQL = "select * from KiemKe where MaMH = ? and NgayKiemKe =?";
    String Select_By_KNGAY = "select * from KiemKe where NgayKiemKe between ? and ? ";

    @Override
    public void insert(KiemKe entity) {
        JDBCHelper.update(INSERT_SQL, entity.getMaMH(), entity.getNgayKiemKe(), entity.getSLKiemKe(), entity.getSLHong());
    }

    public List<KiemKe> selectByKhoangNgay(java.sql.Date d1, java.sql.Date d2) {
        return this.selectBySql(Select_By_KNGAY, d1, d2);
    }

    @Override
    public void update(KiemKe entity) {
        JDBCHelper.update(UPDATE_SQL, entity.getSLKiemKe(), entity.getSLHong(), entity.getMaMH(), entity.getNgayKiemKe());
    }

    public void deleteKK(String key, Date date) {
        JDBCHelper.update(DELETE_SQL, key, date);
    }

    @Override
    public List<KiemKe> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public KiemKe selectById(String key) {
        List<KiemKe> list = selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<KiemKe> selectBySql(String sql, Object... args) {
        List<KiemKe> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                KiemKe kk = new KiemKe();
                kk.setMaMH(rs.getString("MaMH"));
                kk.setNgayKiemKe(rs.getDate("NgayKiemKe"));
                kk.setSLKiemKe(rs.getDouble("SLKiemKe"));
                kk.setSLHong(rs.getDouble("SLHong"));
                list.add(kk);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }

    }

    @Override
    public void delete(String key) {
    }

    public KiemKe selectByIdANDdate(String key, Date date) {
        List<KiemKe> list = selectBySql(SELECT_BY_ID_SQL, key, date);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
