package br.com.company.cadastro.items.services;

public interface CodeDetailServ {

    /**
	 * Busca descrição do item de lista presente no FlexField (Code_detail_Desc), passando o codigo da Lista e o codigo do item de lista
     * Ordena para retornar uma String
	 * @param codeType
	 * @param id
	 * @return
	 * @throws Exception
	 */
    String findByLovId(String codeType, String id) throws Exception;

}
