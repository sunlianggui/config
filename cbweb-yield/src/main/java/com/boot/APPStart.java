package com.boot;

import com.boot.server.UserServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by Administrator on 2019/1/10 0010.
 */
@SpringBootApplication
@EnableFeignClients(basePackageClasses= UserServer.class)
public class APPStart {
    public static void main(String[] args) {
        SpringApplication.run(APPStart.class);
    }
}
