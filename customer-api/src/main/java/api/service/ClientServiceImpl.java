package api.service;

import jdk.nashorn.internal.runtime.options.Options;
import api.feign.CustomerControllerApiClient;
import api.feign.CustomerControllerApiClientV2;
import api.model.CustomerRequestDto;
import api.model.CustomerResponseDto;
import feign.Request;
import org.springframework.http.ResponseEntity;

import java.net.URI;
import java.util.List;

public class ClientServiceImpl implements ClientService {

    CustomerControllerApiClientV2 apiClientV2;

    CustomerControllerApiClient apiClient;

    public ClientServiceImpl(CustomerControllerApiClient apiClient
            , CustomerControllerApiClientV2 apiClientV2) {
        this.apiClient = apiClient;
        this.apiClientV2 = apiClientV2;
    }

    @Override
    public CustomerResponseDto findCustomerById(String id) {
        URI uriBase = URI.create("http://localhost:8081");
        Request.Options options = new Request.Options(3000, 3000);
        ResponseEntity<CustomerResponseDto> response = apiClient.getCustustomer(uriBase, id);
        return response.getBody();
    }

    @Override
    public CustomerResponseDto findCustomerByIdV2(String id) {
        URI uriBase = URI.create("http://localhost:8081");
        Request.Options options = new Request.Options(3000, 3000);
        ResponseEntity<CustomerResponseDto> response = apiClientV2.getCustustomer(uriBase, id);
        return response.getBody();
    }

    @Override
    public List<CustomerResponseDto> findCustomers() {
        URI uriBase = URI.create("http://localhost:8081");
        ResponseEntity<List<CustomerResponseDto>> response =
                apiClientV2.getListCustomers(uriBase);
        return response.getBody();
    }

    @Override
    public CustomerResponseDto createCustomer(CustomerRequestDto customerRequestDto) {
        URI uriBase = URI.create("http://localhost:8081");
        Request.Options options = new Request.Options(2000,2000);
        ResponseEntity<CustomerResponseDto> response = apiClientV2.createCustomer(uriBase, customerRequestDto);
        return response.getBody();
    }
}
