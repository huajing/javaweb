package chen.ce.kuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by chenck on 2018/7/22.
 */
@EnableEurekaServer
@SpringBootApplication
public class IefopEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(IefopEurekaServerApplication.class, args);
    }
}
