package c.c.k;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Title c.c.k
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/6/19 chenck
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ProduceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProduceApplication.class, args);
    }
}
