package com.jjc.test.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAspect {

    public void doBefore(JoinPoint jp) {
        System.out.println("do before");
    }

    public Object doAround(ProceedingJoinPoint pjp){
        try {
            return pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }

}