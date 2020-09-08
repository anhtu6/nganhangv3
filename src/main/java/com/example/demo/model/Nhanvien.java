package com.example.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Nhanvien {
    @Id
   @Column(length= 10)
    private String manhanvien;
    @Column(length = 20)
    private Integer chungminhthu;
    @Column(length = 20)
    private String tennhavien;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngaysinh;
    private Integer bacnghe;
    private Integer thamnien;
    @Column(length = 10)
    private String machucvu;
//    @OneToOne


    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    public int getChungminhthu() {
        return chungminhthu;
    }

    public void setChungminhthu(int chungminhthu) {
        this.chungminhthu = chungminhthu;
    }

    public String getTennhavien() {
        return tennhavien;
    }

    public void setTennhavien(String tennhavien) {
        this.tennhavien = tennhavien;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public int getBacnghe() {
        return bacnghe;
    }

    public void setBacnghe(int bacnghe) {
        this.bacnghe = bacnghe;
    }

    public int getThamnien() {
        return thamnien;
    }

    public void setThamnien(int thamnien) {
        this.thamnien = thamnien;
    }

    public String getMachucvu() {
        return machucvu;
    }

    public void setMachucvu(String machucvu) {
        this.machucvu = machucvu;
    }
}
