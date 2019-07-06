package c.c.k.service;



import c.c.k.api.IDemoService;
import com.alibaba.dubbo.config.annotation.Service;

@Service
public class DemoServiceImpl implements IDemoService {
    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
