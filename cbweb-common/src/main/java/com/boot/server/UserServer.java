package com.boot.server;

import com.boot.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2019/1/10 0010.
 */

@FeignClient("cbwebserver")
@Component
public interface UserServer {

    @RequestMapping("/user")
    public User getUser();

    @RequestMapping("/userName")
    public String getUserName();
}
