package com.example.restapipizza.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "user_phone")
    private String phone;
    @OneToMany(fetch = FetchType.EAGER,
    cascade = CascadeType.ALL,
    mappedBy = "order")
    private List<OrderItem> items = new ArrayList<>();
    @Column(name = "price")
    private double price;

    @Column(name = "status")
    private String status;

    public void addItem(OrderItem item){
        items.add(item);
    }
}
