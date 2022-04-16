package c.c.k.mybatis;

import c.c.k.mapper.UserMapper;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.lang.reflect.Proxy;

/**
 * @Description MapperProxy的工厂类
 * @Author chenck
 * @Date 2022/4/16 15:41
 * @Version 1.0
 **/

public class MyMapperFactoryBean<T> implements FactoryBean<T> {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private Class<T> mapperInterface;

    public MyMapperFactoryBean(Class<T> mapperInterface){
        this.mapperInterface = mapperInterface;
    }

    @Override
    public T getObject() throws Exception {
        return (T)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{mapperInterface},
                MyMapperProxyFactory.getFactory().getMapper(mapperInterface, jdbcTemplate)
        );
    }

    @Override
    public Class<T> getObjectType() {
        return mapperInterface;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
