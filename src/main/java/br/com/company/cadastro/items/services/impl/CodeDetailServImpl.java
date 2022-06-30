package br.com.company.cadastro.items.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.company.cadastro.items.models.CodeDetail;
import br.com.company.cadastro.items.services.CodeDetailServ;
import br.com.company.cadastro.items.services.FlexFieldsServ;

@Service
public class CodeDetailServImpl implements CodeDetailServ {

    @Autowired
    private FlexFieldsServ flexFieldServ;

    @Override
    public String findByLovId(String codeType, String id) throws Exception {
        var listaItens = flexFieldServ.findByLovId(codeType, id);
        String retorno = null;
        for(CodeDetail code : listaItens){
            if(retorno != null){
                retorno = retorno + " - " + code.getCode_desc();
            }
            retorno = code.getCode_desc();
        }
       
        return retorno;
    }
    
}