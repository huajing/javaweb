package c.c.k.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Title c.c.k.annotation
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/7/23 chenck
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyRole {
    String value();
}
