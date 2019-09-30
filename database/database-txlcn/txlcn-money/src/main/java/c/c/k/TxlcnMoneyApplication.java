package c.c.k;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("c.c.k")
//@EnableDistributedTransaction
@EnableDiscoveryClient
public class TxlcnMoneyApplication {
    public static void main(String[] args) {
        SpringApplication.run(TxlcnMoneyApplication.class, args);
    }
}
