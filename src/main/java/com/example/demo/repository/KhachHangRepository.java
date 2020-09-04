package com.example.demo.repository;

import com.example.demo.model.Khachhang;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhachHangRepository extends CrudRepository<Khachhang, Long> {
}
