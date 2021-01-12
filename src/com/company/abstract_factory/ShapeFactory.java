package com.company.abstract_factory;

public class ShapeFactory extends AbstractShapeFactory{


    @Override
    public Shape getShape(String shapeType) {
        return new Square();
    }
}
