package c.c.k.ctn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class HomeController {
    @Autowired
    public RestTemplate restTemplate;

    @GetMapping("/test")
    public String test(){
        return restTemplate.getForEntity("http://PRODUCE-SERVICE/hello", String.class).getBody();
    }
}
