package c.c.k.service;

import anno.MyComponet;
import anno.MyAutoware;
import c.c.k.MyBean;
import c.c.k.controller.MyController;
import spring.aware.MyBeanNameAware;

@MyComponet
public class MyBeanService implements MyBeanNameAware {
    @MyAutoware
    private MyController myController;

    public void print(){
        System.out.println("MyBeanService print" + myController);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("MyBeanNameAware invoke " + name);
    }
}
