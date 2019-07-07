package c.c.k.ctn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class TestController {
    @RequestMapping(value = "/test")
    public String test(HttpServletRequest request, HttpServletResponse response){
        System.out.println("deal request");
        return "abc";
    }
}
