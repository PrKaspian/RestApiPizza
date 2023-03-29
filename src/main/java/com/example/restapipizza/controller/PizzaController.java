package com.example.restapipizza.controller;

import com.example.restapipizza.entity.Pizza;
import com.example.restapipizza.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pizzas")
public class PizzaController {
    @Autowired
    private PizzaService service;

    @GetMapping
    public List<Pizza> getAll(){
        return service.getAllPizza();
    }



    @GetMapping("/{id}")
    public Pizza getById(@PathVariable("id") int id){
        return service.getPizzaById(id);
    }

    @PostMapping
    public Pizza add(@RequestBody Pizza pizza){
        return service.saveOrUpdate(pizza);
    }

    @PutMapping
    public Pizza update(@RequestBody Pizza pizza){
        return service.saveOrUpdate(pizza);
    }

    @DeleteMapping("/{id}")
    public Pizza deleteById(@PathVariable("id") int id){
        return service.deletePizzaById(id);
    }
}
