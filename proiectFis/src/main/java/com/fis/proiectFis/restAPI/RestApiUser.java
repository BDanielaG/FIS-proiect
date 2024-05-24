package com.fis.proiectFis.restAPI;

import com.fis.proiectFis.entities.Utilizator;
import com.fis.proiectFis.entities.Zbor;
import com.fis.proiectFis.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestApiUser {

    @Autowired
    UserRepo userRepo;

    @GetMapping("/getAll/user")
    public List<Utilizator> getAll(){
        return userRepo.findAll();
    }

    @PostMapping("/create/user")
    public void create(@RequestBody Utilizator utilizator){
        userRepo.save(utilizator);
    }

    @PutMapping("/update/user")
    public void update(@RequestBody Utilizator utilizator){
        userRepo.save(utilizator);}

    @DeleteMapping("/delete/user/{id}")
    public void delete(@PathVariable int id){
        userRepo.deleteById(id);
    }
}
