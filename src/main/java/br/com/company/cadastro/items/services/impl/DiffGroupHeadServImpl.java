package br.com.company.cadastro.items.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import br.com.company.cadastro.items.models.DiffGroupHead;
import br.com.company.cadastro.items.repository.DiffGroupHeadRepo;
import br.com.company.cadastro.items.services.DiffGroupHeadServ;

@Service
public class DiffGroupHeadServImpl implements DiffGroupHeadServ {

    @Autowired
    private DiffGroupHeadRepo repo;

    @Override
    @Cacheable(value = "DiffGroupHead-findById", key = "#id")
    public DiffGroupHead findById(String id) throws Exception {
        return repo.findById(id);
    }

}