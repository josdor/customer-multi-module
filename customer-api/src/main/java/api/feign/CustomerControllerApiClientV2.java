package api.feign;

import api.config.CustomerConfigurationV2;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;


@Service
@FeignClient(name="${customerControllerV2.name:customerControllerV2}", url="${customerControllerV2.url:http://localhost:8089}", configuration = CustomerConfigurationV2.class)
public interface CustomerControllerApiClientV2 extends CustomerControllerApi {
}
