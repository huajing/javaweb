package chen.ce.kuan.ctn;

import chen.ce.kuan.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Title chen.ce.kuan.ctn
 * @Copyright: Copyright 2018
 * @Description: java <br/>
 * @Created on 2018/7/16 chenck
 */
@Controller
@RequestMapping("/")
public class MainController {
    @Resource
    private IUserService userService;

    @RequestMapping("home")
    public @ResponseBody
    String homePage(){
        String test = userService.sayHello("test");
        return "This  is home page=hjj " + test;
    }
    @RequestMapping("login")
    public String indexPage(){
        return "login";
    }

}
