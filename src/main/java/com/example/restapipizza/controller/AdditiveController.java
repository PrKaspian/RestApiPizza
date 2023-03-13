package com.example.restapipizza.controller;

import com.example.restapipizza.entity.Additive;
import com.example.restapipizza.service.AdditiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/additives")
public class AdditiveController {
    @Autowired
    private AdditiveService service;

    @GetMapping
    public List<Additive> getAll(){
        return service.getAllAdditives();
    }

    @GetMapping("/{id}")
    public Additive getById(@PathVariable("id") int id){
        return service.getAdditiveById(id);
    }

//    @GetMapping("/actual")
//    public List<Additive> getAllByActual(){
//        return service.getAllAdditiveByActual(true);
//    }

    @PostMapping
    public Additive add(@RequestBody Additive additive){
        return service.saveOrUpdate(additive);
    }

    @PutMapping
    public Additive update(@RequestBody Additive additive){
        return service.saveOrUpdate(additive);
    }

}
