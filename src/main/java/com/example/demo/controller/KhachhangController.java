package com.example.demo.controller;

import com.example.demo.model.Khachhang;
import com.example.demo.service.KhachhangService;
import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

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
    @GetMapping("/error")
    public ModelAndView display404(){
        ModelAndView modelAndView = new ModelAndView("error404");
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
//        ModelAndView modelAndView = new ModelAndView("TaoTaikhoanKhach");
//        modelAndView.addObject("khachhang", new Khachhang());
//        modelAndView.addObject("message","da tao khach thanh cong");

        Iterable<Khachhang> khachhangs = khachhangService.findAll();
        ModelAndView modelAndView = new ModelAndView("showKhachhang");
        modelAndView.addObject("khachhangs",khachhangs);
        return modelAndView;

    }
   @GetMapping("/edit-khachhang/{id}")
    public ModelAndView showEditForm(@PathVariable String id){
       Optional<Khachhang> khachhang = khachhangService.findById(id);
       if(khachhang.isPresent()) {
           ModelAndView modelAndView = new ModelAndView("/suaKhachhang");
           modelAndView.addObject("khachhang", khachhang);
           return modelAndView;

       }else {
           ModelAndView modelAndView = new ModelAndView("/error404");
           return modelAndView;
       }     
   }
   @PostMapping("/edit-khachhang")
    public ModelAndView updateKhachhang(@ModelAttribute Khachhang khachhang){
        khachhangService.save(khachhang);
        ModelAndView modelAndView = new ModelAndView("suaKhachhang");
        modelAndView.addObject("khachhang",khachhang);
        modelAndView.addObject("mesage","de them thanh cong");
        return modelAndView;
   }
   @GetMapping("/xoa-khachhang/{id}")
    public ModelAndView showDeleteForm(@PathVariable String id){
       Optional<Khachhang> khachhang = khachhangService.findById(id);
       if(khachhang.isPresent()){
           ModelAndView modelAndView = new ModelAndView("xoaKhachhang");
           modelAndView.addObject("khachhang",khachhang);
           return modelAndView;
       } else {
           ModelAndView modelAndView = new ModelAndView("error404");
           return modelAndView;
       }
   }
   @PostMapping("/xoa-khachhang")
    public String deleteKhachhang(@ModelAttribute Khachhang khachhang){
        khachhangService.remove(khachhang.getMakhachhang());
        return "redirect:list";
   }
    @PostMapping("/search-khachhang")
    public ModelAndView showSearchResult(@RequestParam("searchKhachhang") String searchKhachhang ){
        System.out.println("logging param");
        System.out.println(searchKhachhang);
//        ModelAndView modelAndView = new ModelAndView("showKhachhang");
//        return modelAndView;
       Iterable<Khachhang> khachhangs= khachhangService.findByName(searchKhachhang);
        System.out.println(khachhangs);
        if(khachhangs!=null) {
            ModelAndView modelAndView = new ModelAndView("showKhachhang");
            modelAndView.addObject("khachhangs", khachhangs);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("error404");
            return modelAndView;
        }
    }


}
