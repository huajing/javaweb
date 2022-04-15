package c.c.k;

import c.c.k.config.AppConfig;
import c.c.k.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/4/15 15:18
 * @Version 1.0
 **/

public class MyBatisApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService bean = context.getBean(UserService.class);
        bean.test();

        /*Method[] methods = UserMapper.class.getDeclaredMethods();
        for (Method method : methods) {
            MySelect mySelect = method.getDeclaredAnnotation(MySelect.class);
            System.out.println(mySelect.value());
        }*/
    }
}
