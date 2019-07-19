package com.jjc.test;

import com.jjc.test.aop.LogTestAspectConfig;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.util.ReflectionUtils;

public class AnnotationUtilsTest {

    public static void main(String[] args) {
        System.out.println(AnnotationUtils.findAnnotation(LogTestAspectConfig.class, Aspect.class));

        ReflectionUtils.doWithMethods(LogTestAspectConfig.class,
                method -> {
                    Pointcut pointcut = AnnotationUtils.getAnnotation(method, Pointcut.class);
                    System.out.println(AnnotationUtils.getValue(pointcut, "value"));
                },
                method -> AnnotationUtils.getAnnotation(method, Pointcut.class) != null);

    }

}
