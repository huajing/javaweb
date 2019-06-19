package chen.ce.kuan.enruka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Title chen.ce.kuan.enruka.server
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/6/19 chenck
 */
@EnableEurekaServer
@SpringBootApplication
public class EnrukaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EnrukaServerApplication.class, args);
    }
}
