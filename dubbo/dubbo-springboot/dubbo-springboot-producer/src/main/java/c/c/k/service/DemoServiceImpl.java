package c.c.k.service;

import chen.ce.kuan.api.DemoService;
import com.alibaba.dubbo.config.annotation.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
