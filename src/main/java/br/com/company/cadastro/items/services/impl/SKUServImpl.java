package br.com.company.cadastro.items.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import br.com.company.cadastro.items.models.SKU;
import br.com.company.cadastro.items.repository.SKURepo;
import br.com.company.cadastro.items.services.DiffIdServ;
import br.com.company.cadastro.items.services.SKUServ;

@Service
public class SKUServImpl implements SKUServ {

    @Autowired
    private SKURepo repo;

    @Autowired
    private DiffIdServ diffServ;

    @Override
    @Cacheable(value = "SKU-findById", key = "#id")
    public SKU findById(String id) throws Exception {

        var sku = repo.findById(id);
        var diffCor = diffServ.findById(sku.getDiff01());
        var diffSize = diffServ.findById(sku.getDiff02());
        
        sku.setColor(diffCor);
        sku.setSize(diffSize);

         return sku;
    }

    @Override
    @Cacheable(value = "SKU-findByIdList", key = "#ids")
    public List<SKU> findByIdList(List<String> ids) throws Exception {
        return repo.findByIdList(ids);
    }

    @Override
    @Cacheable(value = "SKU-findByIdItemParent", key = "#itemParentId")
    public List<SKU> findByIdItemParent(String itemParentId) throws Exception {
        return repo.findByIdItemParent(itemParentId);
    }

}