package com.example.restapipizza.controller;

import com.example.restapipizza.entity.Order;
import com.example.restapipizza.entity.OrderItem;
import com.example.restapipizza.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class OrderItemController {
    @Autowired
    private OrderItemService service;

    @GetMapping
    public List<OrderItem> getAll(){
        return service.getAllOrderItem();
    }

    @GetMapping("/{id}")
    public OrderItem getById(@PathVariable("id") int id){
        return service.getItemById(id);
    }
    @GetMapping("/order/{id}")
    public List<OrderItem> getAllByOrder(@PathVariable("id") int id){
        return service.getAllOrderItemsByOrderId(id);
    }

    @PostMapping
    public OrderItem add(@RequestBody OrderItem item){
        return service.saveOrUpdate(item);
    }


    @PutMapping
    public OrderItem update(@RequestBody OrderItem item){
        return service.saveOrUpdate(item);
    }

}
