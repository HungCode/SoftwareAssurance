package com.example.demo.dao;

import com.example.demo.entities.DonViLamViec;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class DonViLamViec_DAO {
    private ResultSet rs;
    private PreparedStatement ps;
    private Connection conn;

    DonViLamViec_DAO(){
        conn = Config.getConnection();
    }

    public DonViLamViec getDonViLamViec(String ID){
        String sql= "select * from DonViLamViec where donviID = ?";
        DonViLamViec dv = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,ID);
            rs = ps.executeQuery();

            while(rs.next()){
                String name = rs.getString("name");
                String chucvu = rs.getString("chucvu");
                String diachi = rs.getString("diachi");
                Date ngaybatdau = rs.getDate("ngaybatdau");
                Date ngayketthuc = rs.getDate("ngayketthuc");

                dv = new DonViLamViec(ID,name,chucvu,diachi,ngaybatdau,ngayketthuc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dv;
    }
}
