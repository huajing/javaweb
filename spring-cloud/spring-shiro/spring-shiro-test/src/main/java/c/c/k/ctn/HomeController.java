package c.c.k.ctn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class HomeController {
    public String hello() {
        return "hello spring boot";
    }
}
