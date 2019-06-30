package c.c.k;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Title c.c.k
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/6/19 chenck
 */
@SpringBootApplication
@EnableEurekaServer
public class EnrukaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EnrukaServerApplication.class, args);
    }
}
