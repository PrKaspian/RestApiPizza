package com.example.restapipizza.controller;

import com.example.restapipizza.entity.Size;
import com.example.restapipizza.service.PizzaService;
import com.example.restapipizza.service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.SpringApplicationEvent;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sizes")
public class SizeController {
    @Autowired
    private SizeService service;

    @GetMapping
    public List<Size> getAll(){
        return service.getAllSize();
    }

    @GetMapping("/{id}")
    public Size getById(@PathVariable("id") int id){
        return service.getSizeById(id);
    }

    @PostMapping
    public Size add(@RequestBody Size size){
        return service.saveOrUpdate(size);
    }

    @PutMapping
    public Size update(@RequestBody Size size){
        return service.saveOrUpdate(size);
    }

    @DeleteMapping("/{id}")
    public Size deleteById(@PathVariable("id") int id){
        return service.deleteSizeById(id);
    }
}
