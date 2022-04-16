package c.c.k.mybatis;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/4/15 18:01
 * @Version 1.0
 **/

public class MyMapperMethod {
    private final MySqlCommand command;
    private final MyMethodSignature method;

    public MyMapperMethod(){
        this.command = new MySqlCommand();
        this.method = new MyMethodSignature();
    }

    public Object execute(JdbcTemplate jdbcTemplate, Object[] args){
        return null;

    }
}
