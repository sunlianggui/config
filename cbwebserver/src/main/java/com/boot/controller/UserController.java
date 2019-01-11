package com.boot.controller;

import com.boot.entity.User;
import com.boot.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/1/10 0010.
 */
@RestController
public class UserController {
    @Autowired
    UserServer userServer;

    @RequestMapping("/user")
    public User getUser(){
        return userServer.getUser();
    }

    @RequestMapping("/userName")
    public String getUserName(){
        return userServer.getUserName();
    }
}
