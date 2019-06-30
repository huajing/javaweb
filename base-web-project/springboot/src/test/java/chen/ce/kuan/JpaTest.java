package chen.ce.kuan;

import chen.ce.kuan.domain.User;
import chen.ce.kuan.repository.UserRepository;
import chen.ce.kuan.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Title chen.ce.kuan
 * @Copyright: Copyright 2018
 * @Description: java <br/>
 * @Created on 2018/7/16 chenck
 * 测试jpa的相关功能
 * 1、配置数据库连接application.properties
 * 2、domain-repository-serivce-controller
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaTest {
    @Resource
    private UserRepository userRepository;
    @Resource
    private UserService userService;

    @Test
    public void test1(){
        userRepository.save(new User("huajing-Repository"));
        userService.save(new User("huajing-from-userService"));
    }

}
