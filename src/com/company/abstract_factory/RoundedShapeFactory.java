package com.company.abstract_factory;

public class RoundedShapeFactory extends AbstractShapeFactory{
    @Override
    public Shape getShape(String shapeType) {
        return new RoundedSquare();
    }
}
