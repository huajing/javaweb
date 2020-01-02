package c.c.k;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Title c.c.k
 * @Copyright: Copyright 2020
 * @Description: java <br/>
 * @Created on 2020/1/2 chenck
 */
@SpringBootApplication
@MapperScan("c.c.k.dao") //也可以在每个mapper上加@Mapper
public class MybatisPlusApplication {
    MapperScan scann =null;
    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusApplication.class, args);
    }
}
