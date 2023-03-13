package com.example.restapipizza.service;

import com.example.restapipizza.entity.Size;
import com.example.restapipizza.repository.SizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SizeServiceImpl implements SizeService{
    @Autowired
    private SizeRepository sizeRepository;
    @Override
    public List<Size> getAllSize() {
        return sizeRepository.findAll();
    }

    @Override
    public Size getSizeById(int id) {
        return sizeRepository.findById(id).orElse(null);
    }

    @Override
    public Size saveOrUpdate(Size size) {
        return sizeRepository.save(size);
    }

    @Override
    public Size deleteSizeById(int id) {
        Size size = sizeRepository.findById(id).orElse(null);
        sizeRepository.deleteById(id);
        return size;
    }
}
