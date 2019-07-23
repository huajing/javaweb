package c.c.k.ctn;

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
    @GetMapping("/home")
    public String home(){
        return "succ";
    }
}
