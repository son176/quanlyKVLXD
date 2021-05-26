package com.kvlxd.dao;

import com.kvlxd.entity.Kho;
import com.kvlxd.entity.LoaiHang;
import com.kvlxd.util.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LoaiHangDAO extends kvlxdDAO<LoaiHang, String> {

    String INSERT_SQL = "insert into LoaiHang values (?,?)";
    String UPDATE_SQL = "update LoaiHang set TenLH = ? where MaLH=?";
    String DELETE_SQL = "delete from LoaiHang where MaLH = ?";
    String SELECT_ALL_SQL = "select * from LoaiHang";
    String SELECT_BY_ID_SQL = "select * from LoaiHang where MaLH = ?";
    String SELECT_BY_MAKHO = "select * from LoaiHang join Kho on Kho.MaLH = LoaiHang.MaLH where MaKho=?";
    String SELECT_BY_TENLOAIHANG = "select * from LoaiHang inner join Kho on Kho.MaLH = LoaiHang.MaLH where Kho.MaKho=?";

    @Override
    public void insert(LoaiHang entity) {
        JDBCHelper.update(INSERT_SQL, entity.getMaLH(), entity.getTenLH());
    }

    @Override
    public void update(LoaiHang entity) {
        JDBCHelper.update(UPDATE_SQL, entity.getTenLH(), entity.getMaLH());
    }

    @Override
    public void delete(String key) {
        JDBCHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<LoaiHang> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public LoaiHang selectById(String key) {
        List<LoaiHang> list = selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<LoaiHang> selectBySql(String sql, Object... args) {
        List<LoaiHang> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                LoaiHang k = new LoaiHang();
                k.setMaLH(rs.getString("MaLH"));
                k.setTenLH(rs.getString("TenLH"));
                list.add(k);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public LoaiHang selectByMaKho(String maKho) {
        return this.selectBySql(SELECT_BY_MAKHO, maKho).get(0);
    }

    public LoaiHang selectTenLH(String maKho) {
        return this.selectBySql(SELECT_BY_TENLOAIHANG, maKho).get(0);
    }

    public LoaiHang selectMaLH(String tenLH) {
        String sql = "select MaLH from LoaiHang where TenLH like ?";
        return selectBySql(sql, tenLH).get(0);
    }
}
