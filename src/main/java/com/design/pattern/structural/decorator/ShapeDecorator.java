package com.design.pattern.structural.decorator;

public abstract class ShapeDecorator implements Shape
{
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape)
    {
        this.decoratedShape = decoratedShape;
    }
}
