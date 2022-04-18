package api.feign;

import api.config.CustomerConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;


@Service
@FeignClient(name="${customerController.name:customerController}", url="${customerController.url:http://localhost:8089}", configuration = CustomerConfiguration.class)
public interface CustomerControllerApiClient extends CustomerControllerApi {
}
