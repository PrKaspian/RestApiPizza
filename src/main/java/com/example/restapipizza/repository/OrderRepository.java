package com.example.restapipizza.repository;

import com.example.restapipizza.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<Order>findAllByUserId(int userId);

    List<Order> findAllByPhone(String phone);
    List<Order> findAllByStatus(String status);
}
