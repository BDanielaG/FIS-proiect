package com.fis.proiectFis.restAPI;

import com.fis.proiectFis.entities.Rezervare;
import com.fis.proiectFis.entities.Zbor;
import com.fis.proiectFis.repositories.RezervareRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestApiRezervare {

    @Autowired
    RezervareRepo rezervareRepo;

    @GetMapping("/getAll/rezervare")
    public List<Rezervare> getAll(){
        return rezervareRepo.findAll();
    }

    @PostMapping("/create/rezervare")
    public void create_zbor(@RequestBody Rezervare rezervare){
        rezervareRepo.save(rezervare);
    }

    @DeleteMapping("/delete/rezervare/{id}")
    public void delete_rezervare(@PathVariable int id)
    {
        rezervareRepo.deleteById(id);
    }

    @PutMapping("/update/rezervare")
    public void update(@RequestBody Rezervare rezervare){
        rezervareRepo.save(rezervare);}
}
