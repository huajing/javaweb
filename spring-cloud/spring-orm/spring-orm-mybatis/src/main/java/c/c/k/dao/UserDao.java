package c.c.k.dao;

import c.c.k.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * mybatics
 * @Title c.c.k.dao
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/6/22 chenck
 * mapper接口，对应xml
 */
public interface UserDao {
    User getUser();

    void saveUser(User user);

    /**
     * 注解实现
     * @param name
     * @return
     */
//    @Select("select id,name from user where name=#{name}")
    List<User> findByName(String name);


}
