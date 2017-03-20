package com.design.pattern.creational.abstractfactory;

/**
 * Abstract Factory patterns work around a super-factory which creates other factories. This factory
 * is also called as factory of factories. This type of design pattern comes under creational
 * pattern as this pattern provides one of the best ways to create an object.
 * 
 * In Abstract Factory pattern an interface is responsible for creating a factory of related objects
 * without explicitly specifying their classes. Each generated factory can give the objects as per
 * the Factory pattern.
 */
public class AbstractFactoryPatternDemo
{

    public static void main(String[] args)
    {
        // get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryType.SHAPE);

        // get an object of Shape Circle
        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);

        // call draw method of Shape Circle
        circle.draw();

        // get an object of Shape Rectangle
        Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);

        // call draw method of Shape Rectangle
        rectangle.draw();

        // get an object of Shape Square
        Shape square = shapeFactory.getShape(ShapeType.SQUARE);

        // call draw method of Shape Square
        square.draw();

        // get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryType.COLOR);

        // get an object of Color Red
        Color red = colorFactory.getColor(ColorType.RED);

        // call fill method of Red
        red.fill();

        // get an object of Color Green
        Color green = colorFactory.getColor(ColorType.GREEN);

        // call fill method of Green
        green.fill();

        // get an object of Color Blue
        Color blue = colorFactory.getColor(ColorType.BLUE);

        // call fill method of Color Blue
        blue.fill();
    }
}
