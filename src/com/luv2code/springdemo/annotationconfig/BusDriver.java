package com.luv2code.springdemo.annotationconfig;

import org.springframework.stereotype.Component;

@Component
public class BusDriver implements Driver
{
    @Override
    public String getDailyWorkout()
    {
        return "Transfer people to the work.";
    }

    @Override
    public String getDailyFortune()
    {
        return null;
    }
}
