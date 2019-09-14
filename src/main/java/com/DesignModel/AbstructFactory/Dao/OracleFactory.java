package com.DesignModel.AbstructFactory.Dao;

public class OracleFactory implements AbstructFactory {

    @Override
    public IUserDao createuser() {
        return new UserOracDao();
    }

    @Override
    public IDepartmentDao createdept() {
        return new DeptOracDao();
    }
}
