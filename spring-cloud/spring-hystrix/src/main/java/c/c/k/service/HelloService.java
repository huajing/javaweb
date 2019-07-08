package c.c.k.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

public class HelloService implements IHelloService {
    @Override
    @HystrixCommand(fallbackMethod = "fallback")
    public void sayHello() {

    }

    public String helloFallback(){
        return "error";
    }
}
