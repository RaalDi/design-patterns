package com.design.pattern.creational.abstractfactory;

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
