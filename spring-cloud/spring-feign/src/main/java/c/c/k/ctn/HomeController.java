package c.c.k.ctn;


import c.c.k.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title c.c.k.ctn
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/7/23 chenck
 */
@RestController
public class HomeController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String sayHi(){
        return helloService.sayHello();
    }


}