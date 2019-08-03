package c.c.k;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRuleConfig {
    @Bean
    public IRule rule(){
        return new MyRandomRule();
    }

    public MyRuleConfig(){
        System.out.println("=================");
    }
}
