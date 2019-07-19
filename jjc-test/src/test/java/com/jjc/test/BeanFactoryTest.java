package com.jjc.test;

import com.jjc.test.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BeanFactoryTest {

    @Test
    public void testSimpleLoad() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("com/jjc/test/beanFactoryTest.xml");
//        BeanFactory beanFactory = new FileSystemXmlApplicationContext("K:\\workspace\\study\\spring-framework\\jjc-test\\src\\main\\resources\\com\\jjc\\test\\beanFactoryTest.xml");
//        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/jjc/test/beanFactoryTest.xml"));

//        ClassPathResource resource = new ClassPathResource("importTest.xml");
//        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
//        reader.loadBeanDefinitions(resource);

        MyTestBean myTestBean = (MyTestBean) beanFactory.getBean("myTestBean");
        Assert.assertEquals(myTestBean.getName(), "test");
//        Assert.assertEquals(myTestBean.getBirthday(), DateUtils.toDate(LocalDate.of(2018, 11, 19)));
    }

    @Test
    public void testAddUser(){
        BeanFactory beanFactory = new FileSystemXmlApplicationContext("K:\\workspace\\study\\spring-framework\\jjc-test\\src\\main\\resources\\com\\jjc\\test\\beanFactoryTest.xml");
        System.out.println("init ioc container");
        UserService userService = (UserService) beanFactory.getBean("userService");
        System.out.println("get bean");
    }

    @Test
    public void testAnnotation(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:com/jjc/test/component-scan.xml");
        System.out.println("init ioc container");
        UserService userService = beanFactory.getBean(UserService.class);
        System.out.println("get bean");
        userService.add(null);
    }

    @Test
    public void testAop(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jjc/test/spring-aop.xml");
        UserService userService = context.getBean(UserService.class);
        userService.add(null);
    }

    /**
     * 注解的形式
     */
    @Test
    public void testAop2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jjc/test/spring-aop2.xml");
        UserService userService = context.getBean(UserService.class);
        userService.add(null);
    }

}
