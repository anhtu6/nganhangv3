package com.example.demo.service;

import com.example.demo.model.Khachhang;
import com.example.demo.repository.KhachHangRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.SQLQuery;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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

    @Override
    public Iterable<Khachhang> findByName(String searchName) {
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
