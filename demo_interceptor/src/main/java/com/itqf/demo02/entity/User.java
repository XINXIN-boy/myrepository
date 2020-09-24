package com.itqf.demo02.entity;

import java.io.Serializable;

/**
 * projectName:springMVC
 *
 * @author: 三毛
 * time:2020/9/1918:07
 * description:
 */
public class User implements Serializable {

    private String username ;
    private String password ;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
