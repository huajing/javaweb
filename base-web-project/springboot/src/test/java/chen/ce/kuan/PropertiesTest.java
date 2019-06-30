package chen.ce.kuan;

import chen.ce.kuan.service.PropertiesService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Title chen.ce.kuan
 * @Copyright: Copyright 2018
 * @Description: java <br/>
 * @Created on 2018/7/16 chenck
 * 读取配置文件里的数据
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTest {
    @Resource
    public PropertiesService propertiesService;

    @Test
    public void test1(){
        System.out.println(propertiesService.getUrl());
    }
}
