package br.com.company.cadastro.items.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.company.cadastro.items.exception.TechnicalException;
import br.com.company.cadastro.items.http.HttpHelper;
import br.com.company.cadastro.items.models.CodeDetail;
import br.com.company.cadastro.items.models.FlexField;
import br.com.company.cadastro.items.services.FlexFieldsServ;

@Service
public class FlexFieldsServImpl implements FlexFieldsServ {
	
    @Value("${app.params.flexfieldUri}")
    private String uri;

    @Autowired
    private HttpHelper helper;

	@Override
	public List<FlexField> findByGroupID(Long id) throws Exception {
        try {
            var response = helper.doGet(uri + "/groupid/" + id.toString());

            if (response.statusCode() == HttpStatus.OK.value()) {

                var mapper = new ObjectMapper();
                var groupId = mapper.readValue(response.body(), new TypeReference<List<FlexField>>() {
                });
                return groupId;

            } else if (response.statusCode() == HttpStatus.NOT_FOUND.value()) {
                return null;
            } else {
                throw new Exception("Ocorreu um erro ao acessar o serviço de FlexFields: " + response.body());
            }

        } catch (Exception e) {
            throw new TechnicalException(e);
        }
	}

    @Override
    public List<CodeDetail> findByLovId(String codeType, String id) throws Exception {
        try {
            
            var response = helper.doGet(uri + "/lov/" + codeType + "/code/" + id);

            if (response.statusCode() == HttpStatus.OK.value()) {

                var mapper = new ObjectMapper();
                var lista = mapper.readValue(response.body(), new TypeReference<List<CodeDetail>>() {
                });
                return lista;

            } else if (response.statusCode() == HttpStatus.NOT_FOUND.value()) {
                return null;
            } else {
                throw new Exception("Ocorreu um erro ao acessar o serviço de FlexFields: " + response.body());
            }

        } catch (Exception e) {
            throw new TechnicalException(e);
        }
    }

    @Override
    public FlexField findById(Long id) throws TechnicalException {
        try {
            var response = helper.doGet(uri + "/attribId/" + id.toString());

            if (response.statusCode() == HttpStatus.OK.value()) {

                var mapper = new ObjectMapper();
                var retorno = mapper.readValue(response.body(), new TypeReference<FlexField>() {
                });
                return retorno;

            } else if (response.statusCode() == HttpStatus.NOT_FOUND.value()) {
                return null;
            } else {
                throw new Exception("Ocorreu um erro ao acessar o serviço de FlexFields: " + response.body());
            }

        } catch (Exception e) {
            throw new TechnicalException(e);
        }
    }

    @Override
    public CodeDetail findByCodeTypeAndItem(String codeType, String id) throws Exception {
        try {
            
            var response = helper.doGet(uri + "/lov/" + codeType + "/code/" + id);

            if (response.statusCode() == HttpStatus.OK.value()) {

                var mapper = new ObjectMapper();
                var lista = mapper.readValue(response.body(), new TypeReference<CodeDetail>() {
                });
                return lista;

            } else if (response.statusCode() == HttpStatus.NOT_FOUND.value()) {
                return null;
            } else {
                throw new Exception("Ocorreu um erro ao acessar o serviço de FlexFields: " + response.body());
            }

        } catch (Exception e) {
            throw new TechnicalException(e);
        }
    }

}
