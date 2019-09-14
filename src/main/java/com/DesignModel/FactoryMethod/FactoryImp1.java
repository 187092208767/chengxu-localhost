package com.DesignModel.FactoryMethod;

public class FactoryImp1 implements  FactoryInterface {
    @Override
    public ProductInterface createProduct() {
        return new Product1();
    }
}
