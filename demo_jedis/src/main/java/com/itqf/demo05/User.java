package com.itqf.demo05;

import java.io.Serializable;

/**
 * projectName:springMVC
 *
 * @author: 三毛
 * time:2020/9/2421:18
 * description:
 */
public class User implements Serializable {
    private Integer id;
    private String name;

    public User() {
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
