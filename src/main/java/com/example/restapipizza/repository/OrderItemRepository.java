package com.example.restapipizza.repository;

import com.example.restapipizza.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer>{
    List<OrderItem>findOrderItemsByOrderId(int id);
}
