package c.c.k;

import c.c.k.config.AppConfig;
import c.c.k.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/4/13 8:27
 * @Version 1.0
 **/

public class MybatisApplication {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService bean = context.getBean(UserService.class);
        bean.print();
    }
}
