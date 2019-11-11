package c.c.k;

import com.netflix.client.config.DefaultClientConfigImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.ribbon.RibbonAutoConfiguration;

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
