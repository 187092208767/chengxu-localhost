package com.DesignModel.SimpleFactory;

public class Client {
    public static void main(String [] args) throws Exception {
        Operator operator=SimpleFactory.createOperator("+");

        double result;
        result = operator.getResult(1, 1);
        System.out.println(result);
    }


}
