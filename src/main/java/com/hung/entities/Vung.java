package com.hung.entities;

public class Vung {
    private String xa_phuong;
    private String quan_huyen;
    private String tinh_tp;
    private int khuvuc;
    private Double sotiendongbh;
    private int mucvuotquagioihan;

    public Vung() {
    }

    public Vung(String xa_phuong, String quan_huyen, String tinh_tp, int khuvuc, Double sotiendongbh, int mucvuotquagioihan) {
        this.xa_phuong = xa_phuong;
        this.quan_huyen = quan_huyen;
        this.tinh_tp = tinh_tp;
        this.khuvuc = khuvuc;
        this.sotiendongbh = sotiendongbh;
        this.mucvuotquagioihan = mucvuotquagioihan;
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

    public Double getSotiendongbh() {
        return sotiendongbh;
    }

    public void setSotiendongbh(Double sotiendongbh) {
        this.sotiendongbh = sotiendongbh;
    }

    public int getMucvuotquagioihan() {
        return mucvuotquagioihan;
    }

    public void setMucvuotquagioihan(int mucvuotquagioihan) {
        this.mucvuotquagioihan = mucvuotquagioihan;
    }

    @Override
    public String toString() {
        return xa_phuong + ";"
                + quan_huyen + ";"
                + tinh_tp + ";"
                + khuvuc + ";"
                + sotiendongbh + ";"
                + mucvuotquagioihan;
    }
}
