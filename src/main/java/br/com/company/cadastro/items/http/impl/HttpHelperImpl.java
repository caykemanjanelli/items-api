package br.com.company.cadastro.items.http.impl;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import br.com.company.cadastro.items.http.HttpHelper;

@Component
public class HttpHelperImpl implements HttpHelper {

	@Override
	public HttpResponse<String> doGet(String uri) throws Exception {
	    
	    var request = HttpRequest.newBuilder(new URI(uri))
	        .header("Accept", MediaType.APPLICATION_JSON_VALUE)
	        .GET()
	        .build();
	
	    var httpClient = HttpClient.newBuilder().build();
	
	    var response = httpClient.send(request, BodyHandlers.ofString(StandardCharsets.UTF_8));
	
	    return response;
	}

}
