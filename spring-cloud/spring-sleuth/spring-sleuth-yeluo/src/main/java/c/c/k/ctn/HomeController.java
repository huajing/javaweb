package c.c.k.ctn;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;

/**
 * @Title c.c.k.ctn
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/7/23 chenck
 */
@RestController
public class HomeController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/yeluo-hi")
    public String sayHi(){
        return restTemplate.getForEntity("http://localhost:8081/info", String.class).getBody();
    }

    @GetMapping("/info")
    public String info(){
        return "yeluo-info";
    }

}