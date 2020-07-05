package com.example.demo.service;

import com.example.demo.entity.Salary;
import com.example.demo.repository.SalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class SalaryService {
    @Autowired
    private SalaryRepository repo;

    public Salary saveUser(Salary s){
        return repo.save(s);
    }
}
