package c.c.k;

import net.spy.memcached.MemcachedClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HomeController {
    @Autowired
    public MemcachedClient memCachedClient;

    @GetMapping("/set")
    public String set(){
        memCachedClient.set("a", 100, "b");
        return "ok";
    }

    @GetMapping("/get")
    public String get(){
        return (String) memCachedClient.get("a");
    }

}
