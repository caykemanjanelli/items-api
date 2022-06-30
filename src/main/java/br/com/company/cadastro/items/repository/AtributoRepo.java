package br.com.company.cadastro.items.repository;

import java.util.List;

import br.com.company.cadastro.items.models.Atributo;
import br.com.company.cadastro.items.models.AtributoGrupo;
import br.com.company.cadastro.items.models.AtributoResumo;
import br.com.company.cadastro.items.models.FlexField;

public interface AtributoRepo {

    /**
     * Busca atributos da sku na item_master_cfa_ext
     * @param id
     * @return
     * @throws Exception
     */
	List<Atributo> findById(Integer id);

    /**
     * Lista todos itens que possui atributo preenchido
     * @param atributo objeto com group_id e coluna que corresponde o atributo
     * @return
     * @throws Exception
     */
    List<Long> listByAtributo(AtributoGrupo atributo) throws Exception;

    /**
     * Busca informacoes do atributo informado para o item informado
     * @param item
     * @param flexField
     * @return
     * @throws Exception
     */
    AtributoResumo getItemByAttribId(Long item, FlexField flexField) throws Exception;

}
