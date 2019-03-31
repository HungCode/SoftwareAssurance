package com.example.demo.entities;

import java.util.Date;

public class Luong {
    private String ID;
    private Double luong;
    private Date ngaybatdau;
    private Date ngayketthuc;

    public Luong() {
    }

    public Luong(String ID, Double luong, Date ngaybatdau, Date ngayketthuc) {
        this.ID = ID;
        this.luong = luong;
        this.ngaybatdau = ngaybatdau;
        this.ngayketthuc = ngayketthuc;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Double getLuong() {
        return luong;
    }

    public void setLuong(Double luong) {
        this.luong = luong;
    }

    public Date getNgaybatdau() {
        return ngaybatdau;
    }

    public void setNgaybatdau(Date ngaybatdau) {
        this.ngaybatdau = ngaybatdau;
    }

    public Date getNgayketthuc() {
        return ngayketthuc;
    }

    public void setNgayketthuc(Date ngayketthuc) {
        this.ngayketthuc = ngayketthuc;
    }
}
