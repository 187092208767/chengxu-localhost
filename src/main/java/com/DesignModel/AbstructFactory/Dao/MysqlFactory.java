package com.DesignModel.AbstructFactory.Dao;

public class MysqlFactory implements AbstructFactory {
    @Override
    public IUserDao createuser() {
        return new UserMysqlDao();
    }

    @Override
    public IDepartmentDao createdept() {
        return new DeptMysqlDao();
    }
}
