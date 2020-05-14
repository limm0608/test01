package com.tongtech.myspringboot01;

/**
 * @author limm
 * @data 2020/5/5 21:48
 */
public class Execute {
    public static  String execute(IService s){
        return s.service();
    }
}
