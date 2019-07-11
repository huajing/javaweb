package c.c.k.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService implements IHelloService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "fallback")
    public String sayHello() {
        return restTemplate.getForEntity("http://hell-service/helll", String.class).getBody();
    }

    public String fallback(){
        return "error";
    }
}
