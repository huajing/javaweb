package c.c.k.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/4/13 10:16
 * @Version 1.0
 **/

public class MyInvovationHandler implements InvocationHandler {
    private MyInterface inferface;

    public MyInvovationHandler(MyInterface inferface){
        this.inferface = inferface;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method);
        System.out.println("invoke before");
        Object object = method.invoke(inferface, args);
        System.out.println("invoke after");
        return object;
    }
}
