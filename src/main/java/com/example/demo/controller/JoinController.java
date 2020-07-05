package com.example.demo.controller;

import com.example.demo.dto.JoinResponse;
import com.example.demo.dto.TesRes;
import com.example.demo.entity.Karyawan;
import com.example.demo.entity.Posisi;
import com.example.demo.entity.Salary;
import com.example.demo.repository.JoinRepository;
import com.example.demo.service.KaryawanService;
import com.example.demo.service.PosisiService;
import com.example.demo.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JoinController {
    @Autowired
    private JoinRepository joinRepo;
    @Autowired
    private KaryawanService kService;

    @PostMapping("/add")
    public Karyawan addProduct(@RequestBody Karyawan k){
        return kService.saveA(k);
    }

//    @PostMapping("/adds")
//    public Salary addProducts(@RequestBody Salary k){
//        return sService.saveUser(k);
//    }

    @GetMapping("/get")
    public List<JoinResponse> getJoinInformation() {
        return joinRepo.getJoin();
    }

    @GetMapping("/gets")
    public List<TesRes> getJoin() {
        return joinRepo.getAllJoin();
    }

    @GetMapping("/all")
    public List<Karyawan> all() {
        return joinRepo.get();
    }

    @GetMapping("/users")
    public List<Karyawan> findAllProducts(){
        return kService.getUsers();
    }

    @GetMapping("/insert/{name}/{second}")
    public List<Karyawan> spesifikData(@PathVariable String name, @PathVariable int second){
        return joinRepo.insert(name, second);
    }

    @PostMapping("/addUser")
    public Karyawan addProducts(@RequestBody Karyawan product){
        return kService.saveA(product);
    }

    @PostMapping("/addUsers")
    public List<Karyawan> addProduct(@RequestBody List<Karyawan> products){
        return kService.saveUsers(products);
    }

//    @GetMapping("/getss")
//    public List<TesRes> getTes(){
//        return joinRepo.getTes();
//    }
}
