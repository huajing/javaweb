package spring;

import spring.aware.MyBeanPostProcessor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MySpringContext {
    protected final Map<String, Object> beanMap = new ConcurrentHashMap<>(16);
    protected final Map<String, MyBeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>(16);
    protected final List<MyBeanPostProcessor> beanPostProcessorList = new ArrayList<>();

    public MySpringContext(){

    }

    protected void initBeanDefinition(){

    }

    protected void initBeans() throws IllegalAccessException, InstantiationException{

    }

    public Object getBean(Class clazz){
        return beanMap.get(clazz.getName());
    }
}
