package com.DesignModel.AbstructFactory.Dao;

public interface AbstructFactory {
    abstract IUserDao createuser();
    abstract  IDepartmentDao createdept();
}
