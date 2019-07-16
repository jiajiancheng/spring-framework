package com.jjc.test.web.service.impl;

import com.jjc.test.web.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class UserServiceImpl implements UserService  {

    @PostConstruct
    public void init(){
        System.out.println("userService init------------");
    }

}
