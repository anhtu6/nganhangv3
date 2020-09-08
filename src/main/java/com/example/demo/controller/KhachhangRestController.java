package com.example.demo.controller;

import com.example.demo.model.Khachhang;
import com.example.demo.service.KhachhangService;
import com.example.demo.service.KhachhangServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/khachhang")
@CrossOrigin(origins = "*")
public class KhachhangRestController {
    @Autowired
    KhachhangService khachhangService;
    @GetMapping("/list")
    public List<Khachhang> showKhachhangList(){
        List<Khachhang> khachhangList;
        khachhangList=khachhangService.findAll();
//        return "showKhachhang";
        return khachhangService.findAll();

    }
    @GetMapping("/create-khachhang")
    public Khachhang showCreateFormKhachhang(){
      return new Khachhang();
    }
    @PostMapping(path = "/create-khachhang",consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveKhachhang(@RequestBody Khachhang khachhang){
        khachhangService.save(khachhang);
    }


    @GetMapping("/edit-khachhang/{id}")
    public Optional<Khachhang> showEditKhachhangForm(@PathVariable String id){
        Optional<Khachhang> khachhang = khachhangService.findById(id);
        return khachhang;
    }


    @PostMapping(path = "/edit-khachhang",consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveEditedKhachhang(@RequestBody Khachhang khachhang){

        khachhangService.save(khachhang);
    }
    @GetMapping("/xoa-khachhang/{id}")
    public List<Khachhang> showUpdatedKhachhangList(@PathVariable String id){
        //Optional<Khachhang> khachhang = khachhangService.findById(id);
        khachhangService.remove(id);
        return khachhangService.findAll();
    }
    @PostMapping("/search-khachhang")
    public List<Khachhang> showSearchResult(@RequestParam("searchKhachhang") String searchKhachhang){
        List<Khachhang> khachhangs =khachhangService.findByName(searchKhachhang);
        return khachhangs;
    }
    @GetMapping("/search-khachhang/{searchKhachhang}")
    public List<Khachhang> showSearchResultGet(@PathVariable("searchKhachhang") String searchKhachhang){

        List<Khachhang> khachhangs = khachhangService.findByName(searchKhachhang);
        return khachhangs;
    }





}
