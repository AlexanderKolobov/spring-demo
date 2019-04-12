package com.luv2code.springdemo.annotationconfig;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class HappyFortuneService implements FortuneService
{
    private String fortunes[] = {
        "Today is your lucky day!!!"
        , "You will do your best!"
        , "Just smile!"};

    @Override
    public String getFortune()
    {
        Random random = new Random();
        return fortunes[random.nextInt( 3 )];
    }
}
