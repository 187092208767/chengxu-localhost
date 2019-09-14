package com.DesignModel.AbstructFactory.Dao;

import com.DesignModel.AbstructFactory.Entity.Department;

public class DeptOracDao implements IDepartmentDao {
    @Override
    public void insert(Department dept) {
        System.out.println("oracle--dept的dao层实现");
    }

    @Override
    public Department select(int id) {
        System.out.println("oracle--dept的dao层实现");
        return null;
    }
}
