package com.DesignModel.AbstructFactory.Entity;

/**
 * 实体层的部门类
 */
public class Department {
    private int id;
    private String deptName;

    public Department() {
        super();
    }

    public Department(int id, String deptName) {
        super();
        this.id = id;
        this.deptName = deptName;
    }

    public int getId() {
        return id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
