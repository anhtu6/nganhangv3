package com.example.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

import java.util.Date;


@Entity


public class Khachhang {
    @Id
    @Column(length = 10)
    private String makhachhang;
    @Column(length = 45)
    private String tenkhachhang;
    @Column(length = 20)
    private Long chungminhthu;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(length = 45)
    private Date ngaysinh;
    private String diachi;

    public Khachhang() {
    }

    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    public Long getChungminhthu() {
        return chungminhthu;
    }

    public void setChungminhthu(Long chungminhthu) {
        this.chungminhthu = chungminhthu;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
}
