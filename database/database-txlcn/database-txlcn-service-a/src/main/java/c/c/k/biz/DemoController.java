package c.c.k.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
//    @Autowired
//    UserMapper userMapper;


    @RequestMapping("/txlcn")
    public String execute(
            @RequestParam("value") String value,
            @RequestParam(value = "ex", required = false) String exFlag) {
        return "";
//        return demoService.execute(value, exFlag);
    }

    public String getUser(){
//        userMapper.insert(new User("abc"));
        return "";
    }
}