package com.DesignModel.AbstructFactory.Dao;

import com.DesignModel.AbstructFactory.Entity.User;

/**
 * 不同的数据库访问的形式也不同，这是mysql的dao层具体接口
 */
public class UserMysqlDao implements  IUserDao {
    @Override
    public void insert(User user) {
        System.out.println("mysql--user的dao层实现");
    }

    @Override
    public User select(int id) {
        System.out.println("User: MySQL实现查询 ：id = "+id);
        return null;
    }
}
