package com.hung.entities;

import java.util.Date;

public class MucDongBHXH {
    private String maapdung;
    private String mota;
    private Double huutri_tutuat;
    private Double omdau_thaisan;
    private Double tainanLD_nghenghiep;
    private Double yte;
    private Date ngaybatdau;
    private String trangthai;

    public MucDongBHXH(String maapdung) {
        this.maapdung = maapdung;
    }

    public MucDongBHXH(String maapdung, String mota, Double huutri_tutuat, Double omdau_thaisan, Double tainanLD_nghenghiep, Double yte, Date ngaybatdau, String trangthai) {
        this.maapdung = maapdung;
        this.mota = mota;
        this.huutri_tutuat = huutri_tutuat;
        this.omdau_thaisan = omdau_thaisan;
        this.tainanLD_nghenghiep = tainanLD_nghenghiep;
        this.yte = yte;
        this.ngaybatdau = ngaybatdau;
        this.trangthai = trangthai;
    }

    public String getMaapdung() {
        return maapdung;
    }

    public void setMaapdung(String maapdung) {
        this.maapdung = maapdung;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public Double getHuutri_tutuat() {
        return huutri_tutuat;
    }

    public void setHuutri_tutuat(Double huutri_tutuat) {
        this.huutri_tutuat = huutri_tutuat;
    }

    public Double getOmdau_thaisan() {
        return omdau_thaisan;
    }

    public void setOmdau_thaisan(Double omdau_thaisan) {
        this.omdau_thaisan = omdau_thaisan;
    }

    public Double getTainanLD_nghenghiep() {
        return tainanLD_nghenghiep;
    }

    public void setTainanLD_nghenghiep(Double tainanLD_nghenghiep) {
        this.tainanLD_nghenghiep = tainanLD_nghenghiep;
    }

    public Double getYte() {
        return yte;
    }

    public void setYte(Double yte) {
        this.yte = yte;
    }

    public Date getNgaybatdau() {
        return ngaybatdau;
    }

    public void setNgaybatdau(Date ngaybatdau) {
        this.ngaybatdau = ngaybatdau;
    }

    public String getTrangThai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    @Override
    public String toString() {
        return maapdung + ";"
                + mota + ";"
                + huutri_tutuat + ";"
                + omdau_thaisan + ";"
                + tainanLD_nghenghiep + ";"
                + yte + ";"
                + ngaybatdau + ";"
                + trangthai;
    }
}
