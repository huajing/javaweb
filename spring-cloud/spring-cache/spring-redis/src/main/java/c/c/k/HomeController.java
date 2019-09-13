package c.c.k;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HomeController {
    @Resource
    private RedisTemplate<String, String> redisTemplate;

    @GetMapping("/set")
    public String set(){
        redisTemplate.opsForValue().set("a", "b");
        return "ok";
    }

    @GetMapping("/get")
    public String get(){

        return redisTemplate.opsForValue().get("a");
    }

}
