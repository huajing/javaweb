package c.c.k;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Title c.c.k
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/6/22 chenck
 */
@SpringBootApplication
@MapperScan("c.c.k")//注解只会扫描包中的接口，不会扫描类
public class MybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class, args);

    }
}
