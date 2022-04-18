package api.service;

import api.model.CustomerRequestDto;
import api.model.CustomerResponseDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ClientService {
    CustomerResponseDto findCustomerById(String id);

    CustomerResponseDto findCustomerByIdV2(String id);

    List<CustomerResponseDto> findCustomers();

    CustomerResponseDto createCustomer(CustomerRequestDto customerRequestDto);
}
