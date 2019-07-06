package c.c.k.service;

import c.c.k.util.ProduceUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 * @Title c.c.k.service
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/7/6 chenck
 */
public class HelloService implements IHelloService{

    @Autowired
    RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "helloFallback")
    public String sayHell(String name) {
        return restTemplate.getForEntity(ProduceUtil.GET_SERVER() + "/hello", String.class).getBody();
    }

    public String helloFallback(){
        return "call error";
    }
}
