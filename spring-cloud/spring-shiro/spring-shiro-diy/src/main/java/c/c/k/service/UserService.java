package c.c.k.service;

import c.c.k.domain.User;
import org.springframework.stereotype.Component;

/**
 * @Title c.c.k.service
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/7/24 chenck
 */
@Component
public class UserService {
    public User getUser(int userId){
        User user = new User();
        user.setId(userId);
        user.setName("test");
        return user;
    }
}
