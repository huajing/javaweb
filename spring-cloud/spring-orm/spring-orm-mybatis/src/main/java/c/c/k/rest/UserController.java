package c.c.k.rest;

import c.c.k.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getUser(){
        User user = userDao.getUser();
        System.out.println(user.getName());
        return user.toString();
    }
}
