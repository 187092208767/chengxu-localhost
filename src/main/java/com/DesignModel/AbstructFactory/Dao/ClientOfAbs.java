package com.DesignModel.AbstructFactory.Dao;

import com.DesignModel.AbstructFactory.Entity.Department;
import com.DesignModel.AbstructFactory.Entity.User;
import com.DesignModel.FactoryMethod.FactoryImp1;
import com.DesignModel.FactoryMethod.FactoryInterface;

public class ClientOfAbs {

    public static void main(String [] args){
        /*使用mysqldao层操作实体类*/
        AbstructFactory factoryInterface=new MysqlFactory();
        IUserDao user=factoryInterface.createuser();
        IDepartmentDao dept=factoryInterface.createdept();

        user.insert(new User(10,"chengxu"));
        user.select(10);
        dept.insert(new Department(88,"cheng"));

        /*使用oracle访问操作实体类*/
        AbstructFactory abstructFactory=new OracleFactory();
        IUserDao iUserDao=abstructFactory.createuser();
        IDepartmentDao iDepartmentDao=abstructFactory.createdept();
        iUserDao.insert(new User(100,"xizong"));
        iDepartmentDao.insert(new Department(99,"xioo"));

    }

}
