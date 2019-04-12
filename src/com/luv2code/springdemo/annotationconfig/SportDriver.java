package com.luv2code.springdemo.annotationconfig;

import org.springframework.stereotype.Component;

@Component
public class SportDriver implements Driver
{
    @Override
    public String getDailyWorkout()
    {
        return "Practice on Monaco track.";
    }
}
