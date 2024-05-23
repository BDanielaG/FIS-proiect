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
    private boolean cu_retur;
    private float discount_retur;
    private float discount_last_minute;

    public Rezervare(int id, String oras_dus, String oras_intors, LocalDate data_plecare, LocalDate data_sosire, int nr_locuri_copii, int nr_locuri_adulti, int nr_locuri_seniori) {
        this.id = id;
        this.oras_dus = oras_dus;
        this.oras_intors = oras_intors;
        this.data_plecare = data_plecare;
        this.data_sosire = data_sosire;
        this.nr_locuri_copii = nr_locuri_copii;
        this.nr_locuri_adulti = nr_locuri_adulti;
        this.nr_locuri_seniori = nr_locuri_seniori;
    }

    public Rezervare() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOras_dus() {
        return oras_dus;
    }

    public void setOras_dus(String oras_dus) {
        this.oras_dus = oras_dus;
    }

    public String getOras_intors() {
        return oras_intors;
    }

    public void setOras_intors(String oras_intors) {
        this.oras_intors = oras_intors;
    }

    public LocalDate getData_plecare() {
        return data_plecare;
    }

    public void setData_plecare(LocalDate data_plecare) {
        this.data_plecare = data_plecare;
    }

    public LocalDate getData_sosire() {
        return data_sosire;
    }

    public void setData_sosire(LocalDate data_sosire) {
        this.data_sosire = data_sosire;
    }

    public int getNr_locuri_copii() {
        return nr_locuri_copii;
    }

    public void setNr_locuri_copii(int nr_locuri_copii) {
        this.nr_locuri_copii = nr_locuri_copii;
    }

    public int getNr_locuri_adulti() {
        return nr_locuri_adulti;
    }

    public void setNr_locuri_adulti(int nr_locuri_adulti) {
        this.nr_locuri_adulti = nr_locuri_adulti;
    }

    public int getNr_locuri_seniori() {
        return nr_locuri_seniori;
    }

    public void setNr_locuri_seniori(int nr_locuri_seniori) {
        this.nr_locuri_seniori = nr_locuri_seniori;
    }
}
