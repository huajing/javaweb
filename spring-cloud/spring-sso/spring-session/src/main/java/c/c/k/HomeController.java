package c.c.k;

import org.apache.catalina.session.StandardSessionFacade;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class HomeController {
    @Resource
    private RedisTemplate<String, String> redisTemplate;

    @GetMapping("/login")
    public String set(HttpServletRequest request){
        request.getSession().setAttribute("sessId", "test save session");
        String sessionId = request.getSession().getId();
        String userId = "100";
        redisTemplate.opsForValue().set(sessionId, userId);
        return "ok";
    }

    @GetMapping("/get")
    public String get(HttpServletRequest request){
        System.out.println(request.getSession());
        System.out.println(request.getSession().getAttribute("sessId"));
        return redisTemplate.opsForValue().get("a");
    }

}
