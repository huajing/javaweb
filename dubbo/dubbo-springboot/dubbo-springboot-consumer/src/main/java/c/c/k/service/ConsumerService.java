package c.c.k.service;

import c.c.k.api.IDemoService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @Title c.c.k.service
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/7/2 chenck
 */

@Service
public class ConsumerService implements IConsumerService {
    @Reference
    private IDemoService demoService;

    @Override
    public String haha() {
        return demoService.sayHello("consumer");
    }
}
