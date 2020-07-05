package com.example.demo.repository;

import com.example.demo.entity.Karyawan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KaryawanRepository extends JpaRepository<Karyawan, Integer> {
}
