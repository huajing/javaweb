package chen.ce.kuan.ctn;

import chen.ce.kuan.domain.User;
import chen.ce.kuan.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Title chen.ce.kuan.ctn
 * @Copyright: Copyright 2018
 * @Description: java <br/>
 * @Created on 2018/7/16 chenck
 */
@RestController
@RequestMapping("/")
public class MainController {
    @Resource
    private UserService userService;

    @RequestMapping("home")
    public String homePage(){
//        userService.save(new User("abc"));
        return "This  is home page---from spring boot";
    }
    @RequestMapping("login")
    public String indexPage(){
        return "login";
    }

}