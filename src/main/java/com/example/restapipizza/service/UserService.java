package com.example.restapipizza.service;



import com.example.restapipizza.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User getUserById(int id);
    User getUserByPhone(String phone);
    User saveOrUpdate(User user);
    User deleteUserById(int id);
}
