package c.c.k.service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceFallback implements HelloService {
    @Override
    public String sayHello() {
        return "sdf";
    }
}
