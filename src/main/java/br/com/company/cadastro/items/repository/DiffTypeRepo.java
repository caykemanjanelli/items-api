package br.com.company.cadastro.items.repository;

import br.com.company.cadastro.items.models.DiffType;

public interface DiffTypeRepo {


    /**
     * Get's diff type data by id
     * @param id
     * @return DiffType
     * @throws Exception
     */
    DiffType findById(String id) throws Exception;    

}