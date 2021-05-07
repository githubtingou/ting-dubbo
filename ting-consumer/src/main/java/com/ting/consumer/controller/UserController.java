package com.ting.consumer.controller;

import com.ting.api.service.IUserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 消费
 *
 * @author ting
 * @version 1.0
 * @date 2021/05/07
 */
@RestController
public class UserController {

    @DubboReference
    private IUserService iUserService;

    @GetMapping(value = "getUser")
    public String getUser() {
        return iUserService.getName();
    }
}
