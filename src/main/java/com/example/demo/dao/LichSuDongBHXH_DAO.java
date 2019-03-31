package com.example.demo.dao;

import com.example.demo.entities.LichSuDongBHXH;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class LichSuDongBHXH_DAO {
    private ResultSet rs;
    private PreparedStatement ps;
    private Connection conn;

    LichSuDongBHXH_DAO(){
        conn = Config.getConnection();
    }

    public LichSuDongBHXH getLichSuDongBHXH(String ID){
        LichSuDongBHXH ls = null;
        String sql = "select * from LichSuDongBHXH where lichsuID = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,ID);
            ResultSet rs = ps.executeQuery();

            Double sotienphaidong = rs.getDouble("sotienphaidong");
            Date ngaybatdau = rs.getDate("ngaybatdau");
            Date ngayketthuc = rs.getDate("ngayketthuc");
            String trangthai = rs.getString("trangthai");

            ls = new LichSuDongBHXH(ID,sotienphaidong,ngaybatdau,ngayketthuc,trangthai);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ls;
    }
}
