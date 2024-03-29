package com.luv2code.springdemo.xmlconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( "applicationContext.xml" );

        HockeyCoach coach = context.getBean( "myHockeyCoach", HockeyCoach.class );

        System.out.println( coach.getDailyWorkout() );
        System.out.println( coach.getDailyFortune() );
        System.out.println( coach.getEmailAddress() );
        System.out.println( coach.getTeam() );

        context.close();
    }
}
