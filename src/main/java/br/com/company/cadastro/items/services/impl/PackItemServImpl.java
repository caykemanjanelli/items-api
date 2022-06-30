package br.com.company.cadastro.items.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import br.com.company.cadastro.items.models.PackItem;
import br.com.company.cadastro.items.repository.PackItemRepo;
import br.com.company.cadastro.items.services.PackItemServ;

@Service
public class PackItemServImpl implements PackItemServ {

    @Autowired
    private PackItemRepo repo;

    @Override
    @Cacheable(value = "PackItem-findByPackId", key = "#packId")
    public List<PackItem> findByPackId(String packId) throws Exception {
        return repo.findByPackId(packId);
    }

}