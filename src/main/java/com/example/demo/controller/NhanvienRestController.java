package com.example.demo.controller;

import com.example.demo.model.Nhanvien;
import com.example.demo.service.NhanvienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/nhanvien")
@CrossOrigin(origins = "*")
public class NhanvienRestController {
    @Autowired
    NhanvienService nhanvienService;
    @GetMapping("/read")
    public List<Nhanvien> showAllNhanvien(){
        List<Nhanvien> nhanviens = nhanvienService.findAll();
        return nhanviens;
    }
    @GetMapping("/create")
    public Nhanvien showCreateFormNhanvien(){
        return new Nhanvien();
    }
    @PostMapping(path = "/create",consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveNhanvien(@RequestBody Nhanvien nhanvien){
        nhanvienService.save(nhanvien);
    }
    @GetMapping("/put/{id}")
    public Optional<Nhanvien> showEditNhanvienForm(@PathVariable String id){
        Optional<Nhanvien> nhanvien = nhanvienService.findById(id);
        return nhanvien;
    }
    @PostMapping(path = "/put",consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveEditedNhanvien(@RequestBody Nhanvien nhanvien){
        nhanvienService.save(nhanvien);
    }
    @GetMapping("/delete/{id}")
    public List<Nhanvien> showNhanvienListAfterDelete(@PathVariable String id){
        nhanvienService.remove(id);
        return nhanvienService.findAll();
    }
    @GetMapping("/search/{q}")
    public List<Nhanvien> showSearchResult(@PathVariable String q){
        List<Nhanvien> nhanviens = nhanvienService.findByNameOrId(q);
        return nhanviens;
    }

}
