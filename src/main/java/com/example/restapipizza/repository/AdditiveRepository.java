package com.example.restapipizza.repository;

import com.example.restapipizza.entity.Additive;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdditiveRepository extends JpaRepository<Additive, Integer> {
}
