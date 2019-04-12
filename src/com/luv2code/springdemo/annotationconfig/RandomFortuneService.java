package com.luv2code.springdemo.annotationconfig;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService
{
    @Override
    public String getFortune()
    {
        return "Here should be some random stuff.";
    }
}
