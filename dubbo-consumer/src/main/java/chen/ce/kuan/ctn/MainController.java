package chen.ce.kuan.ctn;

import org.springframework.stereotype.Controller;
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
//    @Resource
//    private IOrderService orderService;

    @RequestMapping("home")
    public @ResponseBody
    String homePage(){
        return "This  is home page=hjj ";// + orderService.testOrder();
    }
    @RequestMapping("login")
    public String indexPage(){
        return "login";
    }

}
