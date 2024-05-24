package com.fis.proiectFis.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Rezervare {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String oras_dus;
    private String oras_intors;
    private LocalDate data_plecare;
    private LocalDate data_sosire;
    private int nr_locuri_copii;
    private int nr_locuri_adulti;
    private int nr_locuri_seniori;
    private String tip_clasa;
//    private boolean cu_retur;
    private float discount_retur;
    private float discount_last_minute;


}
