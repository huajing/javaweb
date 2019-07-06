package c.c.k.dubbo;

import c.c.k.api.IDemoService;

public class DemoServiceImpl implements IDemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
