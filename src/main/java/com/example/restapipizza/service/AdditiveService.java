package com.example.restapipizza.service;

import com.example.restapipizza.entity.Additive;

import java.util.List;

public interface AdditiveService {
    List<Additive>getAllAdditives();
    Additive saveOrUpdate(Additive additive);
    Additive getAdditiveById(int id);

}
