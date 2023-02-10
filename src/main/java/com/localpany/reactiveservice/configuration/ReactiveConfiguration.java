package com.localpany.reactiveservice.configuration;

import com.localpany.reactiveservice.properties.WsdlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;


@Configuration
public class ReactiveConfiguration {


    @Autowired
    private WsdlProperties wsdlProperties;




    @Bean
    public WebClient webCountry(){
        return WebClient.builder().baseUrl(wsdlProperties.getLocation())
                .defaultHeader(HttpHeaders.ACCEPT, MediaType.TEXT_XML_VALUE)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.TEXT_XML_VALUE)
                .build();
    }
}
