package com.design.pattern.businessdelegate;

public class EJBService implements BusinessService
{

    public void doProcessing()
    {
        System.out.println("Processing task by invoking EJB Service");
    }

}
