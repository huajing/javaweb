package c.c.k.service;

import c.c.k.dao.UserDao;
import c.c.k.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(
        propagation= Propagation.NESTED,
        isolation= Isolation.DEFAULT,
        readOnly = false)
public class UserService {
    @Autowired
    private UserDao userDao;

    public void insert(){
        userDao.saveUser(new User("abc"));
        throw new RuntimeException("111");
    }
}
