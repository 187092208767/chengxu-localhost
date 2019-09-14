package com.DesignModel.AbstructFactory.Dao;

import com.DesignModel.AbstructFactory.Entity.Department;
import com.DesignModel.AbstructFactory.Entity.User;

public interface IDepartmentDao {
    public void insert(Department dept);
    abstract Department select(int id);
}
