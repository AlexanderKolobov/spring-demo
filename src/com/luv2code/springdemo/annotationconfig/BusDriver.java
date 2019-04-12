package com.luv2code.springdemo.annotationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BusDriver implements Driver
{
    private FortuneService fortuneService;

    public BusDriver()
    {
        System.out.println("Inside bus constructor!");
    }

    @Override
    public String getDailyWorkout()
    {
        return "Transfer people to the work.";
    }

    @Override
    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }

    public FortuneService getFortuneService()
    {
        return fortuneService;
    }

    @Autowired
    public void setFortuneService( @Qualifier( "randomFortuneService" ) FortuneService fortuneService )
    {
        this.fortuneService = fortuneService;
    }
}
