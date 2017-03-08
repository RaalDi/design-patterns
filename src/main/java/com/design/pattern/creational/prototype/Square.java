package com.design.pattern.creational.prototype;

public class Square extends Shape
{
    @Override
    void draw()
    {
        System.out.println("Inside Square::draw() method.");
    }

    @Override
    String getType()
    {
        return "Square";
    }
}
