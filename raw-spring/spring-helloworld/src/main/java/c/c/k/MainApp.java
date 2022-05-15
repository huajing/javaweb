package c.c.k;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;

public class MainApp {
    public static void main(String[] args) {
        /*ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        HelloWorld helloWorld = (HelloWorld)context.getBean("helloworld");
        System.out.println(helloWorld.getMessage());*/

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("c.c.k");
        Object a = applicationContext.getBean("a");
    }
}
