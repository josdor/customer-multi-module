package api.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;

@Component
public class CustomerFeignInterceptorV2 implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate requestTemplate) {
        System.out.println("On est ici");
    }
}
