package c.c.k.mybatis;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/4/15 15:26
 * @Version 1.0
 **/

public class MyMapperProxyFactory {
    private static volatile MyMapperProxyFactory factory;

    public static MyMapperProxyFactory getFactory(){
        if(factory == null){
            synchronized (MyMapperProxyFactory.class){
                if(factory == null){
                    factory = new MyMapperProxyFactory();
                }
            }
        }
        return factory;
    }

    public MyMapperProxy getMapper(Class clazz, JdbcTemplate jdbcTemplate){
        return new MyMapperProxy(clazz, jdbcTemplate);
    }
}
