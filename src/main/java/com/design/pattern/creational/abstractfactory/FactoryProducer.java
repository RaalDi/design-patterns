package com.design.pattern.creational.abstractfactory;

public class FactoryProducer
{
    public static AbstractFactory getFactory(FactoryType factoryType)
    {
        if (factoryType == FactoryType.SHAPE)
        {
            return new ShapeFactory();

        }
        else if (factoryType == FactoryType.COLOR)
        {
            return new ColorFactory();
        }

        return null;
    }
}
