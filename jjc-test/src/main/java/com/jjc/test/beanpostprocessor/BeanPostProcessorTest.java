package com.jjc.test.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class BeanPostProcessorTest implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        System.out.printf("postProcessBeforeInitialization, bean:%s, beanName:%s\n", bean.toString(), beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        System.out.printf("postProcessAfterInitialization, bean:%s, beanName:%s\n", bean.toString(), beanName);
        return bean;
    }
}
