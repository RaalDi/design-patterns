package com.design.pattern.interceptingfilter;

public class Target
{
    public void execute(String request)
    {
        System.out.println("Executing request: " + request);
    }
}
