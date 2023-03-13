package com.example.restapipizza.service;

import com.example.restapipizza.entity.Additive;
import com.example.restapipizza.repository.AdditiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdditiveServiceImpl implements AdditiveService{
    @Autowired
    private AdditiveRepository additiveRepository;
    @Override
    public List<Additive> getAllAdditives() {
        return additiveRepository.findAll();
    }

    @Override
    public Additive saveOrUpdate(Additive additive) {
        return additiveRepository.save(additive);
    }

    @Override
    public Additive getAdditiveById(int id) {
        return additiveRepository.findById(id).orElse(null);
    }

//    @Override
//    public List<Additive> getAllAdditiveByActual(boolean val) {
//        return additiveRepository.findAdditivesByActualTrue(val);
//    }


}
