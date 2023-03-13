package com.example.restapipizza.service;

import com.example.restapipizza.entity.Order;
import com.example.restapipizza.entity.OrderItem;
import org.aspectj.weaver.ast.Or;

import java.util.List;

public interface OrderService {
    List<Order> getAllOrders();
    List<Order> getAllOrdersByUserId(int id);
    List<Order> getAllOrdersByUserPhone(String phone);
    List<Order> getAllOrdersByStatus(String status);
    Order saveOrUpdateOrder(Order order);
    Order getOrderById(int id);
    Order deleteOrderById(int id);
}
