package c.c.k;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
@EnableConfigurationProperties(DiyProperties.class)
public class DiyAutoConfiguration {

    @Resource
    private DiyProperties diyProperties;

    @Bean
    @ConditionalOnMissingBean
    public DiyService init(){
        DiyService diyService = new DiyService();
        diyService.setName(diyProperties.getName());
        return diyService;
    }

}
