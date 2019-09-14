package com.DesignModel.AbstructFactory.Dao;
import com.DesignModel.AbstructFactory.Entity.User;

public interface IUserDao {
    public void insert(User user);
    abstract User select(int id);
}
