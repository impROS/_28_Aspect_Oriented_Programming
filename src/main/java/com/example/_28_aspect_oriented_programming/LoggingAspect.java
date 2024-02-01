package com.example._28_aspect_oriented_programming;// LoggingAspect.java
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.example._28_aspect_oriented_programming.MyService.getMessage())")
    public void logBeforeServiceMethod(JoinPoint joinPoint) {
        System.out.println("Before calling: " + joinPoint.getSignature().getName());
    }

    @AfterReturning(
        pointcut = "execution(* com.example._28_aspect_oriented_programming.MyService.getMessage())",
        returning = "result")
    public void logAfterReturningServiceMethod(JoinPoint joinPoint, Object result) {
        System.out.println("After returning from: " + joinPoint.getSignature().getName());
        System.out.println("Returned value: " + result);
    }
}
