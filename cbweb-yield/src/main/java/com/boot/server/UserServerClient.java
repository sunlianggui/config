package com.boot.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/1/10 0010.
 */


@FeignClient("cbwebserver")
@Component
public interface UserServerClient extends UserServer{
}
