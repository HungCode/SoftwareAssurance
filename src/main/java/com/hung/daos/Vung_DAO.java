package com.hung.daos;

import com.hung.entities.Vung;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Vung_DAO {
    private ResultSet rs;
    private PreparedStatement ps;
    private Connection conn;

    public Vung_DAO(){
        conn = new Config().getConnection();
    }

    public Vung getVung(int id){
        Vung v = null;
        String sql = "select * from Vung where ID = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            rs = ps.executeQuery();

            while (rs.next()){
                String xa_phuong = rs.getString("xa_phuong");
                String quan_huyen = rs.getString("quan_huyen");
                String tinh_tp = rs.getString("tinh_tp");
                int khuvuc = rs.getInt("khuvuc");
                Double sotiendongbh = rs.getDouble("sotiendongbh");
                int vuotmucdongbh = rs.getInt("vuotmucdongbh");

                v = new Vung(xa_phuong,quan_huyen,tinh_tp,khuvuc,sotiendongbh,vuotmucdongbh);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return v;
    }

    public void insert(Vung vung) {
        String sql = "insert into Vung values(?,?,?,?,?,?) ";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,vung.getXa_phuong());
            ps.setString(2,vung.getQuan_huyen());
            ps.setString(3,vung.getTinh_tp());
            ps.setInt(4,vung.getKhuvuc());
            ps.setDouble(5,vung.getSotiendongbh());
            ps.setInt(6,vung.getMucvuotquagioihan());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
