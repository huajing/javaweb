package c.c.k.service.impl;

import c.c.k.domain.User;
import c.c.k.repository.UserRepository;
import c.c.k.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Title chen.ce.kuan.service.impl
 * @Copyright: Copyright 2018
 * @Description: java <br/>
 * @Created on 2018/7/16 chenck
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void getUser(int userId) {
        //userRepository.findById(userId).get().
    }
}
