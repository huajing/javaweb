package c.c.k;

import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShiroApplication {
    private static final transient Logger logger = LoggerFactory.getLogger(ShiroApplication.class);
//    @Bean
//    public CustomRealm customRealm() {
//        logger.info("customRealm");
//        CustomRealm realm = new CustomRealm();
//        return realm;
//    }

    @Bean
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        logger.info("lifecycleBeanPostProcessor");
        return new LifecycleBeanPostProcessor();
    }

    @Bean
    public DefaultWebSecurityManager securityManager() {
        logger.info("securityManager");
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
//        securityManager.setRealm(customRealm());
        return securityManager;
    }

    @Bean
    public ShiroFilterChainDefinition shiroFilterChainDefinition(){
        logger.info("shiroFilterChainDefinition");

        DefaultShiroFilterChainDefinition chainDefinition = new DefaultShiroFilterChainDefinition();

        // logged in users with the 'admin' role
        chainDefinition.addPathDefinition("/admin/**", "authc, roles[admin]");

        // logged in users with the 'document:read' permission
        chainDefinition.addPathDefinition("/docs/**", "authc, perms[document:read]");

        // all other paths require a logged in user
        chainDefinition.addPathDefinition("/**", "authc");
        return chainDefinition;
    }

    public static void main(String[] args) {
        SpringApplication.run(ShiroApplication.class, args);
    }
}
