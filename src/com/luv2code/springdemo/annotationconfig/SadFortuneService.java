package com.luv2code.springdemo.annotationconfig;

public class SadFortuneService implements FortuneService
{
    @Override
    public String getFortune()
    {
        return "Today is a sad day:(";
    }
}
