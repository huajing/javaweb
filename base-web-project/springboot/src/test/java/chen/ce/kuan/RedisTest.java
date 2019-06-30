package chen.ce.kuan;

import chen.ce.kuan.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Title chen.ce.kuan
 * @Copyright: Copyright 2018
 * @Description: java <br/>
 * @Created on 2018/7/16 chenck
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    public void test1(){
        redisTemplate.opsForValue().set("key", "value");
        System.out.println(redisTemplate.opsForValue().get("key"));
    }
}
