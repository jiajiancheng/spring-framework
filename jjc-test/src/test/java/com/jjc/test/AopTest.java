package com.jjc.test;

import com.jjc.test.aop.LogTestAdvice;
import com.jjc.test.service.UserService;
import com.jjc.test.service.impl.UserServiceImpl;
import org.aopalliance.aop.Advice;
import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {

    /**
     * 使用ProxyFactory，编程式
     */
    @Test
    public void testProxyFactory(){
        ProxyFactory proxyFactory = new ProxyFactory();
        Advice logTestAspect = new LogTestAdvice();

        UserService userService = new UserServiceImpl();

        proxyFactory.setTarget(userService);
        proxyFactory.addAdvice(logTestAspect);
        proxyFactory.setInterfaces(UserService.class);

        UserService proxy = (UserService) proxyFactory.getProxy();
        proxy.sayHello();
    }

    /**
     * 使用ProxyFactoryBean，声明式
     */
    @Test
    public void testProxyFactoryBean(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/jjc/test/spring-aop-factory-bean.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.sayHello();
    }

    /**
     * 注解的形式，内部使用ProxyFactory
     */
    @Test
    public void testAspectAnnotation(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jjc/test/spring-aop-annotation.xml");
        UserService userService = context.getBean(UserService.class);
        userService.sayHello();
    }

    /**
     * aop:config配置方式，内部使用ProxyFactory
     */
    @Test
    public void testAopXmlAspect(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jjc/test/spring-aop-xml-aspect.xml");
        UserService userService = context.getBean(UserService.class);
        userService.sayHello();
    }

    /**
     * aop:config配置方式，内部使用ProxyFactory
     */
    @Test
    public void testAopXmlAdvisor(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jjc/test/spring-aop-xml-advisor.xml");
        UserService userService = context.getBean(UserService.class);
        userService.sayHello();
    }

}
