package c.c.k.processor;

import anno.MyComponet;
import c.c.k.service.MyService;
import spring.aware.BeansException;
import spring.aware.MyBeanPostProcessor;
import util.CglibUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName
 * @Description TODO
 * @Author chenck
 * @Date 2022/4/10 11:26
 * @Version 1.0
 **/

@MyComponet
public class MyBeanPostProcessorImpl implements MyBeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof MyService) {
            //jdk proxy
            return Proxy.newProxyInstance(this.getClass().getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    System.out.println(method.getName() + " before");
                    Object object = method.invoke(bean, args);
                    System.out.println(method.getName() + " end");
                    return object;
                }
            });
            //cglib proxy
            //return CglibUtil.getObject(bean.getClass());
        }
        return null;

    }
}
