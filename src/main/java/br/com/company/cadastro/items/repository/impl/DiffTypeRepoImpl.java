package br.com.company.cadastro.items.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.company.cadastro.items.models.DiffType;
import br.com.company.cadastro.items.repository.DiffTypeRepo;

@Repository
public class DiffTypeRepoImpl implements DiffTypeRepo {

    @Autowired
    private NamedParameterJdbcTemplate jdbctemplate;

    @Override
    public DiffType findById(String id) throws Exception {
        String sql = "SELECT DIFF_TYPE  AS \"id\",\n" + 
                     "       DIFF_TYPE_DESC AS \"description\"\n" + 
                     "  FROM admrms.DIFF_TYPE\n" + 
                     " WHERE DIFF_TYPE = :id \n";

        try {

            return jdbctemplate.queryForObject(
                sql, 
                new MapSqlParameterSource().addValue("id", id), 
                BeanPropertyRowMapper.newInstance(DiffType.class)
            );

        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }


}