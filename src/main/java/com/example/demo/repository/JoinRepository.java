package com.example.demo.repository;

import com.example.demo.dto.JoinResponse;
import com.example.demo.dto.TesRes;
import com.example.demo.entity.Karyawan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JoinRepository extends JpaRepository<Karyawan,Integer> {

    @Query("SELECT new com.example.demo.dto.JoinResponse(c.name, c.gol, p.posisi, s.salary) FROM Karyawan c JOIN c.posisi p Join c.salaries s")
    public List<JoinResponse> getJoin();

    @Query( "SELECT new com.example.demo.dto.TesRes(c.nik, c.name, c.gol, c.tempat, c.tanggal, c.jk,"+
            "c.agama, c.status, c.pekerjaan, c.kwr, c.alamat,"+
            "c.rt, c.rw, c.kel, c.kec, p.posisi, s.salary) FROM Karyawan c JOIN c.posisi p Join c.salaries s")
    public List<TesRes> getAllJoin();

    @Query("SELECT u FROM Karyawan AS u")
    public List<Karyawan> get();

    @Query( value = "insert into Karyawan (name, nik) values (:name, :nik)", nativeQuery = true)
    public List<Karyawan> insert(   @Param("name") String name, @Param("nik") Integer nik);
}
