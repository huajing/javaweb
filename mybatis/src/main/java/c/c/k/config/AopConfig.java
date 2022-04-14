package c.c.k.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;


/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/4/13 21:37
 * @Version 1.0
 **/

@Aspect
@Component
public class AopConfig {

    @Pointcut("execution(public * *(..))")  //service包下的任意类的任意方法时均会调用此方法
    private void pointCuteDemo(){
    }

    @After("pointCuteDemo()")
    public void doAfter(JoinPoint joinPoint){
        System.out.println(joinPoint.getTarget()+ "->" + joinPoint.getSignature().getName());
        //System.out.println("doAfter");
    }

    @Before("pointCuteDemo()")
    public void doBefore(JoinPoint joinPoint){
        //System.out.println("doBefore");
    }
    @Around("pointCuteDemo()")//JoinPoint joinPoint
    public Object logPerformance(ProceedingJoinPoint pjp) throws Throwable {
        return pjp.proceed();
    }
}
