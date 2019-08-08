package c.c.k.rest;

import c.c.k.entity.User;
import c.c.k.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import c.c.k.dao.UserDao;

/**
 * @Title c.c.k.rest
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/6/22 chenck
 */
@RestController
public class UserController {
    @Autowired
    private UserDao userDao;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getUser(){
        User user = userDao.getUser();
        System.out.println(user.getName());
        return user.toString();
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String insertUser(){
        User user = new User();
        user.setId(5L);
        user.setName("abc");
        userDao.saveUser(user);
        return "success";
    }

    @GetMapping("/find")
    public String getByName(String name){
        return userDao.findByName(name).toString();
    }

    @GetMapping("test_mp")
    public String getMp(){
        User user = new User();
        user.setName("-------------");
        userMapper.insert(user);
        return "ok";
    }
}
