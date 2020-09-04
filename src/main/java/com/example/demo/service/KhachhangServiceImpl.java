package com.example.demo.service;

import com.example.demo.model.Khachhang;
import com.example.demo.repository.KhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KhachhangServiceImpl implements KhachhangService {
    @Autowired
    private KhachHangRepository khachHangRepository;
    @Override
    public Iterable<Khachhang> findAll() {
        return khachHangRepository.findAll();
    }

    @Override
    public void save(Khachhang khachhang) {
        khachHangRepository.save(khachhang);
    }

//    @Override
//    public void edit(Khachhang khachhang) {
//
//    }
//
//    @Override
//    public void delete(Khachhang khachhang) {
//
//    }
}
