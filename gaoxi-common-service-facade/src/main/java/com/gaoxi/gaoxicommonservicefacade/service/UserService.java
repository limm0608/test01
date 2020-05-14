package com.gaoxi.gaoxicommonservicefacade.service;

import com.gaoxi.gaoxicommonservicefacade.entity.LoginReq;
import com.gaoxi.gaoxicommonservicefacade.entity.UserEntity;

/**
 * @author limm
 * @data 2020/5/13 21:49
 */
public interface UserService {
    public UserEntity login(LoginReq loginReq);
}
