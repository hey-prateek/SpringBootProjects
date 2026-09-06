package com.example.AspectOrientedProgramming;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@org.aspectj.lang.annotation.Aspect
@Component
public class Aspect {

    @Pointcut("execution(* com.example.AspectOrientedProgramming.Service.*(..))")
    public void beforeAspect(){}

    @Before("beforeAspect()")
    public void beforeMethodAction()
    {
        System.out.println("before method action...");
    }

    @Around("beforeAspect()")
    public Object aroundMethod(ProceedingJoinPoint jointpoint) throws Throwable {
        long start_time = System.nanoTime();
        Object res = jointpoint.proceed();
        long end_time = System.nanoTime();
        System.out.println("time taken: " + ((end_time - start_time)/1000000) + "seconds");
        return res;
    }


}
