package c.c.k;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Title c.c.k
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/6/19 chenck
 */
//开启断路器
//@EnableCircuitBreaker
//@EnableDiscoveryClient
//@SpringBootApplication

//功能同上面3个注解
@SpringCloudApplication
public class ConsumeApplication {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumeApplication.class, args);
    }
}
