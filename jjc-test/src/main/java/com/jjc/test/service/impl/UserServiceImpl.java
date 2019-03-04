package com.jjc.test.service.impl;

import com.jjc.test.dao.UserDao;
import com.jjc.test.service.UserService;
import com.jjc.test.vo.UserVo;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(UserVo user) {
        userDao.save(user);
    }

    @Override
    public void sayHello() {
        System.out.println("say hello");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserServiceImpl that = (UserServiceImpl) o;

        return userDao != null ? userDao.equals(that.userDao) : that.userDao == null;
    }

    @Override
    public int hashCode() {
        return userDao != null ? userDao.hashCode() : 0;
    }
}
