package spring;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/4/10 18:25
 * @Version 1.0
 **/

public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println(method.getName() + " before");
        Object result = proxy.invokeSuper(object, args);
        System.out.println(method.getName() + " after");
        return result;
    }
}
