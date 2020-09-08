package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TaikhoanTindung {
    @Id
    @Column(length = 10)
    private String mataikhoantindung;
    @Column(length = 20)
    private String tenloaitaikhoan;
    private Float sonohientai;
    private Float hanmuctoida;

    public TaikhoanTindung() {
    }

    public String getMataikhoantindung() {
        return mataikhoantindung;
    }

    public void setMataikhoantindung(String mataikhoantindung) {
        this.mataikhoantindung = mataikhoantindung;
    }

    public String getTenloaitaikhoan() {
        return tenloaitaikhoan;
    }

    public void setTenloaitaikhoan(String tenloaitaikhoan) {
        this.tenloaitaikhoan = tenloaitaikhoan;
    }

    public Float getSonohientai() {
        return sonohientai;
    }

    public void setSonohientai(Float sonohientai) {
        this.sonohientai = sonohientai;
    }

    public Float getHanmuctoida() {
        return hanmuctoida;
    }

    public void setHanmuctoida(Float hanmuctoida) {
        this.hanmuctoida = hanmuctoida;
    }
}
