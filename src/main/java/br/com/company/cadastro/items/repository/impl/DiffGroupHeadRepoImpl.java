package br.com.company.cadastro.items.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.company.cadastro.items.models.DiffGroupHead;
import br.com.company.cadastro.items.repository.DiffGroupHeadRepo;

@Repository
public class DiffGroupHeadRepoImpl implements DiffGroupHeadRepo {

    @Autowired
    private NamedParameterJdbcTemplate jdbctemplate;

    @Override
    public DiffGroupHead findById(String id) throws Exception {
        
        String sql = " SELECT DIFF_GROUP_ID as \"id\",\n" + 
                     "        DIFF_TYPE as \"diffTypeId\",\n" + 
                     "        DIFF_GROUP_DESC as  \"description\",\n" + 
                     "        CREATE_DATETIME as \"createDateTime\",\n" + 
                     "        LAST_UPDATE_ID as \"lastUpdateId\",\n" + 
                     "        LAST_UPDATE_DATETIME as \"lastUpdateDateTime\"\n" + 
                     "  FROM admrms.DIFF_GROUP_HEAD\n" + 
                     "  WHERE DIFF_GROUP_ID = :id \n";

        try {

            return jdbctemplate.queryForObject(
                sql, 
                new MapSqlParameterSource().addValue("id", id), 
                BeanPropertyRowMapper.newInstance(DiffGroupHead.class)
            );

        } catch (EmptyResultDataAccessException e) {
            return new DiffGroupHead();
        }
    }

}