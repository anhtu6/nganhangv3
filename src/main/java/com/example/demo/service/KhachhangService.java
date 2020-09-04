package com.example.demo.service;

import com.example.demo.model.Khachhang;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface KhachhangService {
     Iterable<Khachhang> findAll();
     void save(Khachhang khachhang);
     Optional<Khachhang> findById(String id);
     void remove(String id);
}


