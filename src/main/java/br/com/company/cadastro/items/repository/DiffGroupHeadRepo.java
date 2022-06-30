package br.com.company.cadastro.items.repository;

import br.com.company.cadastro.items.models.DiffGroupHead;

public interface DiffGroupHeadRepo {

    /**
     * Gets diff group head data by id
     * @param id
     * @return Diff Group Head
     * @throws Exception
     */
    DiffGroupHead findById(String id) throws Exception;


}