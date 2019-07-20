package c.c.k;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Title c.c.k
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/7/20 chenck
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ConfigClientServer {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientServer.class, args);
    }
}
