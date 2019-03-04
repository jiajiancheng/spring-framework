package com.jjc.test;

import com.jjc.test.proxy.CglibProxyMethodInterceptor;
import com.jjc.test.proxy.JDKProxyLogInvocationHandler;
import com.jjc.test.service.UserService;
import com.jjc.test.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

public class ProxyTest {

    @Test
    public void testJdkProxy() {
        UserService userService = (UserService) Proxy.newProxyInstance(
                UserService.class.getClassLoader(),
                new Class[]{UserService.class},
                new JDKProxyLogInvocationHandler(new UserServiceImpl()));
        userService.sayHello();
    }

    @Test
    public void testCglibProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserServiceImpl.class);
        enhancer.setCallback(new CglibProxyMethodInterceptor());

        UserServiceImpl userService = (UserServiceImpl)enhancer.create();
        userService.sayHello();
    }

}
