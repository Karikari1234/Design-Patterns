package com.company.abstract_factory;

public class FactoryProvider {
    public static AbstractShapeFactory getAbstractFactory(boolean rounded){
        if(rounded){
            return new RoundedShapeFactory();
        }


        return new ShapeFactory();
    }
}
