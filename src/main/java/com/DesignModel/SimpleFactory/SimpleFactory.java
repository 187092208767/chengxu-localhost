package com.DesignModel.SimpleFactory;

/**
 * 简单工厂类，通过工厂来进行类的具体胜场，可以做到去除new object()的动作的解耦。
 */
public class SimpleFactory {
    public static Operator createOperator(String targetName){
        Operator operationObj = null;
        switch (targetName) {
            case "+":
                operationObj =  add();
                break;
            case "-":
                operationObj = sub();
                break;
            /*case "*":
                operationObj = new Mul();
                break;
            case "/":
                operationObj = new Div();
                break;*/
        }
        return operationObj;
    }

    /**
     * 使用这种模式，我们在生成工厂的时候可以加一些业务代码，如日志、判断业务等，
     * 这时候可以直接在switch case中加上去就行了，如下：
     * @return
     */
    private static Operator add(){
        System.out.println("加法运算");
        return new Add();
    }
    private static Operator sub(){
        System.out.println("减法运算");
        return new Sub();
    }
}
