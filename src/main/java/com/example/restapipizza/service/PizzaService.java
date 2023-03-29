package com.example.restapipizza.service;

import com.example.restapipizza.entity.Pizza;

import java.util.List;

public interface PizzaService {
    List<Pizza> getAllPizza();
    Pizza saveOrUpdate(Pizza pizza);
    Pizza getPizzaById(int id);
    Pizza deletePizzaById(int id);
}
