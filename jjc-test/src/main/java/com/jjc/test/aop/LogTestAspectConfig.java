package com.jjc.test.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LogTestAspectConfig {

    @Bean
    public LogTestAspect logTestAspect(){
        return new LogTestAspect();
    }

    @Pointcut("execution(* com.jjc.test.service.*.*(..))")
    public void logTestPointcut() {

    }

    @Before("logTestPointcut()")
    public void beforeTask(JoinPoint joinPoint){
        System.out.println(logTestAspect());
        System.out.println(logTestAspect());
        logTestAspect().doBefore(joinPoint);
        logTestAspect().doBefore(joinPoint);
    }

}
