package c.c.k.mybatis;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/4/16 18:26
 * @Version 1.0
 **/

public class MyMethodSignature {
    private boolean returnMany;

    public MyMethodSignature(Class mapperInterface, Method method){
        Class<?> returnType = method.getReturnType();
        returnMany = Collection.class.isAssignableFrom(returnType) || returnType.isArray();
    }

    public boolean isReturnMany() {
        return returnMany;
    }
}
