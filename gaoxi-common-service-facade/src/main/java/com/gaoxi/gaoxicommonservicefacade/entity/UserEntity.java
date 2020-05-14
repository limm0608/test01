package com.gaoxi.gaoxicommonservicefacade.entity;

/**
 * @author limm
 * @data 2020/5/13 21:52
 */
public class UserEntity {
    private static final long serialVersionUID = 0000000000001L;
    private String id;
    private String name;
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
