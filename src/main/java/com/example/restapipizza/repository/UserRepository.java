package com.example.restapipizza.repository;

import com.example.restapipizza.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByPhone(String phone);
}
