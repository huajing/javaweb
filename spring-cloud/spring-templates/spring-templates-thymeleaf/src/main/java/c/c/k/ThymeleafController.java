package c.c.k;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Title c.c.k
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/6/20 chenck
 */
@Controller
public class ThymeleafController {
    @RequestMapping(value = "hello_thymeleaf")
    public String page(Model model){
        model.addAttribute("appName", "sssssssssssssssssssss");
        return "hello";
    }
}
