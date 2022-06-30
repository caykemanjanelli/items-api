package br.com.company.cadastro.items.services;

import java.util.List;

import br.com.company.cadastro.items.models.Pack;

public interface PackServ {

    /**
     * Gets pack data by id
     * @return pack
     * @throws Exception
     */
    Pack findById(String id) throws Exception;

    /**
     * Gets the list of packs by a list of ids
     * @param ids
     * @return list of packs
     * @throws Exception
     */
    List<Pack> findByIdList(List<String> ids) throws Exception;    

}