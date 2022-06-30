package br.com.company.cadastro.items.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import br.com.company.cadastro.items.models.DiffId;
import br.com.company.cadastro.items.repository.DiffIdRepo;
import br.com.company.cadastro.items.services.DiffIdServ;

@Service
public class DiffIdServImpl implements DiffIdServ {

    @Autowired
    private DiffIdRepo repo;

    @Override
    @Cacheable(value = "DiffId-findById", key = "#id")
    public DiffId findById(String id) throws Exception {
        return repo.findById(id);
    }

}