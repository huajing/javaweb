package c.c.k.ctn;

import c.c.k.api.ITestService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Title c.c.k.ctn
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/7/6 chenck
 */

@Controller
public class HomeController {

    @Reference
    private ITestService testService;

    @RequestMapping(value = "/abc")
    public String home(){

        testService.test();

        return "";
    }
}
