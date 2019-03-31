package com.example.demo.dao;

import com.example.demo.entities.Luong;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Luong_DAO {
    private ResultSet rs;
    private PreparedStatement ps;
    private Connection conn;

    public Luong_DAO() {
        conn = Config.getConnection();
    }
    public Luong getLuong(String ID){
        Luong l = null;
        String sql = "select * from Luong where luongID = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,ID);
            rs = ps.executeQuery();

            while(rs.next()){
                Double luong = rs.getDouble("luong");
                Date ngaybatdau = rs.getDate("ngaybatdau");
                Date ngayketthuc = rs.getDate("ngayketthuc");
                l = new Luong(ID,luong,ngaybatdau,ngayketthuc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return l;
    }
}
