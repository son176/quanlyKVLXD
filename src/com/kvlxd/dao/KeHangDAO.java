package com.kvlxd.dao;

import com.kvlxd.entity.KeHang;
import com.kvlxd.util.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cuong
 */
public class KeHangDAO extends kvlxdDAO<KeHang, String> {

    String INSERT_SQL = "insert into KeHang values (?,?,?,?)";
    String UPDATE_SQL = "update KeHang set TrangThai = ?, MaKho =?, SucChua = ? where MaKe=?";
    String DELETE_SQL = "delete from KeHang where MaKe = ?";
    String SELECT_ALL_SQL = "select * from KeHang";
    String SELECT_BY_ID_SQL = "select * from KeHang where MaKe = ?";
    String SELECT_BY_MAKHO = "select * from KeHang join Kho on Kho.MaKho = KeHang.MaKho where KeHang.MaKho=?";
    String SELECT_KEHANG = "select * from MatHang where TenKe like ?";
    String Select_By_MaMH = "select * from KeHang join MatHang on MatHang.MaKe = KeHang.MaKe where MaMH=?";

    public List<KeHang> selectByMaMH(String MaMH) {  
        return selectBySql(Select_By_MaMH, MaMH);
    }

    @Override

    public void insert(KeHang entity) {
        JDBCHelper.update(INSERT_SQL, entity.getMaKe(), entity.isTrangThai(), entity.getMaKho(), entity.getSucChua());
    }

    @Override
    public void update(KeHang entity) {
        JDBCHelper.update(UPDATE_SQL, entity.isTrangThai(), entity.getMaKho(), entity.getSucChua(), entity.getMaKe());
    }

    @Override
    public void delete(String key) {
        JDBCHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<KeHang> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public KeHang selectById(String key) {
        List<KeHang> list = selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<KeHang> selectBySql(String sql, Object... args) {
        List<KeHang> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                KeHang k = new KeHang();
                k.setMaKe(rs.getString("MaKe"));
                k.setTrangThai(rs.getBoolean("TrangThai"));
                k.setMaKho(rs.getString("MaKho"));
                k.setSucChua(rs.getDouble("SucChua"));
                list.add(k);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public List<KeHang> selectByMaKho(String maKho) {
        return this.selectBySql(SELECT_BY_MAKHO, maKho);
    }

}
