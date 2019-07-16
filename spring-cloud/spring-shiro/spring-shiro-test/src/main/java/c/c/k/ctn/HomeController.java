package c.c.k.ctn;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HomeController {
    @RequestMapping("/springboot")
    public String hello() {
        return "hello spring boot";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String baseLogin(HttpServletRequest request, String personId, String password)  {

        UsernamePasswordToken token = new UsernamePasswordToken("personId", "1234568");
        Subject currentUser = SecurityUtils.getSubject();
        try {
            currentUser.login(token);
        } catch (Exception uae) {
            uae.printStackTrace();
        }

        return "success";
    }
}
