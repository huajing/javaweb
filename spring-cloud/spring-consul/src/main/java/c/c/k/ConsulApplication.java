package c.c.k;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Title c.c.k
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/7/23 chenck
 */

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulApplication.class, args);
    }
}
