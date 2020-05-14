package com.gaoxi.gaoxicontroller.controller;

import com.gaoxi.gaoxicommonservicefacade.entity.LoginReq;
import com.gaoxi.gaoxicontroller.entity.Result;

import javax.servlet.http.HttpServletResponse;

/**
 * @author limm
 * @data 2020/5/13 22:05
 */
public interface UserController {
    public String login(LoginReq loginReq, HttpServletResponse httpRsp);
}
