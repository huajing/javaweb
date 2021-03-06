package c.c.k.ctn;

import c.c.k.service.HelloService;
import c.c.k.service.IHelloService;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Title c.c.k
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/6/19 chenck
 */
@RestController
public class HomeController {
    @Resource
    private IHelloService helloService;

    @GetMapping(value = "consume-hello")
    public String helloConsume(){
        return helloService.sayHello();
    }

    @GetMapping(value = "/test")
    public String test(){
        MyHystrixCommand myHystrixCommand = new MyHystrixCommand();
        myHystrixCommand.execute();//同步
        myHystrixCommand.queue();//异步

        return "test";
    }
}
