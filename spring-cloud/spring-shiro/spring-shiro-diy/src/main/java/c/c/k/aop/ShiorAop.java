package c.c.k.aop;

import c.c.k.annotation.MyPermission;
import c.c.k.annotation.MyRole;
import c.c.k.service.PermissionService;
import c.c.k.service.RoleService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.servlet.mvc.condition.RequestConditionHolder;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @Title c.c.k.aop
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/7/23 chenck
 */
@Aspect
@Component
public class ShiorAop {
    @Autowired
    private PermissionService permissionService;
    @Autowired
    private RoleService roleService;

    /**
     * 拦截自己定义的注解
     */
//    @Pointcut("execution(public * c.c.k.ctn.MyController.*(..))")
    @Pointcut("@annotation(c.c.k.annotation.MyRole) || @annotation(c.c.k.annotation.MyPermission)")
    public void pointcut(){

    }

    @Before("pointcut()")
    public void before(){
        System.out.println("before");
    }

    @After("pointcut()")
    public void after(){
        System.out.println("after");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
        RequestAttributes requestAttributes = RequestContextHolder.currentRequestAttributes();
        System.out.println(requestAttributes+"========"+"000");

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        for (Annotation declaredAnnotation : signature.getMethod().getDeclaredAnnotations()) {

            if(declaredAnnotation instanceof MyRole){
                String value = ((MyRole) declaredAnnotation).value();
            }else if(declaredAnnotation instanceof MyPermission){
                String value = ((MyPermission) declaredAnnotation).value();
                System.out.println("MyPermission value:" + value);
            }
        }
//        System.out.println(signature.getMethod().getAnnotation(MyRole.class));


        return joinPoint.proceed();
    }
}
