package c.c.k.ctn;

import c.c.k.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Title c.c.k
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/6/19 chenck
 */
@RestController
public class ConsumeController {
    @Resource
    private HelloService helloService;

    @RequestMapping(value = "consume-hello", method = RequestMethod.GET)
    public String helloConsume(){
        return helloService.sayHell("consume-hello");
    }
}
