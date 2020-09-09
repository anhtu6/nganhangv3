package com.example.demo.service;

import com.example.demo.model.Nhanvien;
import com.example.demo.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NhanvienServiceImpl implements NhanvienService {
    @Autowired
    private NhanVienRepository nhanVienRepository;

    @Override
    public List<Nhanvien> findAll() {
        return (List<Nhanvien>) nhanVienRepository.findAll();
    }

    @Override
    public void save(Nhanvien nhanvien) {
        nhanVienRepository.save(nhanvien);
    }

    @Override
    public void remove(String id) {
        nhanVienRepository.deleteById(id);
    }

    @Override
    public List<Nhanvien> findByNameOrId(String searchName) {
        return nhanVienRepository.findAllByNameOrId(searchName);
    }

    @Override
    public Optional<Nhanvien> findById(String id) {
        return nhanVienRepository.findById(id);
    }
}
