package com.design.pattern.creational.abstractfactory;

public class ColorFactory extends AbstractFactory
{
    @Override
    Color getColor(ColorType colorType)
    {
        if (colorType == null)
        {
            return null;
        }

        if (colorType == ColorType.RED)
        {
            return new Red();

        }
        else if (colorType == ColorType.GREEN)
        {
            return new Green();

        }
        else if (colorType == ColorType.BLUE)
        {
            return new Blue();
        }

        return null;
    }

    @Override
    Shape getShape(ShapeType shapeType)
    {
        return null;
    }
}
