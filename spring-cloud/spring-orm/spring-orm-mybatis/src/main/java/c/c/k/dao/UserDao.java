package c.c.k.dao;

import c.c.k.entity.User;
import org.springframework.stereotype.Repository;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * @Title c.c.k.dao
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/6/22 chenck
 */
//@Repository
public interface UserDao {
    User getUser();
}
