package com.example.restapipizza.controller;

import com.example.restapipizza.entity.User;
import com.example.restapipizza.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping
    public List<User> getAll(){
        return service.getAllUser();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable("id") int id){
        return service.getUserById(id);
    }

    @GetMapping("/phone/{phone}")
    public User getByPhone(@PathVariable("phone") String phone){
        return service.getUserByPhone(phone);
    }

    @PostMapping
    public User add(@RequestBody User user){
        return service.saveOrUpdate(user);
    }

    @PutMapping
    public User update(@RequestBody User user){
        return service.saveOrUpdate(user);
    }

    @DeleteMapping("/{id}")
    public User deleteById (@PathVariable("id") int id){
        return service.deleteUserById(id);
    }
}
