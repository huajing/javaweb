package c.c.k.ctn;

import c.c.k.api.IDemoService;
import c.c.k.api.ITestService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HomeController {

//    @Resource
//    private IConsumerService consumerService;

    @Reference
    private IDemoService demoService;

    @RequestMapping(value = "/abc", method = RequestMethod.GET)
    public String home(){
        return demoService.sayHello("abc");
//        return consumerService.haha();
    }

}
