package br.com.company.cadastro.items.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.company.cadastro.items.exception.TechnicalException;
import br.com.company.cadastro.items.models.Atributo;
import br.com.company.cadastro.items.models.AtributoGrupo;
import br.com.company.cadastro.items.models.AtributoResumo;
import br.com.company.cadastro.items.models.FlexField;
import br.com.company.cadastro.items.repository.AtributoRepo;

@Repository
public class AtributoRepoImpl implements AtributoRepo {
	
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public static final String BASE_SQL =   "SELECT item.item\r\n" + 
				    		"        ,item.group_id\r\n" + 
				    		"        ,item.varchar2_1\r\n" + 
				    		"        ,item.varchar2_2\r\n" + 
				    		"        ,item.varchar2_3\r\n" + 
				    		"        ,item.varchar2_4\r\n" + 
				    		"        ,item.varchar2_5\r\n" + 
				    		"        ,item.varchar2_6\r\n" + 
				    		"        ,item.varchar2_7\r\n" + 
				    		"        ,item.varchar2_8\r\n" + 
				    		"        ,item.varchar2_9\r\n" + 
				    		"        ,item.varchar2_10\r\n" + 
				    		"        ,item.number_11\r\n" + 
				    		"        ,item.number_12\r\n" + 
				    		"        ,item.number_13\r\n" + 
				    		"        ,item.number_14\r\n" + 
				    		"        ,item.number_15\r\n" + 
				    		"        ,item.number_16\r\n" + 
				    		"        ,item.number_17\r\n" + 
				    		"        ,item.number_18\r\n" + 
				    		"        ,item.number_19\r\n" + 
				    		"        ,item.number_20\r\n" + 
				    		"        ,item.date_21\r\n" + 
				    		"        ,item.date_22\r\n" + 
				    		"   FROM ADMRMS.ITEM_MASTER_CFA_EXT item\r\n";

	@Override
	public List<Atributo> findById(Integer id) {
        StringBuilder sql = new StringBuilder(BASE_SQL);
        sql.append(" WHERE item.ITEM = :id");

        try {
        	return jdbcTemplate.query(
        			sql.toString()
        			, new MapSqlParameterSource()
        				.addValue("id", id)
        			, BeanPropertyRowMapper.newInstance(Atributo.class)
        			);

        } catch (EmptyResultDataAccessException e) {
        	return null;
        }
	}

    @Override
    public List<Long> listByAtributo(AtributoGrupo atributo) throws Exception {
        
        String sql = "SELECT item\n" + 
                     "  FROM ADMRMS.ITEM_MASTER_CFA_EXT\n" + 
                     " WHERE GROUP_ID = :groupId\n" + 
                     "   AND :storageColName IS NOT NULL\n";
        try {
            return jdbcTemplate.query(
                sql
                , new MapSqlParameterSource()
                    .addValue("groupId", atributo.getGroupId())
                    .addValue("storageColName", atributo.getStorageColName())
                    ,new RowMapper<Long>() {
                        @Override
                        public Long mapRow(ResultSet rs, int rowNum) throws SQLException {
                            return rs.getLong(1);
                        }
                    });
            
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

	@Override
	public AtributoResumo getItemByAttribId(Long item, FlexField atributo) throws Exception {

		StringBuilder query = new StringBuilder();
					  query.append(" SELECT imce.item as item \n");
					  query.append("    ,"+ atributo.getStorageColName() + " AS valor\n");
					  query.append("   FROM ADMRMS.ITEM_MASTER_CFA_EXT imce\n");
					  query.append("  WHERE imce.GROUP_ID = :groupId\n");
					  query.append("    AND imce.ITEM = :item");
		try {
			jdbcTemplate.getJdbcTemplate().setFetchSize(4000);
			return jdbcTemplate.queryForObject(
				query.toString()
				, new MapSqlParameterSource()
					.addValue("groupId", atributo.getGroupId())
					.addValue("item", item)
				, BeanPropertyRowMapper.newInstance(AtributoResumo.class)
				);
			
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}
}
