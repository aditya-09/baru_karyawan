package com.example.demo.service;

import com.example.demo.entity.Karyawan;
import com.example.demo.repository.KaryawanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KaryawanService {
    @Autowired
    private KaryawanRepository repository;

    public Karyawan saveA(Karyawan k){
        return repository.save(k);
    }

    public List<Karyawan> getUsers(){
        return repository.findAll();
    }

    public List<Karyawan> saveUsers(List<Karyawan> products){
        return repository.saveAll(products);
    }


}
