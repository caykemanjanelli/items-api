package br.com.company.cadastro.items.services;

import java.util.Collection;
import java.util.List;

import br.com.company.cadastro.items.models.Atributo;
import br.com.company.cadastro.items.models.AtributoResumo;
import br.com.company.cadastro.items.models.AtributoSKU;

public interface AtributoServ {

    /**
     * Busca atributos da sku na item_master_cfa_ext
     * @param id
     * @return
     * @throws Exception
     */
	List<Atributo> findById(Integer id);

    /**
     * Lista e organiza os atributos do sku de acordo com a tabela de atributo (item_master_cfa_ext) por grupo de Atributo
     * @param atributo
     * @return
     * @throws Exception
     */
	Collection<? extends AtributoSKU> findByIdList(Atributo atributo) throws Exception;

    /**
	 * Lista todos itens que possui atributo preenchido
	 * @param id Atrib_ID - Id do atributo
	 * @return
	 * @throws Exception
	 */
	List<Long> listByAtributo(Long id) throws Exception;

    /**
     * Busca informacoes de um item a partir de um atributo
     * @param item
     * @param atributo
     * @return
     */
    AtributoResumo getItemByAttribId(Long item, Long atributo) throws Exception;

}
