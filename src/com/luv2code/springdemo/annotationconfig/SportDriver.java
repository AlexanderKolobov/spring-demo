package com.luv2code.springdemo.annotationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SportDriver implements Driver
{
    private FortuneService fortuneService;

    @Autowired
    public SportDriver( FortuneService fortuneService )
    {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout()
    {
        return "Practice on Monaco track.";
    }

    @Override
    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }
}
