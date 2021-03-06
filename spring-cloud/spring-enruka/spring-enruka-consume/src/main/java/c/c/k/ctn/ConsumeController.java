package c.c.k.ctn;

import c.c.k.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title c.c.k
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/6/19 chenck
 */
@RestController
public class ConsumeController {
    @Autowired
    private IHelloService helloService;


    @RequestMapping(value = "consume-hello", method = RequestMethod.GET)
    public String helloConsume(){
        return helloService.sayHell("consume-hello");
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(){
        return "home";
    }
}
