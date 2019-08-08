package c.c.k.service;

import c.c.k.entity.User;
import c.c.k.mapper.UserMapper;
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
    private UserMapper userMapper;

    public void insert(){
        userMapper.insert(new User("aaaa"));
        userMapper.insert(new User("aaaa"));
        throw new RuntimeException("111");
    }
}
