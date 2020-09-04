package com.example.demo.controller;

import com.example.demo.model.Khachhang;
import com.example.demo.service.KhachhangService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/khachhang")
public class KhachhangController {
    @Autowired
    private KhachhangService khachhangService;

//    public String listKhachHang(){
//        List<Khachhang> khachhangs;
//       khachhangs= (List<Khachhang>) khachhangService.findAll();
//        return "showKhachhang";
//    }
    @GetMapping("/list")
    public ModelAndView listKhachhangs(){
        Iterable<Khachhang> khachhangs = khachhangService.findAll();
        ModelAndView modelAndView = new ModelAndView("showKhachhang");
        modelAndView.addObject("khachhangs",khachhangs);
        return modelAndView;
    }
    @GetMapping("/create-khachhang")
    public ModelAndView showCreateFormKhachhang(){
        ModelAndView modelAndView = new ModelAndView("TaoTaikhoanKhach");
        modelAndView.addObject("khachhang",new Khachhang());
        return modelAndView;
    }
    @PostMapping("/create-khachhang")
    public ModelAndView saveKhachhang(@ModelAttribute Khachhang khachhang){
        khachhangService.save(khachhang);
        ModelAndView modelAndView = new ModelAndView("TaoTaikhoanKhach");
        modelAndView.addObject("khachhang", new Khachhang());
        modelAndView.addObject("message","da tao khach thanh cong");
        return modelAndView;
    }

}
