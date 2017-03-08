package com.design.pattern.creational.prototype;

public class Circle extends Shape
{
    @Override
    void draw()
    {
        System.out.println("Inside Circle::draw() method.");
    }

    @Override
    String getType()
    {
        return "Circle";
    }
}
