package com.example.restapipizza.service;

import com.example.restapipizza.entity.User;
import com.example.restapipizza.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User getUserByPhone(String phone) {
        return userRepository.findUserByPhone(phone);
    }

    @Override
    public User saveOrUpdate(User user) {
        return userRepository.save(user);
    }

    @Override
    public User deleteUserById(int id) {
        User user = userRepository.findById(id).orElse(null);
        userRepository.deleteById(id);
        return user;
    }
}
