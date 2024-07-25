package com.example.elasticsearch_springjpa.controller;

import com.example.elasticsearch_springjpa.model.SinhVien;
import com.example.elasticsearch_springjpa.service.sinhvienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping
public class sinhvienController {
    @Autowired
    private sinhvienService sinhVienService;

    @PostMapping
    public SinhVien createSinhVien(@RequestBody SinhVien sinhVien) {
        return sinhVienService.save(sinhVien);
    }

    @GetMapping("/{id}")
    public Optional<SinhVien> getSinhVienById(@PathVariable String id) {
        return sinhVienService.findById(id);
    }

    @GetMapping
    public Iterable<SinhVien> getAllSinhVien() {
        return sinhVienService.findAll();
    }

    @PutMapping("/{id}")
    public SinhVien updateSinhVien(@PathVariable String id, @RequestBody SinhVien sinhVien) {
        sinhVien.setId(id);
        return sinhVienService.save(sinhVien);
    }

    @DeleteMapping("/{id}")
    public void deleteSInhVien(@PathVariable String id) {
        sinhVienService.deleteById(id);
    }
}
