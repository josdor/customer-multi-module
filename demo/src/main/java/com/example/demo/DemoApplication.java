package com.example.demo;

import api.feign.CustomerControllerApiClient;
import api.feign.CustomerControllerApiClientV2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(clients = {CustomerControllerApiClient.class, CustomerControllerApiClientV2.class})
@SpringBootApplication

public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
