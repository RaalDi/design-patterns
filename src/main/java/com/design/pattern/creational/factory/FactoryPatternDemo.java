package com.design.pattern.creational.factory;

/**
 * Factory pattern is one of the most used design patterns in Java. This type of design pattern
 * comes under creational pattern as this pattern provides one of the best ways to create an object.
 * 
 * In Factory pattern, we create object without exposing the creation logic to the client and refer
 * to newly created object using a common interface.
 */
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
