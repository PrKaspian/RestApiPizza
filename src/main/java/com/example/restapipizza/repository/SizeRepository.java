package com.example.restapipizza.repository;

import com.example.restapipizza.entity.Size;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SizeRepository extends JpaRepository<Size, Integer> {
}
