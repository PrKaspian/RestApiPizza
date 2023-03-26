package com.example.restapipizza.service;

import com.example.restapipizza.entity.Order;
import com.example.restapipizza.entity.OrderItem;
import com.example.restapipizza.entity.Size;
import com.example.restapipizza.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceImpl implements OrderItemService{
    @Autowired
    private OrderItemRepository itemRepository;
    @Override
    public List<OrderItem> getAllOrderItem() {
        return itemRepository.findAll();
    }

    @Override
    public List<OrderItem> getAllOrderItemsByOrderId(int id) {
        return itemRepository.findOrderItemsByOrderId(id);
    }

    @Override
    public OrderItem saveOrUpdate(OrderItem orderItem) {
        return itemRepository.save(orderItem);
    }

    @Override
    public OrderItem getItemById(int id) {
        return itemRepository.findById(id).orElse(null);
    }

}
