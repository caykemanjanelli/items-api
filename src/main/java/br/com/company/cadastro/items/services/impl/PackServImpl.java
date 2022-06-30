package br.com.company.cadastro.items.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import br.com.company.cadastro.items.models.Pack;
import br.com.company.cadastro.items.repository.PackRepo;
import br.com.company.cadastro.items.services.PackServ;

@Service
public class PackServImpl implements PackServ {

    @Autowired
    private PackRepo repo;

    @Override
    @Cacheable(value = "Pack-findById", key = "#id")
    public Pack findById(String id) throws Exception {
        return repo.findById(id);
    }

    @Override
    @Cacheable(value = "Pack-findByIdList", key = "#ids")
    public List<Pack> findByIdList(List<String> ids) throws Exception {
        return repo.findByIdList(ids);
    }

}