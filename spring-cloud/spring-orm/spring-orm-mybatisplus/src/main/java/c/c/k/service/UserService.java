package c.c.k.service;

import c.c.k.dao.UserMapper;
import c.c.k.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Title c.c.k.service
 * @Copyright: Copyright 2020
 * @Description: java <br/>
 * @Created on 2020/1/2 chenck
 */
@Service
public class UserService implements IUservice{
    @Autowired
    private UserMapper userMapper;

    @Override
    public void add() {
        User user = new User();
        user.setName("haha");
        userMapper.insert(user);
    }
}
