package c.c.k.ctn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title c.c.k.ctn
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/7/20 chenck
 */
@RestController
@RefreshScope
public class HomeController {
    @Value("${name}")
    String name;

    @GetMapping("/home")
    public String home(){
        return "home:" + name;
    }
}
