package com.design.pattern.creational.prototype;

public abstract class Shape implements Cloneable
{
    private String id;

    abstract void draw();

    abstract String getType();

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    @Override
    public Object clone()
    {
        Object clone = null;

        try
        {
            clone = super.clone();

        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

        return clone;
    }
}
