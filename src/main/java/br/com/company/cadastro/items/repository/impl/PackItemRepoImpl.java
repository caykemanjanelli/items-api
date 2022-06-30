package br.com.company.cadastro.items.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.company.cadastro.items.models.PackItem;
import br.com.company.cadastro.items.repository.PackItemRepo;

@Repository
public class PackItemRepoImpl implements PackItemRepo {

    @Autowired
    private NamedParameterJdbcTemplate jdbctemplate;

    @Override
    public List<PackItem> findByPackId(String packId) throws Exception {
        
        String sql = 
        "SELECT PACK_NO as \"packId\",\n" + 
        "       SEQ_NO as \"sequenceNumber\",\n" + 
        "       ITEM as \"skuId\",\n" + 
        "       PACK_QTY as \"quantity\",\n" + 
        "       CREATE_DATETIME as \"createDateTime\",\n" + 
        "       LAST_UPDATE_DATETIME as \"lastUpdateDateTime\",\n" + 
        "       LAST_UPDATE_ID  as \"lastUpdateId\"\n" + 
        "  FROM admrms.PACKITEM \n" + 
        " WHERE PACK_NO = :packId \n" + 
        " ORDER BY PACK_NO , SEQ_NO \n";

        return jdbctemplate.query(
            sql, 
            new MapSqlParameterSource().addValue("packId", packId), 
            BeanPropertyRowMapper.newInstance(PackItem.class)
        );
    }

}