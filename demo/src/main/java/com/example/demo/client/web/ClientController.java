package com.example.demo.client.web;

import api.model.CustomerRequestDto;
import api.model.CustomerResponseDto;
import api.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClientController {

    ClientService service;

    public ClientController(ClientService service) {
        this.service = service;
    }

    @GetMapping("/clients/{id}")
    public CustomerResponseDto obtenirClientParId(@PathVariable(value = "id") String id) {
        return service.findCustomerById(id);
    }

    @GetMapping("/v2/clients/{id}")
    public CustomerResponseDto obtenirClientParIdV2(@PathVariable(value = "id") String id) {
        return service.findCustomerByIdV2(id);
    }

    @GetMapping("/clients")
    public List<CustomerResponseDto> obtenirClients() {
        return service.findCustomers();
    }

    @PostMapping("/clients")
    public CustomerResponseDto creerClients(@RequestBody(required = true) CustomerRequestDto requestDto) {
        return service.createCustomer(requestDto);
    }
}
