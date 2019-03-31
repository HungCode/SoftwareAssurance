package com.example.demo.entities;

import java.util.Date;

public class DonViLamViec {
    private  String ID;
    private String name;
    private String chucvu;
    private String diachi;
    private Date ngaybatdau;
    private Date ngayketthuc;

    public DonViLamViec() {
    }

    public DonViLamViec(String id, String name, String chucvu, String diachi, Date ngaybatdau, Date ngayketthuc) {
        this.ID = id;
        this.name = name;
        this.chucvu = chucvu;
        this.diachi = diachi;
        this.ngaybatdau = ngaybatdau;
        this.ngayketthuc = ngayketthuc;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
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
