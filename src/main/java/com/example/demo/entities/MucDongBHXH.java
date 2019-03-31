package com.example.demo.entities;

import java.util.Date;

public class MucDongBHXH {
    private String ID;
    private String type;//ld  trong nuoc, nuoc ngoai, tu nguyen
    private Double huutri_tutuat;
    private Double omdau_thaisan;
    private Double tainanLD_nghenghiep;
    private Double yte;
    private Date ngaybatdau;
    private Date ngayketthuc;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Date getNgayketthuc() {
        return ngayketthuc;
    }

    public void setNgayketthuc(Date ngayketthuc) {
        this.ngayketthuc = ngayketthuc;
    }

    public MucDongBHXH(String ID, String type, Double huutri_tutuat, Double omdau_thaisan, Double tainanLD_nghenghiep, Double yte, Date ngaybatdau, Date ngayketthuc) {
        this.ID = ID;
        this.type = type;
        this.huutri_tutuat = huutri_tutuat;
        this.omdau_thaisan = omdau_thaisan;
        this.tainanLD_nghenghiep = tainanLD_nghenghiep;
        this.yte = yte;
        this.ngaybatdau = ngaybatdau;
        this.ngayketthuc = ngayketthuc;
    }

    public MucDongBHXH(String ID) {
        this.ID = ID;
    }
}
