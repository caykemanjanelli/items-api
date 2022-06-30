package br.com.company.cadastro.items.services;

import java.util.List;

import br.com.company.cadastro.items.models.SKU;

public interface SKUServ {

    /**
     * Gets sku data by id
     * @param id
     * @return sku
     * @throws Exception
     */
    SKU findById(String id) throws Exception;

    /**
     * Gets a list with SKUs by a array of ids
     * @param ids
     * @return list of skus
     * @throws Exception
     */
    List<SKU> findByIdList(List<String> ids) throws Exception;


    /**
     * Gets a list with SKUs by item parent (model)
     * @param ids
     * @return list of skus
     * @throws Exception
     */
    List<SKU> findByIdItemParent(String itemParentId) throws Exception;


}