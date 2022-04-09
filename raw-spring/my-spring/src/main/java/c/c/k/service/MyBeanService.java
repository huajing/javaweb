package c.c.k.service;

import anno.MyComponet;
import anno.MyResource;
import c.c.k.MyBean;

@MyComponet
public class MyBeanService {
    @MyResource
    private MyBean myBean;

    public void print(){
        System.out.println("MyBeanService print");
//        myBean.print();
    }
}
