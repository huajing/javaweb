package c.c.k.enums;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/4/15 15:36
 * @Version 1.0
 **/

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MySelect {
    String value();
}
