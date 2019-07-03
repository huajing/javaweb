package c.c.k.ctn;

import c.c.k.api.DemoService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Reference
    private DemoService demoService;

    @RequestMapping(value = "/abc", method = RequestMethod.GET)
    public String home(){
        return demoService.sayHello("");
    }

}
