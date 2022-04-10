package c.c.k.controller;

import anno.MyAutoware;
import anno.MyComponet;
import anno.MyScope;
import c.c.k.service.MyBeanService;

@MyComponet
public class MyController {

    @MyAutoware
    private MyBeanService myBeanService;

    public void print(){
        System.out.println("test controller" + myBeanService);
    }
}
