package c.c.k;

import net.spy.memcached.MemcachedClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.net.InetSocketAddress;

@SpringBootApplication
public class MemcachedApplication {

    @Bean
    public MemcachedClient memCachedClient(){
        try {
            return new MemcachedClient(new InetSocketAddress(11211));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        SpringApplication.run(MemcachedApplication.class, args);
    }
}
