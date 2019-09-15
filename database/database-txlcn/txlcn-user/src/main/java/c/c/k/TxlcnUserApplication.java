package c.c.k;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("c.c.k")
public class TxlcnUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(TxlcnUserApplication.class, args);
    }
}
