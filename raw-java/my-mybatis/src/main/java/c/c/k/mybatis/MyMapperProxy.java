package c.c.k.mybatis;

import c.c.k.domain.User;
import c.c.k.enums.MySelect;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Map;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/4/15 15:26
 * @Version 1.0
 **/

public class MyMapperProxy<T> implements InvocationHandler {
    private Map<Method, MyMapperMethod> methodCache;
    private Class mapperInterface;
    private JdbcTemplate jdbcTemplate;//同sqlSession

    public MyMapperProxy(Class mapperInterface, JdbcTemplate jdbcTemplate){
        this.mapperInterface = mapperInterface;
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MyMapperMethod myMapperMethod = methodCache.get(method);
        return myMapperMethod.execute(jdbcTemplate);
    }
}
