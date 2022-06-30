package br.com.company.cadastro.items.services;

import java.util.List;

import br.com.company.cadastro.items.exception.TechnicalException;
import br.com.company.cadastro.items.models.CodeDetail;
import br.com.company.cadastro.items.models.FlexField;

public interface FlexFieldsServ {

    /**
	 * Busca informações de descrição do grupo de atributo e os nomes do atributo por coluna
	 * @param id
	 * @return
	 */
	List<FlexField> findByGroupID(Long group_id) throws Exception;

	/**
	 * Busca descrição do item de lista presente no FlexField (Code_detail_Desc), passando o codigo da Lista e o codigo do item de lista
	 * @param codeType
	 * @param id
	 * @return
	 * @throws Exception
	 */
    List<CodeDetail> findByLovId(String codeType, String id) throws Exception;

	/**
	 * Busca dominio do atributo a partir do seu AttribId
	 * @param id
	 * @return
	 * @throws TechnicalException
	 */
	FlexField findById(Long id) throws TechnicalException;


	/**
	 * Busca descrição do item de lista presente no FlexField (Code_detail_Desc), passando o codigo da Lista e o codigo do item de lista
	 * @param codeType
	 * @param id
	 * @return
	 * @throws Exception
	 */
    CodeDetail findByCodeTypeAndItem(String codeType, String id) throws Exception;
}
