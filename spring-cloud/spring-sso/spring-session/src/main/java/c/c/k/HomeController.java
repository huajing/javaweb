package c.c.k;

import org.apache.catalina.session.StandardSessionFacade;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class HomeController {

    @GetMapping("/login")
    public String set(HttpServletRequest request){
        request.getSession().setAttribute("sessId", "test save session");
        return "ok";
    }

    @GetMapping("/get")
    public String get(HttpServletRequest request){
        System.out.println(request.getSession());
        return (String) request.getSession().getAttribute("get sessId from session");
    }

}
