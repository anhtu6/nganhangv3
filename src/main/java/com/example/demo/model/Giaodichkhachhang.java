package com.example.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Giaodichkhachhang {
    @Id
    @Column(length = 20)
    private String magiaodich;
    @Column(length = 10)
    private String makhachhang;
    @Column(length = 10)
    private String mataikhoannhan;
    @Column(length = 10)
    private String loaigiaodich;
    Float sotiengiaodich;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngaygiaodich;
    @Column(length = 10)
    private String manhanvienthuchien;
}
