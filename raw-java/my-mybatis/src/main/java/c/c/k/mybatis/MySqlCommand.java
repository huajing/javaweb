package c.c.k.mybatis;

import c.c.k.enums.MySelect;
import c.c.k.enums.MySqlCommandType;

import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/4/15 18:11
 * @Version 1.0
 **/

public class MySqlCommand {
    private MySqlCommandType sqlCommandType;
    private String sql;

    public MySqlCommand(Class<?> mapperInterface, Method method){
        sqlCommandType = MySqlCommandType.DELETE;
        sql = method.getAnnotation(MySelect.class).value();
    }

    public MySqlCommandType getSqlCommandType() {
        return sqlCommandType;
    }

    public String getSql() {
        return sql;
    }
}
