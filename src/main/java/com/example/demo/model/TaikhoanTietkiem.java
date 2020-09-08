package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TaikhoanTietkiem {
    @Id
    @Column(length = 10)
    private String mataikhoantietkiem;
    @Column(length = 20)
    private String tenloaitaikhoan;
    private Float laisuathangthang;
    private Float sodutoithieu;

}
