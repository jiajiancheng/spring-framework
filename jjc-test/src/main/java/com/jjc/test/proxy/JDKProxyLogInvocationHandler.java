package com.jjc.test.proxy;

import com.jjc.test.utils.ProxyUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKProxyLogInvocationHandler implements InvocationHandler {

    private Object target;

    public JDKProxyLogInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long t = System.currentTimeMillis();

        //将代理对象生成字节码到F盘上，方便反编译出java文件查看，实际动态代理是不需要自己生成的
        ProxyUtils.addClassToDisk(proxy.getClass().getName(), target.getClass(), "F:/$Proxy0.class");

        Object invoke = method.invoke(target, args);
        System.out.println(method.getName() + " cost:" + (System.currentTimeMillis() - t));
        return invoke;
    }

}
