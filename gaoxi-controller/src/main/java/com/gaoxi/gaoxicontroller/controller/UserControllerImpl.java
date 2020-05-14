package com.gaoxi.gaoxicontroller.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gaoxi.gaoxicommonservicefacade.entity.LoginReq;
import com.gaoxi.gaoxicommonservicefacade.entity.UserEntity;
import com.gaoxi.gaoxicommonservicefacade.service.UserService;
import com.gaoxi.gaoxicontroller.entity.Result;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author limm
 * @data 2020/5/13 22:06
 */
@RestController
public class UserControllerImpl implements UserController {
    @Reference(version = "1.0.0")
    private UserService userService;
    @Override
    public String  login(LoginReq loginReq, HttpServletResponse httpRsp) {
        // 登录鉴权
        UserEntity userEntity = userService.login(loginReq);
        return "success";


    }
}

