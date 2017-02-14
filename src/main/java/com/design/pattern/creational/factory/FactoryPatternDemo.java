package com.design.pattern.creational.factory;

public class FactoryPatternDemo
{

    public static void main(String[] args)
    {
        ShapeFactory shapeFactory = new ShapeFactory();

        // get an object of Circle and call its draw method.
        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);

        // call draw method of Circle
        circle.draw();

        // get an object of Rectangle and call its draw method.
        Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);

        // call draw method of Rectangle
        rectangle.draw();

        // get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape(ShapeType.SQUARE);

        // call draw method of circle
        shape3.draw();
    }

}
