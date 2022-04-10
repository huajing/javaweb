package c.c.k.service.impl;

import anno.MyComponet;
import c.c.k.service.MyService;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/4/10 18:05
 * @Version 1.0
 **/
@MyComponet
public class MyServiceImpl implements MyService {
    @Override
    public void test() {
        System.out.println("test");
    }
}
