package com.dingj.code.springdemo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class GuoguoPlayBallAspect2 {

    @Pointcut("execution(public * com.dingj.code.springdemo.aspect.GuoguoPlayBall.*())")
    @Order(2)
    public void aspect2() {

    }

    @After("aspect2()")
    public void after() throws Throwable{

        System.out.println("guoguo play ball afert2...");

    }

}
