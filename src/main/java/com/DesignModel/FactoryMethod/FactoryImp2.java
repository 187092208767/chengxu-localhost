package com.DesignModel.FactoryMethod;

public class FactoryImp2 implements FactoryInterface {
    @Override
    public ProductInterface createProduct() {
        return new Product2();
    }
}
