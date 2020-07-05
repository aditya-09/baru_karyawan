package com.example.demo.dto;

import com.example.demo.entity.Karyawan;
import com.example.demo.entity.Posisi;
import com.example.demo.entity.Salary;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
//@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class TesRes {

    // Karyawan karyawan;
    // Posisi posisi;
    // Salary salary;
    // public TesRes(Karyawan karyawan, Posisi posisi, Salary salary) {
    //     this.karyawan = karyawan;
    //     this.salary = salary;
    //     this.posisi = posisi;
    // }

    private long nik;
    private String name;
    private String gol;
    private String tempat;
    private String tanggal;
    private String jk;
    private String agama;
    private String status;
    private String pekerjaan;
    private String kwr;
    private String alamat;
    private String rt;
    private String rw;
    private String kel;
    private String kec;

    private String posisi;
    private long salary;

    public TesRes(Long nik, String name, String gol, String tempat, String tanggal, String jk,
                        String agama, String status, String pekerjaan, String kwr, String alamat,
                        String rt, String rw, String kel, String kec, String posisi, long salary) {
    this.nik = nik;
    this.name = name;
    this.gol = gol;
    this.tempat = tempat;
    this.tanggal = tanggal;
    this.jk = jk;
    this.agama = agama;
    this.status = status;
    this.pekerjaan = pekerjaan;
    this.kwr = kwr;
    this.alamat = alamat;
    this.rt = rt;
    this.rw = rw;
    this.kel = kel;
    this.kec = kec;

    this.posisi = posisi;
    this.salary = salary;
    }
}
