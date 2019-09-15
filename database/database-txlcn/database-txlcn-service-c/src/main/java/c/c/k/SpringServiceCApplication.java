package c.c.k;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDistributedTransaction
@MapperScan("c.c.k")
public class SpringServiceCApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringServiceCApplication.class, args);
    }
}
