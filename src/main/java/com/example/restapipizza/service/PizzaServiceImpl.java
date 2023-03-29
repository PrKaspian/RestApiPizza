package com.example.restapipizza.service;

import com.example.restapipizza.entity.Pizza;
import com.example.restapipizza.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaServiceImpl implements PizzaService{
    @Autowired
    private PizzaRepository pizzaRepository;
    @Override
    public List<Pizza> getAllPizza() {
        return pizzaRepository.findAll();
    }



    @Override
    public Pizza saveOrUpdate(Pizza pizza) {
        return pizzaRepository.save(pizza);
    }

    @Override
    public Pizza getPizzaById(int id) {
        return pizzaRepository.findById(id).orElse(null);
    }

    @Override
    public Pizza deletePizzaById(int id) {
        Pizza pizza = pizzaRepository.findById(id).orElse(null);
        pizzaRepository.deleteById(id);
        return pizza;
    }
}
