package com.example.demo.repository;

import com.example.demo.model.Nhanvien;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NhanVienRepository extends CrudRepository<Nhanvien,String> {
    @Query(value = "select * from nhanvien  where tennhanvien like %:searchName% or manhanvien like %:searchName%",nativeQuery = true)
    List<Nhanvien> findAllByNameOrId(@Param("searchName") String searchName);

}
