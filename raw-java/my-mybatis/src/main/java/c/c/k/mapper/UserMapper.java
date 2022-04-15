package c.c.k.mapper;

import c.c.k.domain.User;
import c.c.k.enums.MySelect;

import java.util.List;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/4/15 15:08
 * @Version 1.0
 **/

public interface UserMapper {
    @MySelect("select * from my_user")
    List<User> list();
}
