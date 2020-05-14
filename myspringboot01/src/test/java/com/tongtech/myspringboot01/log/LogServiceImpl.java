package com.tongtech.myspringboot01.log;

/**
 * @author limm
 * @data 2020/5/11 14:21
 */
public class LogServiceImpl implements  LogService {
    @Override
    public void outLog() {
        System.out.println("记录日志。。。。。。。。。。。。。。。。");
    }
}
