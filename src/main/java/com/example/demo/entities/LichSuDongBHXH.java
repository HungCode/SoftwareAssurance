package com.example.demo.entities;

import java.util.Date;

public class LichSuDongBHXH {
    private String ID;
    private Double sotienphaidong;
    private Date ngaybatdau;
    private Date ngayketthuc;
    private String trangthai;

    public LichSuDongBHXH(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Double getSotienphaidong() {
        return sotienphaidong;
    }

    public void setSotienphaidong(Double sotienphaidong) {
        this.sotienphaidong = sotienphaidong;
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

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public LichSuDongBHXH(String ID, Double sotienphaidong, Date ngaybatdau, Date ngayketthuc, String trangthai) {
        this.ID = ID;
        this.sotienphaidong = sotienphaidong;
        this.ngaybatdau = ngaybatdau;
        this.ngayketthuc = ngayketthuc;
        this.trangthai = trangthai;
    }
}
