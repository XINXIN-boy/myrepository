package com.itqf.demo04.entity;

import java.io.Serializable;

/**
 * projectName:springMVC
 *
 * @author: 三毛
 * time:2020/9/2316:19
 * description:
 */
public class Commodity implements Serializable {

    private int id ;
    private String name ;
    private int number ;

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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
