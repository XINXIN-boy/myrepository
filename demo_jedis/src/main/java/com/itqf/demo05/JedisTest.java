package com.itqf.demo05;


import com.alibaba.fastjson.JSON;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * projectName:springMVC
 *
 * @author: 三毛
 * time:2020/9/2414:45
 * description:
 */
public class JedisTest {

    // 通过java程序访问redis数据库
    // 获得单一的jedis对象操作数据库

    @Test
    public void test () {
        //连上redis数据库
        Jedis jedis = new Jedis("47.96.251.153", 6379);
        //给reis中存储数据
        jedis.set("username", "jack");
        //从redis中获取数据
        String username = jedis.get("username");
        System.out.println(username);

        //获取redis中原来就有的数据
        String user = jedis.get("user");
        System.out.println("user = " + user);

        //从redis中获取list集合
        List<String> student = jedis.lrange("student", 0, 9);
        System.out.println("student = " + student);

    }

    @Test
    public void test1 () {

        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(50);//最大的连接数
//        jedisPoolConfig.setMaxIdle(30);//最大的闲置数
//        jedisPoolConfig.setMinIdle(10);//最小的闲置数
        //1.创建redis的连接池
        JedisPool jedisPool = new JedisPool(jedisPoolConfig, "47.96.251.153", 6379);

        //2.从池子里面获取连接对象    Resource资源
        Jedis jedis = jedisPool.getResource();

        User user = new User(34, "zhangsan");
        //将user对象转换成字符串 并将其保存到redis中
        jedis.set("user", JSON.toJSONString(user));

        System.out.println(jedis.get("user"));

    }


}
