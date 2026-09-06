package com.example.aspectOrientedProgramming.aspectOrientedProgramming.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class aspectClass {

    // pointcut
    @Pointcut("execution(* com.example.aspectOrientedProgramming.aspectOrientedProgramming.Service.*.*(..))")
    public void pointCutMethod(){}

    //advice
    @Around("pointCutMethod()")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed(); // Execute the target method
        long duration = System.currentTimeMillis() - start;
        System.out.println(joinPoint.getSignature() + " took " + duration + " ms");
        return result;
    }

}
