package c.c.k.enums;

import c.c.k.mybatis.MyMapperScannerRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/4/15 15:21
 * @Version 1.0
 **/

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(MyMapperScannerRegistrar.class)
public @interface MyMapperScan {
    String value();
}
