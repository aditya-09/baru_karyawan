package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "karyawan")
public class Karyawan {
    @Id long nik;
    @GeneratedValue
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

    @OneToMany(targetEntity = Posisi.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="cp_fk",referencedColumnName = "nik")
    private List<Posisi> posisi;

    @OneToMany(targetEntity = Salary.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="cp_fk",referencedColumnName = "nik")
    private List<Salary> salaries;

//    public void setId(int nik) {
//        this.nik = nik;
//    }

}
