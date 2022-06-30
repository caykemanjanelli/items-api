package br.com.company.cadastro.items.http;

import java.net.http.HttpResponse;

public interface HttpHelper {

    /**
     * Efetua uma requisição http utilizando o método GET
     * - A uri deve conter os query params
     * @param uri
     * @return response
     * @throws Exception
     */
    HttpResponse<String> doGet(String uri) throws Exception;


}
