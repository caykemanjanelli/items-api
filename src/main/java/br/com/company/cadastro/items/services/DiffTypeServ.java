package br.com.company.cadastro.items.services;

import br.com.company.cadastro.items.models.DiffType;

public interface DiffTypeServ {


    /**
     * Get's diff type data by id
     * @param id
     * @return DiffType
     * @throws Exception
     */
    DiffType findById(String id) throws Exception;

}