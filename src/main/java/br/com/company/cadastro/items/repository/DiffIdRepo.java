package br.com.company.cadastro.items.repository;

import br.com.company.cadastro.items.models.DiffId;

public interface DiffIdRepo {

    /**
     * Gets diff id data by id;
     * @param id
     * @return Diff Id
     * @throws Exception
     */
    DiffId findById(String id) throws Exception;

}