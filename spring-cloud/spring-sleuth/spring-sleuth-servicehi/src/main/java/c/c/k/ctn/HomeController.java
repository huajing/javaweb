package c.c.k.ctn;

import c.c.k.ServicehiApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

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

    @GetMapping("/servicehi")
    public String sayHi(){
        return restTemplate.getForEntity("http://localhost:8082/info", String.class).getBody();
    }

    @GetMapping("/info")
    public String info(){
        return "servicehi-info";
    }
}
