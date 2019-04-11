package com.luv2code.springdemo.xmlconfig;

public class TrackCoach implements Coach
{
    private FortuneService fortuneService;

    public TrackCoach( FortuneService fortuneService )
    {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Run hard 5k";
    }

    @Override
    public String getDailyFortune()
    {
        return "Just do it!" + fortuneService.getFortune();
    }

    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    public void doMyCleanupStuff() {
        System.out.println("TrackCoach: inside method doMyCleanupStuff YoYo!");
    }
}
