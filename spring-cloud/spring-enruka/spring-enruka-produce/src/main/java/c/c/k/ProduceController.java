package c.c.k;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * @Title c.c.k
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/6/19 chenck
 */
@RestController
public class ProduceController {
    private final Logger logger = Logger.getLogger(ProduceController.class.getName());

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/hello")
    public String sayHello() {

        System.out.println(discoveryClient.getServices());

//        discoveryClient.getServices()
        return "Produce-hello";
    }
}
