package br.com.company.cadastro.items.configs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class AppConfigure {
    
    public static final Logger LOG  = LoggerFactory.getLogger(AppConfigure.class);

    @Value("${spring.datasource.url}")
    private String url;

    @Bean
    public String showConfig(){

        LOG.info("CAMINHO DE CONEXAO: " + url);
        return url;
    }


}