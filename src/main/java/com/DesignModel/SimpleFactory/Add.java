package com.DesignModel.SimpleFactory;

public class Add implements Operator {
    @Override
    public double getResult(double numberA, double numberB)  {
        return numberA + numberB;
    }
}
