package com.fis.proiectFis.entities;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDate;

@Entity
public class Zbor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int cod_zbor;
    private int nr_locuri_total;
    private LocalDate ora_plecare;
    private LocalDate ora_sosire;
    private String nume_companie;
    private String sursa;
    private String destinatie;
    private int  nr_locuri_seniori;
    private int  nr_locuri_adulti;
    private int  nr_locuri_copii;
    private float pret;
    private int locuri_business;
    private int locuri_economy;
    private int lcouri_first;
    private String zile_operare;
//    private float discount;


    public Zbor() {
    }

    public Zbor(int id, int cod_zbor, int nr_locuri_total, LocalDate ora_plecare, LocalDate ora_sosire, String nume_companie, String sursa, String destinatie, int nr_locuri_seniori, int nr_locuri_adulti, int nr_locuri_copii, float pret, int locuri_business, int locuri_economy, int lcouri_first, String zile_operare) {
        this.id = id;
        this.cod_zbor = cod_zbor;
        this.nr_locuri_total = nr_locuri_total;
        this.ora_plecare = ora_plecare;
        this.ora_sosire = ora_sosire;
        this.nume_companie = nume_companie;
        this.sursa = sursa;
        this.destinatie = destinatie;
        this.nr_locuri_seniori = nr_locuri_seniori;
        this.nr_locuri_adulti = nr_locuri_adulti;
        this.nr_locuri_copii = nr_locuri_copii;
        this.pret = pret;
        this.locuri_business = locuri_business;
        this.locuri_economy = locuri_economy;
        this.lcouri_first = lcouri_first;
        this.zile_operare = zile_operare;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCod_zbor() {
        return cod_zbor;
    }

    public void setCod_zbor(int cod_zbor) {
        this.cod_zbor = cod_zbor;
    }

    public int getNr_locuri_total() {
        return nr_locuri_total;
    }

    public void setNr_locuri_total(int nr_locuri_total) {
        this.nr_locuri_total = nr_locuri_total;
    }

    public LocalDate getOra_plecare() {
        return ora_plecare;
    }

    public void setOra_plecare(LocalDate ora_plecare) {
        this.ora_plecare = ora_plecare;
    }

    public LocalDate getOra_sosire() {
        return ora_sosire;
    }

    public void setOra_sosire(LocalDate ora_sosire) {
        this.ora_sosire = ora_sosire;
    }

    public String getNume_companie() {
        return nume_companie;
    }

    public void setNume_companie(String nume_companie) {
        this.nume_companie = nume_companie;
    }

    public String getSursa() {
        return sursa;
    }

    public void setSursa(String sursa) {
        this.sursa = sursa;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    public int getNr_locuri_seniori() {
        return nr_locuri_seniori;
    }

    public void setNr_locuri_seniori(int nr_locuri_seniori) {
        this.nr_locuri_seniori = nr_locuri_seniori;
    }

    public int getNr_locuri_adulti() {
        return nr_locuri_adulti;
    }

    public void setNr_locuri_adulti(int nr_locuri_adulti) {
        this.nr_locuri_adulti = nr_locuri_adulti;
    }

    public int getNr_locuri_copii() {
        return nr_locuri_copii;
    }

    public void setNr_locuri_copii(int nr_locuri_copii) {
        this.nr_locuri_copii = nr_locuri_copii;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public int getLocuri_business() {
        return locuri_business;
    }

    public void setLocuri_business(int locuri_business) {
        this.locuri_business = locuri_business;
    }

    public int getLocuri_economy() {
        return locuri_economy;
    }

    public void setLocuri_economy(int locuri_economy) {
        this.locuri_economy = locuri_economy;
    }

    public int getLcouri_first() {
        return lcouri_first;
    }

    public void setLcouri_first(int lcouri_first) {
        this.lcouri_first = lcouri_first;
    }

    public String getZile_operare() {
        return zile_operare;
    }

    public void setZile_operare(String zile_operare) {
        this.zile_operare = zile_operare;
    }
}
