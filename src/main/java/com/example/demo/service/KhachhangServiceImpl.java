package com.example.demo.service;

import com.example.demo.model.Khachhang;
import com.example.demo.repository.KhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    @Override
    public Optional<Khachhang> findById(String id) {
        return khachHangRepository.findById(id);
    }

    @Override
    public void remove(String id) {
        khachHangRepository.deleteById(id);
    }


}
