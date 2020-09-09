package com.example.demo.service;

import com.example.demo.model.Khachhang;
import com.example.demo.repository.KhachHangRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service
public class KhachhangServiceImpl implements KhachhangService {
    @Autowired
    private KhachHangRepository khachHangRepository;
    @Override
    public List<Khachhang> findAll() {
        return (List<Khachhang>) khachHangRepository.findAll();
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

    @Override
    public List<Khachhang> findByName(String searchName) {
//      EntityManagerFactory emf =Persistence.createEntityManagerFactory("manage khach hang");
//      EntityManager em = emf.createEntityManager();
//        Query query = em.createNamedQuery("findCus");
//        query.setParameter("searchName",searchName);
//        List<Khachhang> khachhangs= query.getResultList();
//        for (Khachhang khachhang:khachhangs){
//            System.out.println("ten "+khachhang.getTenkhachhang());
//        }
       // khachHangRepository.searchByName(searchName);
        return khachHangRepository.findAllByTenkhachhang(searchName);

    }




}
