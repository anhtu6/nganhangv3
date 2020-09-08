package com.example.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Nhanvien {
    @Id
    @Column(length = 10)
    private String manhanvien;
    @Column(length = 20)
    private Long chungminhthu;
    @Column(length = 20)
    private String tennhanvien;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngaysinh;
    private Integer bacnghe;
    private Integer thamnien;
    //@Column(length = 10)
    //private String machucvu;
    @ManyToOne
    @JoinColumn(name = "machucvu")
    private Chucvu chucvu;





}
