package com.dingj.code.springdemo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class GuoguoPlayBallAspect1 {

    @Pointcut("execution(public * com.dingj.code.springdemo.aspect.GuoguoPlayBall.*())")
    @Order(1)
    public void aspect1() {

    }

    @After("aspect1()")
    public void after(){
        System.out.println("guoguo play ball after1...");
    }

}
