package c.c.k.service;

import c.c.k.domain.User;
import c.c.k.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/4/13 8:28
 * @Version 1.0
 **/

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired(required = true)
    private JdbcTemplate jdbcTemplate;


    public void print(){
        List<User> query = jdbcTemplate.query("select * from my_user", (resultSet, i) -> {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            User user = new User();
            user.setId(id);
            user.setName(name);
            return user;
        });
        System.out.println(query);

        System.out.println(userMapper.list());;
    }
}
