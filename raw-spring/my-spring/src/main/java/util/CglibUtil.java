package util;

import c.c.k.service.impl.MyServiceImpl;
import net.sf.cglib.proxy.Enhancer;
import spring.MyMethodInterceptor;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/4/10 18:32
 * @Version 1.0
 **/

public class CglibUtil {
    public static Object getObject(Class clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(new MyMethodInterceptor());
        return enhancer.create();
    }
}
