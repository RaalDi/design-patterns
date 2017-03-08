package com.design.pattern.creational.prototype;

public class Rectangle extends Shape
{
    @Override
    void draw()
    {
        System.out.println("Inside Rectangle::draw() method.");

    }

    @Override
    String getType()
    {
        return "Rectangle";
    }
}
