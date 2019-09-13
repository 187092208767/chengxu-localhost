package com.DesignModel.SimpleFactory;

/**
 * 属于operator的一种类
 */
public class Sub implements Operator {

    @Override
    public double getResult(double numberA, double numberB)  {
        return numberA-numberB;
    }
}
