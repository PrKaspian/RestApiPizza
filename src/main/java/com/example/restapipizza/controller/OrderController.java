package com.example.restapipizza.controller;

import com.example.restapipizza.entity.Order;
import com.example.restapipizza.entity.OrderItem;
import com.example.restapipizza.service.OrderService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService service;

    @GetMapping
    public List<Order> getAll(){
        return service.getAllOrders();
    }
    @GetMapping("/user/{id}")
    public List<Order> getByUserId(@PathVariable("id") int id){
        return service.getAllOrdersByUserId(id);
    }

    @GetMapping("/phone/{phone}")
    public List<Order> getByPhone(@PathVariable("phone") String phone){
        return service.getAllOrdersByUserPhone(phone);
    }

    @GetMapping("/status/{status}")
    public List<Order> getByStatus(@PathVariable("status") String status){
        return service.getAllOrdersByStatus(status);
    }

    @GetMapping("/{id}")
    public Order getById(@PathVariable("id") int id){
        return service.getOrderById(id);
    }

    @PostMapping
    public Order add(@RequestBody Order order){
        return service.saveOrUpdateOrder(order);
    }

    @PutMapping
    public Order update(@RequestBody Order order){
        return service.saveOrUpdateOrder(order);
    }

    @DeleteMapping("/{id}")
    public Order deleteById(@PathVariable("id") int id){
        return service.deleteOrderById(id);
    }
}
