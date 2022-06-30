package br.com.company.cadastro.items.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.company.cadastro.items.models.ItemMaster;
import br.com.company.cadastro.items.models.SKU;
import br.com.company.cadastro.items.repository.SKURepo;

@Repository
public class SKURepoImpl implements SKURepo {

    @Autowired
    private NamedParameterJdbcTemplate jdbctemplate;

    @Override
    public SKU findById(String id) throws Exception {

        var sql = new StringBuilder(this.getFullQueryBy("item = :id"));
        
        try {

            return jdbctemplate.queryForObject(
                sql.toString(), 
                new MapSqlParameterSource().addValue("id", id), 
                BeanPropertyRowMapper.newInstance(SKU.class)
            );
                
        } catch (EmptyResultDataAccessException e) {
            return null;
        }

    }

    @Override
    public List<SKU> findByIdList(List<String> ids) throws Exception {

        var sql = new StringBuilder(this.getFullQueryBy("item in (:ids)"));
        
        return jdbctemplate.query(
            sql.toString(), 
            new MapSqlParameterSource().addValue("ids", ids), 
            BeanPropertyRowMapper.newInstance(SKU.class)
        );
    }

    @Override
    public List<SKU> findByIdItemParent(String itemParentId) throws Exception {

        var sql = new StringBuilder(this.getFullQueryBy("item_parent = :itemParentId"));
        
        return jdbctemplate.query(
            sql.toString(), 
            new MapSqlParameterSource().addValue("itemParentId", itemParentId), 
            BeanPropertyRowMapper.newInstance(SKU.class)
        );
    }

    /**
     * Format full sql statement by id
     * @return sql statement by id
     */
    private String getFullQueryBy(String expression){

        StringBuilder sqlTemplate = new StringBuilder(ItemMaster.ITEM_MASTER_BASE_SQL);

        
        sqlTemplate.append("           im.ITEM_PARENT as \"itemParentId\", \n");
        sqlTemplate.append("           im.ITEM_GRANDPARENT as \"itemGrandParent\", \n");
        sqlTemplate.append("           im.ORIGINAL_RETAIL as \"originalRetail\", \n"); 
        sqlTemplate.append("           SUBCLASS.SUB_NAME AS  \"subClassName\",\n");
        sqlTemplate.append("           class.CLASS_NAME AS \"className\",\n");
        sqlTemplate.append("           deps.DEPT_NAME AS \"deptName\",\n");
        sqlTemplate.append("           groups.GROUP_NO AS \"groupId\",\n");
        sqlTemplate.append("           groups.GROUP_NAME AS \"groupName\",\n");
        sqlTemplate.append("           division.DIVISION AS \"divisionId\",\n");
        sqlTemplate.append("           division.DIV_NAME AS \"divisionName\"\n");
        sqlTemplate.append("      from admrms.item_master im \n"); 
        sqlTemplate.append(" LEFT JOIN admrms.SUBCLASS subclass\n");
        sqlTemplate.append("        ON SUBCLASS.CLASS    = im.CLASS\n");
        sqlTemplate.append("       AND SUBCLASS.DEPT     = im.DEPT\n");
        sqlTemplate.append("       AND SUBCLASS.SUBCLASS = im.SUBCLASS\n");
        sqlTemplate.append(" LEFT JOIN admrms.CLASS class\n");
        sqlTemplate.append("        ON class.DEPT        = im.DEPT\n");
        sqlTemplate.append("       AND class.CLASS       = im.CLASS\n");
        sqlTemplate.append(" LEFT JOIN admrms.DEPS deps\n");
        sqlTemplate.append("        ON deps.DEPT         = im.DEPT\n");
        sqlTemplate.append(" LEFT JOIN admrms.GROUPS groups \n");
        sqlTemplate.append("        ON groups.GROUP_NO   = deps.GROUP_NO\n");
        sqlTemplate.append(" LEFT JOIN admrms.DIVISION division\n");
        sqlTemplate.append("        ON division.DIVISION = groups.DIVISION\n"); 
        sqlTemplate.append("     where !expression! \n");
        sqlTemplate.append("       and item_level = 2 \n");
        sqlTemplate.append("       and tran_level = 2 \n");

        var sql = sqlTemplate.toString();
        sql = sql.replaceAll("!expression!", expression);

        return sql;
    }

}