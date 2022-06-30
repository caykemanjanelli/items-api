package br.com.company.cadastro.items.services;

import java.util.List;

import br.com.company.cadastro.items.models.PackItem;

public interface PackItemServ {

    /**
     * Gets a list of pack items by pack id
     * @param packId
     * @return list of pack items
     * @throws Exception
     */
    List<PackItem> findByPackId(String packId) throws Exception;


}