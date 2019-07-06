package c.c.k.service;

import c.c.k.api.ITestService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @Title c.c.k.service
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/7/6 chenck
 */
@Service
public class TestService implements ITestService {
    @Override
    public void test() {
    }
}
