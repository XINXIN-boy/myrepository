package com.itqf.demo04.entity;

import java.io.Serializable;

/**
 * projectName:springMVC
 *
 * @author: 三毛
 * time:2020/9/2317:35
 * description:
 */
public class VoCommodity implements Serializable {

    private int value ;
    private String name ;

    @Override
    public String toString() {
        return "VoCommodity{" +
                "value='" + value + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
