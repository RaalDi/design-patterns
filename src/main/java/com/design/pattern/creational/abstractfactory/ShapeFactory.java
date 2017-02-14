package com.design.pattern.creational.abstractfactory;

public class ShapeFactory extends AbstractFactory
{
    // use getShape method to get object of type shape
    @Override
    public Shape getShape(ShapeType shapeType)
    {
        if (shapeType == null)
        {
            return null;
        }
        if (shapeType == ShapeType.CIRCLE)
        {
            return new Circle();

        }
        else if (shapeType == ShapeType.RECTANGLE)
        {
            return new Rectangle();

        }
        else if (shapeType == ShapeType.SQUARE)
        {
            return new Square();
        }

        return null;
    }

    @Override
    Color getColor(ColorType colorType)
    {
        return null;
    }

}
