package com.design.pattern.behavioral.businessdelegate;

public class JMSService implements BusinessService
{

    public void doProcessing()
    {
        System.out.println("Processing task by invoking JMS Service");
    }

}
