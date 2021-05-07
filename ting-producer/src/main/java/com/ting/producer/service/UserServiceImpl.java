package com.ting.producer.service;

import com.ting.api.service.IUserService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * 实现
 *
 * @author ting
 * @version 1.0
 * @date 2021/05/07
 */
@DubboService
public class UserServiceImpl implements IUserService {

    @Override
    public String getName() {
        return "producer";
    }
}
