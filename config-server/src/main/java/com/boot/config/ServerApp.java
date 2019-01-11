package com.boot.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Administrator on 2019/1/10 0010.
 */
@SpringBootApplication
@EnableConfigServer
public class ServerApp {
    public static void main(String[] args) {
        SpringApplication.run(ServerApp.class);
    }
}
