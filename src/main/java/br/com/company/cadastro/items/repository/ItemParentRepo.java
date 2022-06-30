package br.com.company.cadastro.items.repository;

import java.util.List;

import br.com.company.cadastro.items.models.ItemParent;

public interface ItemParentRepo {

    /**
     * Gets item parent data by id
     * @param id
     * @return item parent
     * @throws Exception
     */
    ItemParent findById(String id) throws Exception;

    /**
     * Gets a list of item parents by a list of ids
     * @param ids
     * @return list of item parents
     * @throws Exception
     */
    List<ItemParent> findByIdList(List<String> ids) throws Exception;

}