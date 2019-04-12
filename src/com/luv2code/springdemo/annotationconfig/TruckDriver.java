package com.luv2code.springdemo.annotationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TruckDriver implements Driver
{
    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout()
    {
        return "Drive a big truck MAN.";
    }

    @Override
    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }
}
