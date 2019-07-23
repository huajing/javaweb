package c.c.k.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(serviceId = "produce-service", fallback = HelloServiceFallback.class)
public interface HelloService {

    @GetMapping("/hello")
    public String sayHello();

}
