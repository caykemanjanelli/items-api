package br.com.company.cadastro.items.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.company.cadastro.items.models.DiffId;
import br.com.company.cadastro.items.repository.DiffIdRepo;

@Repository
public class DiffIdRepoImpl implements DiffIdRepo {

    @Autowired
    private NamedParameterJdbcTemplate jdbctemplate;

    @Override
    public DiffId findById(String id) throws Exception {
        String sql = 
        " SELECT DIFF_ID AS \"id\",\n" + 
        "        DIFF_TYPE AS \"diffTypeId\",\n" + 
        "        DIFF_DESC AS \"description\",\n" + 
        "        INDUSTRY_CODE AS \"industryCode\",\n" + 
        "        INDUSTRY_SUBGROUP AS \"industrySubgroup\",\n" + 
        "        CREATE_DATETIME AS \"createDateTime\",\n" + 
        "        LAST_UPDATE_ID AS \"lasUpdateId\", \n" + 
        "        LAST_UPDATE_DATETIME AS \"lastUpdateDateTime\"\n" + 
        "   FROM admrms.DIFF_IDS\n" + 
        "  WHERE DIFF_ID = :id\n";

        try {
            return jdbctemplate.queryForObject(
                sql, 
                new MapSqlParameterSource().addValue("id", id), 
                BeanPropertyRowMapper.newInstance(DiffId.class)
            );
                
        } catch (EmptyResultDataAccessException e) {
            return null;
        }

    }

}