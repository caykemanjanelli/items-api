package br.com.company.cadastro.items.services.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import br.com.company.cadastro.items.exception.TechnicalException;
import br.com.company.cadastro.items.models.Atributo;
import br.com.company.cadastro.items.models.AtributoGrupo;
import br.com.company.cadastro.items.models.AtributoResumo;
import br.com.company.cadastro.items.models.AtributoSKU;
import br.com.company.cadastro.items.models.FlexField;
import br.com.company.cadastro.items.repository.AtributoRepo;
import br.com.company.cadastro.items.services.AtributoServ;
import br.com.company.cadastro.items.services.CodeDetailServ;
import br.com.company.cadastro.items.services.FlexFieldsServ;

@Service
public class AtributoServImpl implements AtributoServ {

        public static final Logger LOG = LoggerFactory.getLogger(AtributoServImpl.class);
    @Autowired
    private AtributoRepo repo;
	
    @Autowired
    private FlexFieldsServ flexFieldServ;

    @Autowired
    private CodeDetailServ codeDetailServ;


	@Override
	public List<Atributo> findById(Integer id) {
        return repo.findById(id);
	}

	@Override
	public Collection<? extends AtributoSKU> findByIdList(Atributo atributo) throws Exception {
        var atributosLoja = new ArrayList<AtributoSKU>();

        var groupIds = flexFieldServ.findByGroupID(atributo.getGroup_id());
        for (FlexField val : groupIds) {
                if (val.getStorageColName() != null) {
                        if (atributo.getVarchar2_1() != null
                                        && val.getStorageColName().toUpperCase().equals("VARCHAR2_1")) {
                                if (val.getCodeType() != null) {
                                        var codeDetail = codeDetailServ.findByLovId(val.getCodeType(),atributo.getVarchar2_1());
                                        atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                                .atributo(val.getAttribColName())
                                                                .idItemLista(atributo.getVarchar2_1())
                                                                .valorTexto(codeDetail == null ? atributo.getVarchar2_1() : codeDetail )
                                                        );
                                } else {
                                        atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                        .atributo(val.getAttribColName())
                                                        .idItemLista(atributo.getVarchar2_1())
                                                        .valorTexto(atributo.getVarchar2_1()));
                                }
                        } else if (atributo.getVarchar2_2() != null
                                        && val.getStorageColName().equals("VARCHAR2_2")) {
                                if (val.getCodeType() != null) {
                                        var codeDetail = codeDetailServ.findByLovId(val.getCodeType(),atributo.getVarchar2_2());
                                        atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                                .atributo(val.getAttribColName())
                                                                .idItemLista(atributo.getVarchar2_2())
                                                                .valorTexto(codeDetail == null ? atributo.getVarchar2_2() : codeDetail)
                                                        );
                                } else {
                                        atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                        .atributo(val.getAttribColName())
                                                        .valorTexto(atributo.getVarchar2_2()));
                                }
                        } else if (atributo.getVarchar2_3() != null
                                        && val.getStorageColName().equals("VARCHAR2_3")) {
                                if (val.getCodeType() != null) {
                                        var codeDetail = codeDetailServ.findByLovId(val.getCodeType(),atributo.getVarchar2_3());
                                        atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                                .atributo(val.getAttribColName())
                                                                .idItemLista(atributo.getVarchar2_3())
                                                                .valorTexto(codeDetail == null ? atributo.getVarchar2_3() : codeDetail)
                                                        );
                                } else {
                                        atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                        .atributo(val.getAttribColName())
                                                        .valorTexto(atributo.getVarchar2_3()));
                                }
                        } else if (atributo.getVarchar2_4() != null
                                        && val.getStorageColName().equals("VARCHAR2_4")) {
                                if (val.getCodeType() != null) {
                                        var codeDetail = codeDetailServ.findByLovId(val.getCodeType(),atributo.getVarchar2_4());
                                        atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                                .atributo(val.getAttribColName())
                                                                .idItemLista(atributo.getVarchar2_4())
                                                                .valorTexto(codeDetail == null ? atributo.getVarchar2_4() : codeDetail)
                                                        );
                                } else {
                                        atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                        .atributo(val.getAttribColName())
                                                        .valorTexto(atributo.getVarchar2_4()));
                                }
                        } else if (atributo.getVarchar2_5() != null
                                        && val.getStorageColName().equals("VARCHAR2_5")) {
                                if (val.getCodeType() != null) {
                                        var codeDetail = codeDetailServ.findByLovId(val.getCodeType(),atributo.getVarchar2_5());
                                        atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                                .atributo(val.getAttribColName())
                                                                .idItemLista(atributo.getVarchar2_5())
                                                                .valorTexto(codeDetail == null ? atributo.getVarchar2_5() : codeDetail)
                                                        );
                                } else {
                                        atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                        .atributo(val.getAttribColName())
                                                        .valorTexto(atributo.getVarchar2_5()));
                                }
                        } else if (atributo.getVarchar2_6() != null
                                        && val.getStorageColName().equals("VARCHAR2_6")) {
                                if (val.getCodeType() != null) {
                                        var codeDetail = codeDetailServ.findByLovId(val.getCodeType(),atributo.getVarchar2_6());
                                        atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                                .atributo(val.getAttribColName())
                                                                .idItemLista(atributo.getVarchar2_6())
                                                                .valorTexto(codeDetail == null ? atributo.getVarchar2_6() : codeDetail)
                                                        );
                                } else {
                                        atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                        .atributo(val.getAttribColName())
                                                        .valorTexto(atributo.getVarchar2_6()));
                                }
                        } else if (atributo.getVarchar2_7() != null
                                        && val.getStorageColName().equals("VARCHAR2_7")) {
                                if (val.getCodeType() != null) {
                                        var codeDetail = codeDetailServ.findByLovId(val.getCodeType(),atributo.getVarchar2_7());
                                        atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                                .atributo(val.getAttribColName())
                                                                .idItemLista(atributo.getVarchar2_7())
                                                                .valorTexto(codeDetail == null ? atributo.getVarchar2_7() : codeDetail)
                                                        );
                                } else {
                                        atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                        .atributo(val.getAttribColName())
                                                        .valorTexto(atributo.getVarchar2_7()));
                                }
                        } else if (atributo.getVarchar2_8() != null
                                        && val.getStorageColName().equals("VARCHAR2_8")) {
                                if (val.getCodeType() != null) {
                                        var codeDetail = codeDetailServ.findByLovId(val.getCodeType(),atributo.getVarchar2_8());
                                        atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                                .atributo(val.getAttribColName())
                                                                .idItemLista(atributo.getVarchar2_8())
                                                                .valorTexto(codeDetail == null ? atributo.getVarchar2_8() : codeDetail)
                                                        );
                                } else {
                                        atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                        .atributo(val.getAttribColName())
                                                        .valorTexto(atributo.getVarchar2_8()));
                                }
                        } else if (atributo.getVarchar2_9() != null
                                        && val.getStorageColName().equals("VARCHAR2_9")) {
                                if (val.getCodeType() != null) {
                                        var codeDetail = codeDetailServ.findByLovId(val.getCodeType(),atributo.getVarchar2_9());
                                        atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                                .atributo(val.getAttribColName())
                                                                .idItemLista(atributo.getVarchar2_9())
                                                                .valorTexto(codeDetail == null ? atributo.getVarchar2_9() : codeDetail)
                                                        );
                                } else {
                                        atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                        .atributo(val.getAttribColName())
                                                        .valorTexto(atributo.getVarchar2_9()));
                                }
                        } else if (atributo.getVarchar2_10() != null
                                        && val.getStorageColName().equals("VARCHAR2_10")) {
                                if (val.getCodeType() != null) {
                                        var codeDetail = codeDetailServ.findByLovId(val.getCodeType(),atributo.getVarchar2_10());
                                        atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                                .atributo(val.getAttribColName())
                                                                .idItemLista(atributo.getVarchar2_10())
                                                                .valorTexto(codeDetail == null ? atributo.getVarchar2_10() : codeDetail)
                                                        );
                                } else {
                                        atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                        .atributo(val.getAttribColName())
                                                        .valorTexto(atributo.getVarchar2_10()));
                                }
                        } else if (atributo.getNumber_11() != null
                                        && val.getStorageColName().equals("NUMBER_11")) {
                                atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                .atributo(val.getAttribColName())
                                                .valorNumber(atributo.getNumber_11()));

                        } else if (atributo.getNumber_12() != null
                                        && val.getStorageColName().equals("NUMBER_12")) {
                                atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                .atributo(val.getAttribColName())
                                                .valorNumber(atributo.getNumber_12()));

                        } else if (atributo.getNumber_13() != null
                                        && val.getStorageColName().equals("NUMBER_13")) {
                                atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                .atributo(val.getAttribColName())
                                                .valorNumber(atributo.getNumber_13()));

                        } else if (atributo.getNumber_14() != null
                                        && val.getStorageColName().equals("NUMBER_14")) {
                                atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                .atributo(val.getAttribColName())
                                                .valorNumber(atributo.getNumber_14()));

                        } else if (atributo.getNumber_15() != null
                                        && val.getStorageColName().equals("NUMBER_15")) {
                                atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                .atributo(val.getAttribColName())
                                                .valorNumber(atributo.getNumber_15()));

                        } else if (atributo.getNumber_16() != null
                                        && val.getStorageColName().equals("NUMBER_16")) {
                                atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                .atributo(val.getAttribColName())
                                                .valorNumber(atributo.getNumber_16()));

                        } else if (atributo.getNumber_17() != null
                                        && val.getStorageColName().equals("NUMBER_17")) {
                                atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                .atributo(val.getAttribColName())
                                                .valorNumber(atributo.getNumber_17()));

                        } else if (atributo.getNumber_18() != null
                                        && val.getStorageColName().equals("NUMBER_18")) {
                                atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                .atributo(val.getAttribColName())
                                                .valorNumber(atributo.getNumber_18()));

                        } else if (atributo.getNumber_19() != null
                                        && val.getStorageColName().equals("NUMBER_19")) {
                                atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                .atributo(val.getAttribColName())
                                                .valorNumber(atributo.getNumber_19()));

                        } else if (atributo.getNumber_20() != null
                                        && val.getStorageColName().equals("NUMBER_20")) {
                                atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                .atributo(val.getAttribColName())
                                                .valorNumber(atributo.getNumber_20()));

                        } else if (atributo.getDate_21() != null && val.getStorageColName().equals("DATE_21")) {
                                atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                .atributo(val.getAttribColName())
                                                .valorData(atributo.getDate_21()));

                        } else if (atributo.getDate_22() != null && val.getStorageColName().equals("DATE_22")) {
                                atributosLoja.add(new AtributoSKU().atributoId(val.getAttribId())
                                                .atributo(val.getAttribColName())
                                                .valorData(atributo.getDate_22()));

                        }

                }

        }

        return atributosLoja;
	}
	
    @Override
    @Cacheable(value = "listByAtributo", key = "#id", unless="#result == null" )
    public List<Long> listByAtributo(Long id) throws Exception {

            var flexField = flexFieldServ.findById(id);
            return repo.listByAtributo(new AtributoGrupo()
                                                    .groupId(flexField.getGroupId())
                                                    .storageColName(flexField.getStorageColName())
                                                    );
    }

@Override
public AtributoResumo getItemByAttribId(Long item, Long atributo) throws Exception {
        
        try {
                var flexField = flexFieldServ.findById(atributo);
                
                var retorno = repo.getItemByAttribId(item,flexField);
                if(retorno == null){
                        return null;
                        
                }
                LOG.info("Parser objetos");
                retorno.atributoId(flexField.getAttribId());
                retorno.atributo(flexField.getAttribColName());
                retorno.groupId(flexField.getGroupId());
                retorno.tipo(flexField.getUiWidget());
                retorno.dataType(flexField.getDataType());
                //valida se é um atributo com valor de Lista
                if(flexField.getCodeType() != null){
                        retorno.nomeLista(flexField.getCodeType());
                        //Buscar valor da lista em um servico externo (flexField)
                        var codeDesc = flexFieldServ.findByCodeTypeAndItem(flexField.getCodeType(), retorno.getValor());
                        if(codeDesc != null){
                                retorno.idItemLista(retorno.getValor());
                                retorno.valor(codeDesc.getCode_desc());
                        }
                                
                }


        return retorno;
        } catch (Exception e) {
                throw new TechnicalException("error_getItemByAttribId: " + e.getMessage());
        }
        
}

}
