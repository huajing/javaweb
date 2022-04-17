package c.c.k.mybatis;

import c.c.k.enums.MySqlCommandType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/4/15 18:01
 * @Version 1.0
 **/

public class MyMapperMethod {
    private final MySqlCommand command;
    private final MyMethodSignature method;

    public MyMapperMethod(Class<?> mapperInterface, Method method){
        this.command = new MySqlCommand(mapperInterface, method);
        this.method = new MyMethodSignature(mapperInterface, method);
    }

    public Object execute(JdbcTemplate jdbcTemplate, Object[] args){
        MySqlCommandType sqlCommandType = command.getSqlCommandType();
        switch (sqlCommandType){
            case SELECT:
                if(method.isReturnMany()){
                    return jdbcTemplate.query(command.getSql(), (r,i)->{
                        //r.getString("propertis")
                        return null;
                    });
                }
                break;
            case FLUSH:
                break;
            case INSERT:
                jdbcTemplate.execute(command.getSql());
                break;
            case UPDATE:
                jdbcTemplate.update(command.getSql());
                break;
            case DELETE:
                String commandSql = command.getSql();
                jdbcTemplate.execute(commandSql);
                break;

        }
        return null;
    }
}
