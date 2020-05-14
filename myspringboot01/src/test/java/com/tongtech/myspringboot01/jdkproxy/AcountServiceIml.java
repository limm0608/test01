package com.tongtech.myspringboot01.jdkproxy;

/**
 * @author limm
 * @data 2020/5/6 21:39
 */
public class AcountServiceIml implements IAcountService {
    @Override
    public void service() {
        System.out.println("执行service.......");
    }
}
