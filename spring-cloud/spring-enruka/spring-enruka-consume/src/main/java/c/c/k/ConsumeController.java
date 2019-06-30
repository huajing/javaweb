package c.c.k;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Title c.c.k
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/6/19 chenck
 */
@RestController
public class ConsumeController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "consume-hello", method = RequestMethod.GET)
    public String helloConsume(){
        return restTemplate.getForEntity("http://produce-service:4441/hello", String.class).getBody();
    }
}
