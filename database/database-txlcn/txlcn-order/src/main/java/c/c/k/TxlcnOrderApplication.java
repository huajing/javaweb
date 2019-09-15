package c.c.k;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("c.c.k")
public class TxlcnOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(TxlcnOrderApplication.class, args);
    }
}
