package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Administrator on 2019/1/10 0010.
 */
@SpringBootApplication(scanBasePackages = "")
@EnableEurekaServer
public class RegisterApp {
    public static void main(String[] args) {
        SpringApplication.run(RegisterApp.class);
    }
}
