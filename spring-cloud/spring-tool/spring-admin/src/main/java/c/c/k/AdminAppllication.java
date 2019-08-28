package c.c.k;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Title c.c.k
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/7/28 chenck
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
public class AdminAppllication {
    public static void main(String[] args) {
        SpringApplication.run(AdminAppllication.class, args);
    }
}
