package com.luv2code.springdemo.annotationconfig;

import org.springframework.beans.factory.annotation.Value;

public class CopDriver implements Driver
{
    private FortuneService fortuneService;
    @Value( "${driver.name}" )
    private String name;

    @Value( "${driver.license}" )
    private String licenseNumber;

    public CopDriver( FortuneService fortuneService )
    {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout()
    {
        return "Chase bad guys";
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
