package com.example.restapipizza.service;

import com.example.restapipizza.entity.Order;
import com.example.restapipizza.entity.OrderItem;
import com.example.restapipizza.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderRepository orderRepository;
    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public List<Order> getAllOrdersByUserId(int id) {
        return orderRepository.findAllByUserId(id);
    }

    @Override
    public List<Order> getAllOrdersByUserPhone(String phone) {
        return orderRepository.findAllByPhone(phone);
    }

    @Override
    public List<Order> getAllOrdersByStatus(String status) {
        return orderRepository.findAllByStatus(status);
    }

    @Override
    public Order saveOrUpdateOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order getOrderById(int id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public Order deleteOrderById(int id) {
        Order order = orderRepository.findById(id).orElse(null);
        orderRepository.deleteById(id);
        return order;
    }
}
