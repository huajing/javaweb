package c.c.k;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class RibbonConfiguration {
    @Bean
    public IRule ribbonRule(){
        return new MyRandomRule();
    }


    public static class MyRandomRule extends RandomRule {
        public MyRandomRule(){
            super();
        }

        /**
         * 在此修改路径策略
         * @param key
         * @return
         */
        @Override
        public Server choose(Object key) {
            List<Server> allServers = this.getLoadBalancer().getAllServers();
            allServers.forEach(a->{
                System.out.println(a.getMetaInfo());
            });
            System.out.println("allServers:" + allServers);
            return super.choose(key);
        }
    }
}
