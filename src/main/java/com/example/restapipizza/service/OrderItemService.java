package com.example.restapipizza.service;

import com.example.restapipizza.entity.OrderItem;

import java.util.List;

public interface OrderItemService {
    List<OrderItem>getAllOrderItem();
    List<OrderItem>getAllOrderItemsByOrderId(int id);
    OrderItem saveOrUpdate(OrderItem orderItem);
    OrderItem getItemById(int id);

}
