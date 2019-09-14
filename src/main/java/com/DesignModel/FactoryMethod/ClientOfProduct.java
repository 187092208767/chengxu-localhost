package com.DesignModel.FactoryMethod;

/**
 * 工厂方法符合面向对象设计的开闭原则，但是把具体的判断留给了客户端来做。
 * 简单工厂要增加新的功能，需要在工厂类中进行修改，而现在需要在客户端进行修改完成新功能的添加。
 * 工厂方法将工厂类中的多个功能抽象出来，形成一个抽象工厂接口------实现首相接口具体工厂的形式。
 */
public class ClientOfProduct {
    public  static void main(String [] args){
        FactoryInterface factoryInterface=new FactoryImp1();
        ProductInterface productInterface=factoryInterface.createProduct();
        productInterface.getResult();

        FactoryInterface factoryInterface1=new FactoryImp2();
        ProductInterface productInterface1=factoryInterface1.createProduct();
        productInterface1.getResult();
    }


}
