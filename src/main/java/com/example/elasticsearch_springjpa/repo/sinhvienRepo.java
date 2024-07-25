package com.example.elasticsearch_springjpa.repo;

import com.example.elasticsearch_springjpa.model.SinhVien;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface sinhvienRepo extends ElasticsearchRepository<SinhVien, String> {
}
