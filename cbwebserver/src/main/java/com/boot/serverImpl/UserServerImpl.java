package com.boot.serverImpl;

import com.boot.entity.User;
import com.boot.server.UserServer;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/1/10 0010.
 */
@Service
public class UserServerImpl implements UserServer {

    public User getUser() {
        User user = new User();
        user.setPassword("admin");
        user.setUsername("admin");
        user.setAge("20");
        return user;
    }

    public String getUserName() {
        return "root";
    }
}
