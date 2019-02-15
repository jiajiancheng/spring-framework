package com.jjc.test;

import org.springframework.beans.factory.InitializingBean;

import java.time.LocalDate;
import java.util.Date;

public class MyTestBean implements InitializingBean {

    private String name;
    private Date birthday;
    private LocalDate createDate;

    public void init(){
        name = "init";
        System.out.println("init-method");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("afterPropertiesSet -> " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
}
