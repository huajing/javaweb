package c.c.k.service.impl;

import c.c.k.mapper.UserMapper;
import c.c.k.mybatis.MyMapperProxyFactory;
import c.c.k.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.lang.reflect.Proxy;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/4/15 15:17
 * @Version 1.0
 **/

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private UserMapper userMapper;

    public UserServiceImpl(){
        userMapper = (UserMapper)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{UserMapper.class},
                MyMapperProxyFactory.getFactory().getMapper(UserMapper.class, jdbcTemplate)
                );
    }


    @Override
    public void test() {
        System.out.println(userMapper.list());
        System.out.println(".....");
    }
}
