package chen.ce.kuan.service;

import chen.ce.kuan.domain.User;

/**
 * @Title chen.ce.kuan.service
 * @Copyright: Copyright 2018
 * @Description: java <br/>
 * @Created on 2018/7/16 chenck
 */
public interface UserService {
    public void save(User user);
    public void getUser(int userId);
}
