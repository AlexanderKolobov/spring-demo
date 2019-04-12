package com.luv2code.springdemo.annotationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SportDriver implements Driver
{
    private FortuneService fortuneService;

    @Value( "${driver.name}" )
    private String name;

    @Value( "${driver.license}" )
    private String licenseNumber;

    @Autowired
    public SportDriver( @Qualifier( "happyFortuneService" ) FortuneService fortuneService )
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

    public String getName()
    {
        return name;
    }

    public String getLicenseNumber()
    {
        return licenseNumber;
    }
}
