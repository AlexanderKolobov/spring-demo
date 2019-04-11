package com.luv2code.springdemo;

// Setter injection
public class HockeyCoach implements Coach
{
    private String emailAddress;
    private String team;
    private FortuneService fortuneService;

    public HockeyCoach()
    {
        System.out.println("Inside no-arg constructor.");
    }

    @Override
    public String getDailyWorkout(){
        return "Ski";
    }

    @Override
    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }

    public void setFortuneService( FortuneService fortuneService )
    {
        this.fortuneService = fortuneService;
        System.out.println("Inside setter method.");
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailAddress( String emailAddress )
    {
        System.out.println("HockeyCoach: Inside setter method - setEmail.");
        this.emailAddress = emailAddress;
    }

    public String getTeam()
    {
        return team;
    }

    public void setTeam( String team )
    {
        System.out.println("HockeyCoach: Inside setter method - team.");
        this.team = team;
    }
}
