package com.jjc.test.dao.impl;

import com.jjc.test.dao.UserDao;
import com.jjc.test.vo.UserVo;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void save(UserVo user) {

    }
}
