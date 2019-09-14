package com.DesignModel.AbstructFactory.Dao;

import com.DesignModel.AbstructFactory.Entity.User;

public class UserOracDao implements IUserDao {
    @Override
    public void insert(User user) {
        System.out.println("oracle--user的dao层实现");
    }

    @Override
    public User select(int id) {
        System.out.println("oracle--user的dao层实现");
        return null;
    }
}
