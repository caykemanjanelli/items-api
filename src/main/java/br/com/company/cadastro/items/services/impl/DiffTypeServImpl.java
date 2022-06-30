package br.com.company.cadastro.items.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import br.com.company.cadastro.items.models.DiffType;
import br.com.company.cadastro.items.repository.DiffTypeRepo;
import br.com.company.cadastro.items.services.DiffTypeServ;

@Service
public class DiffTypeServImpl implements DiffTypeServ {

    @Autowired
    private DiffTypeRepo repo;

    @Override
    @Cacheable(value = "DiffType-findById", key = "#id")
    public DiffType findById(String id) throws Exception {
        return repo.findById(id);
    }

}