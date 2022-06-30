package br.com.company.cadastro.items.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.company.cadastro.items.models.ItemMaster;
import br.com.company.cadastro.items.models.Pack;
import br.com.company.cadastro.items.repository.PackRepo;

@Repository
public class PackRepoImpl implements PackRepo {

    @Autowired
    private NamedParameterJdbcTemplate jdbctemplate;

    @Override
    public Pack findById(String id) throws Exception {

        var sql = this.getFullQueryBy("im.item = :id");

        try {
            return jdbctemplate.queryForObject(
                sql, 
                new MapSqlParameterSource().addValue("id", id), 
                BeanPropertyRowMapper.newInstance(Pack.class)
            );
        } catch (EmptyResultDataAccessException e) {
            return null;
        }

    }

    @Override
    public List<Pack> findByIdList(List<String> ids) throws Exception {

        var sql = new StringBuilder(this.getFullQueryBy("im.item in (:ids)"));
        sql.append(" order by im.item \n");

        return jdbctemplate.query(
            sql.toString(), 
            new MapSqlParameterSource().addValue("ids", ids), 
            BeanPropertyRowMapper.newInstance(Pack.class)
        );

    }

    /**
     * Format full sql statement by id
     * @return sql statement by id
     */
    private String getFullQueryBy(String expression){

        StringBuilder sqlTemplate = new StringBuilder(ItemMaster.ITEM_MASTER_BASE_SQL);

        sqlTemplate.append("       'dummy' as \"dummy\" \n"); 
        sqlTemplate.append("  from admrms.item_master im \n"); 
        sqlTemplate.append(" where !expression! \n");
        sqlTemplate.append("   and im.item_level = 1 \n");
        sqlTemplate.append("   and im.tran_level = 1 \n");

        var sql = sqlTemplate.toString();
        sql = sql.replaceAll("!expression!", expression);

        return sql;
    }


}