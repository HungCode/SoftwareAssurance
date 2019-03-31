package com.example.demo.dao;

import com.example.demo.entities.Vung;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Vung_DAO {
    private ResultSet rs;
    private PreparedStatement ps;
    private Connection conn;

    Vung_DAO(){
        conn = Config.getConnection();
    }

    public Vung getVung(String mavung){
        Vung v = null;
        String sql = "select * from Vung where mavung = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,mavung);
            rs = ps.executeQuery();

            while (rs.next()){
                String xa_phuong = rs.getString("xa_phuong");
                String quan_huyen = rs.getString("quan_huyen");
                String tinh_tp = rs.getString("tinh_tp");
                int khuvuc = rs.getInt("khuvuc");
                v = new Vung(mavung,xa_phuong,quan_huyen,tinh_tp,khuvuc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return v;
    }
}
