package com.luv2code.springdemo.annotationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class BusDriver implements Driver
{
    private FortuneService fortuneService;

    public BusDriver()
    {
        System.out.println("Inside bus constructor!");
    }

    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("\n>> BusDriver: inside doMyStartupStuff");
    }

    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("\n>> BusDriver: inside doMyCleanupStuff");
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
