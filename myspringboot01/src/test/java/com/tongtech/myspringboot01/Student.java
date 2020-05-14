package com.tongtech.myspringboot01;

/**
 * @author limm
 * @data 2020/5/7 10:24
 */
public class Student {
    private int id;
    private String name;
    private String addr;
    private Teacher teacher;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
