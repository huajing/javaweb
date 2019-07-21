package c.c.k;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "c.c.k.mapper")
public class ShardingCodeApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShardingCodeApplication.class, args);
    }
}
