package c.c.k;

import c.c.k.util.Constants;
import c.c.k.util.JwtUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {
    @GetMapping("/api/test")
    public String apiTest(HttpServletRequest request){
//        String token = request.getHeader("token");

        return "ok";
    }

    /**
     * 登录后返回生成的jwt值，存储在客户端，下次请求时带上信息
     * @return
     */
    @GetMapping("/login")
    public String login(){
        Map<String, Object> map = new HashMap<>();
        map.put("username", "abc");
        return JwtUtil.getToken(map, true, Constants.ENCRY_KEY, 60*60*24);
    }
}
