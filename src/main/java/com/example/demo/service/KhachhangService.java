package com.example.demo.service;

import com.example.demo.model.Khachhang;
import org.springframework.stereotype.Service;

@Service
public interface KhachhangService {
    Iterable<Khachhang> findAll();
    void save(Khachhang khachhang);
//    void edit(Khachhang khachhang);
//    void delete(Khachhang khachhang);
}
