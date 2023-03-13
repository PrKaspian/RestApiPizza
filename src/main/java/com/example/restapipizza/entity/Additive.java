package com.example.restapipizza.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pizza_additives")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Additive {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private double price;

    @Column(name = "is_actual")
    private boolean isActual;
}
