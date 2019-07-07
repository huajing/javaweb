package c.c.k.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopService {
    @Pointcut("execution(public * c.c.k.ctn.TestController.*(..))")
    public void test(){
    }

    @Before("test()")
    public void before(){
        System.out.println("before");
    }

    @After("test()")
    public void after(){
        System.out.println("after");
    }
}
