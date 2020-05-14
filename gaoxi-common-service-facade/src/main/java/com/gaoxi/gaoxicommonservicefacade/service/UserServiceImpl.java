package com.gaoxi.gaoxicommonservicefacade.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.gaoxi.gaoxicommonservicefacade.entity.LoginReq;
import com.gaoxi.gaoxicommonservicefacade.entity.UserEntity;

/**
 * @author limm
 * @data 2020/5/13 21:56
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Override
    public UserEntity login(LoginReq loginReq) {
        UserEntity user = new UserEntity();
        user.setId("001");
        user.setName("zhangsan");
        user.setPassword("123456");
        return user;
    }
}

