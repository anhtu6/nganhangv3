package com.example.demo.service;

import com.example.demo.model.Nhanvien;

import java.util.List;
import java.util.Optional;

public interface NhanvienService {
   List<Nhanvien> findAll();
   void save(Nhanvien nhanvien);
   void remove(String id);
   List<Nhanvien> findByNameOrId(String searchName);
   Optional<Nhanvien> findById(String id);
}
