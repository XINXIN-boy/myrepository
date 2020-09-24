package com.itqf.demo05.entity;

/**
 * projectName:springMVC
 *
 * @author: 三毛
 * time:2020/9/2321:41
 * description:
 */
public class User {

    private String account ;
    private double money ;

    public User(String account, double money) {
        this.account = account;
        this.money = money;
    }

    @Override
    public String toString() {
        return "user{" +
                "account='" + account + '\'' +
                ", money=" + money +
                '}';
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
