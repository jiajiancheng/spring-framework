package com.jjc;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryTest {

    @Test
    public void testSimpleLoad() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("com/jjc/beanFactoryTest.xml");
//        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));

//        ClassPathResource resource = new ClassPathResource("importTest.xml");
//        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
//        reader.loadBeanDefinitions(resource);

        MyTestBean myTestBean = (MyTestBean) beanFactory.getBean("myTestBean");
        Assert.assertEquals(myTestBean.getName(), "init");
//        Assert.assertEquals(myTestBean.getBirthday(), DateUtils.toDate(LocalDate.of(2018, 11, 19)));
//        Assert.assertEquals(myTestBean.getCreateDate(), LocalDate.of(2018, 11, 19));
    }

}
