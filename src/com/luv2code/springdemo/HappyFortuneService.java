package com.luv2code.springdemo;

import java.util.Random;

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
