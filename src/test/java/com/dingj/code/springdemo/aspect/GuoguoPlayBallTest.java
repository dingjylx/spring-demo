package com.dingj.code.springdemo.aspect;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GuoguoPlayBallTest{

    @Autowired
    private GuoguoPlayBall guoguoPlayBall;

    @Test
    public void test(){
        guoguoPlayBall.playBasketBall();
    }
}
