package com.example.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Taikhoan {
    @Id
    @Column(length = 10)
    private String mataikhoan;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngaytaotaikhoan;
    @Column(length = 20)
    private String tenloaitaikhoan;
    @Column(length = 10)
    private String makhachhang;
    @Column(length = 10)
    private String manhanvientaotaikhoan;
    private Float sodu;

    public Taikhoan() {
    }

    public String getMataikhoan() {
        return mataikhoan;
    }

    public void setMataikhoan(String mataikhoan) {
        this.mataikhoan = mataikhoan;
    }

    public Date getNgaytaotaikhoan() {
        return ngaytaotaikhoan;
    }

    public void setNgaytaotaikhoan(Date ngaytaotaikhoan) {
        this.ngaytaotaikhoan = ngaytaotaikhoan;
    }

    public String getTenloaitaikhoan() {
        return tenloaitaikhoan;
    }

    public void setTenloaitaikhoan(String tenloaitaikhoan) {
        this.tenloaitaikhoan = tenloaitaikhoan;
    }

    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public String getManhanvientaotaikhoan() {
        return manhanvientaotaikhoan;
    }

    public void setManhanvientaotaikhoan(String manhanvientaotaikhoan) {
        this.manhanvientaotaikhoan = manhanvientaotaikhoan;
    }

    public Float getSodu() {
        return sodu;
    }

    public void setSodu(Float sodu) {
        this.sodu = sodu;
    }
}
