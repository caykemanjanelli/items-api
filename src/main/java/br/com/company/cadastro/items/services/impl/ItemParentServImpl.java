package br.com.company.cadastro.items.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import br.com.company.cadastro.items.models.ItemParent;
import br.com.company.cadastro.items.repository.ItemParentRepo;
import br.com.company.cadastro.items.services.ItemParentServ;

@Service
public class ItemParentServImpl implements ItemParentServ {

    @Autowired
    private ItemParentRepo repo;

    @Override
    @Cacheable(value = "ItemParent-findById", key = "#id")
    public ItemParent findById(String id) throws Exception {
        return repo.findById(id);
    }

    @Override
    @Cacheable(value = "ItemParent-findByIdList", key = "#ids")
    public List<ItemParent> findByIdList(List<String> ids) throws Exception {
        return repo.findByIdList(ids);
    }

}