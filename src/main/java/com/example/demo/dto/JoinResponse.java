package com.example.demo.dto;

import com.example.demo.entity.Karyawan;
import com.example.demo.entity.Posisi;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class JoinResponse {

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
    
public JoinResponse(String name, String gol, String posisi, long salary) {
    this.name = name;
    this.gol = gol;
    this.posisi = posisi;
    this.salary = salary;
}

    
}
