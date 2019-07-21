package c.c.k.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//注解文档：https://blog.csdn.net/javazejian/article/details/71860633
@Target(ElementType.TYPE)//
@Retention(RetentionPolicy.RUNTIME)//则用来表示该注解生存期是运行时
public @interface Test {
}
