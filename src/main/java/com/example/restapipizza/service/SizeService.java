package com.example.restapipizza.service;

import com.example.restapipizza.entity.Size;

import java.util.List;

public interface SizeService {
    List<Size> getAllSize();
    Size getSizeById(int id);
    Size saveOrUpdate(Size size);
    Size deleteSizeById(int id);

}
