package spring;

import anno.MyComponet;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MySpringContext {
    protected Map<String, Object> beanMap = new ConcurrentHashMap<>();
    public MySpringContext(){

    }

    protected void initBeans(){

    }
    public Object getBean(String beanName){
        return null;
    }

    public Object getBean(Class clazz){
        return beanMap.get(clazz.getSimpleName());
    }
}
