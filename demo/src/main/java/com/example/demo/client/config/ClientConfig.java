package com.example.demo.client.config;

import api.feign.CustomerControllerApiClient;
import api.feign.CustomerControllerApiClientV2;
import api.service.ClientService;
import api.service.ClientServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfig {
    @Bean
    ClientService getClientService(CustomerControllerApiClient apiClient
            , CustomerControllerApiClientV2 apiClientV2) {
        return new ClientServiceImpl(apiClient, apiClientV2);
    }
}
