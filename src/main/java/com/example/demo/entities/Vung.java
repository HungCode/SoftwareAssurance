package com.example.demo.entities;

public class Vung {
    private String mavung;
    private String xa_phuong;
    private String quan_huyen;
    private String tinh_tp;
    private int khuvuc;

    public Vung() {
    }

    public Vung(String mavung, String xa_phuong, String quan_huyen, String tinh_tp, int khuvuc) {
        this.mavung = mavung;
        this.xa_phuong = xa_phuong;
        this.quan_huyen = quan_huyen;
        this.tinh_tp = tinh_tp;
        this.khuvuc = khuvuc;
    }

    public String getMavung() {
        return mavung;
    }

    public void setMavung(String mavung) {
        this.mavung = mavung;
    }

    public String getXa_phuong() {
        return xa_phuong;
    }

    public void setXa_phuong(String xa_phuong) {
        this.xa_phuong = xa_phuong;
    }

    public String getQuan_huyen() {
        return quan_huyen;
    }

    public void setQuan_huyen(String quan_huyen) {
        this.quan_huyen = quan_huyen;
    }

    public String getTinh_tp() {
        return tinh_tp;
    }

    public void setTinh_tp(String tinh_tp) {
        this.tinh_tp = tinh_tp;
    }

    public int getKhuvuc() {
        return khuvuc;
    }

    public void setKhuvuc(int khuvuc) {
        this.khuvuc = khuvuc;
    }
}
