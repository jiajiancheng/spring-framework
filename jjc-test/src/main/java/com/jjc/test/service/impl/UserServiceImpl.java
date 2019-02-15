package com.jjc.test.service.impl;

import com.jjc.test.dao.UserDao;
import com.jjc.test.service.UserService;
import com.jjc.test.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Override
    public void add(UserVo user) {
        userDao.save(user);
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
