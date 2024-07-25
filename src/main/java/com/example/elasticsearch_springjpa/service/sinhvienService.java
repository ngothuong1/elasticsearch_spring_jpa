package com.example.elasticsearch_springjpa.service;

import com.example.elasticsearch_springjpa.model.SinhVien;
import com.example.elasticsearch_springjpa.repo.sinhvienRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class sinhvienService {
    @Autowired
    private sinhvienRepo sinhVienRepo;

    public SinhVien save(SinhVien sinhVien) {
        return sinhVienRepo.save(sinhVien);
    }

    public Optional<SinhVien> findById(String id) {
        return sinhVienRepo.findById(id);
    }

    public Iterable<SinhVien> findAll() {
        return sinhVienRepo.findAll();
    }

    public void deleteById(String id) {
        sinhVienRepo.deleteById(id);
    }
}
