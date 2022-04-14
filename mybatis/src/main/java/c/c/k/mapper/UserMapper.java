package c.c.k.mapper;

import c.c.k.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/4/13 9:06
 * @Version 1.0
 **/

public interface UserMapper {
    @Select("select * from my_user")
    List<User> list();
}
