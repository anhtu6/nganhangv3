package com.example.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Giaodichthe {
    @Id
    @Column(length = 20)
    private String magiaodich;
    @Column(length = 10)
    private String mataikhoantietkiem;
    @Column(length = 10)
    private String mataikhoantindung;
    Float sotiengiaodich;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngaygiaodich;
    @Column(length = 10)
    private String manhanvienthuchien;
    @Column(length = 10)
    private String loaigiaodich;

    public Giaodichthe() {
    }

    public String getMagiaodich() {
        return magiaodich;
    }

    public void setMagiaodich(String magiaodich) {
        this.magiaodich = magiaodich;
    }

    public String getMataikhoantietkiem() {
        return mataikhoantietkiem;
    }

    public void setMataikhoantietkiem(String mataikhoantietkiem) {
        this.mataikhoantietkiem = mataikhoantietkiem;
    }

    public String getMataikhoantindung() {
        return mataikhoantindung;
    }

    public void setMataikhoantindung(String mataikhoantindung) {
        this.mataikhoantindung = mataikhoantindung;
    }

    public Float getSotiengiaodich() {
        return sotiengiaodich;
    }

    public void setSotiengiaodich(Float sotiengiaodich) {
        this.sotiengiaodich = sotiengiaodich;
    }

    public Date getNgaygiaodich() {
        return ngaygiaodich;
    }

    public void setNgaygiaodich(Date ngaygiaodich) {
        this.ngaygiaodich = ngaygiaodich;
    }

    public String getManhanvienthuchien() {
        return manhanvienthuchien;
    }

    public void setManhanvienthuchien(String manhanvienthuchien) {
        this.manhanvienthuchien = manhanvienthuchien;
    }

    public String getLoaigiaodich() {
        return loaigiaodich;
    }

    public void setLoaigiaodich(String loaigiaodich) {
        this.loaigiaodich = loaigiaodich;
    }
}
