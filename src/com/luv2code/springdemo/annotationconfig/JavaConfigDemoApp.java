package com.luv2code.springdemo.annotationconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext( DriverConfig.class );
        SportDriver sillyDriver = (SportDriver) context.getBean( "sportDriver", Driver.class );
        Driver busDriver = context.getBean( "busDriver", Driver.class );
        Driver truckDriver = context.getBean( "truckDriver", Driver.class );

        //java configuration
        System.out.println("================================================");
        CopDriver copDriver = context.getBean( "copDriver", CopDriver.class );
        System.out.println("\nJava config: " + copDriver.getDailyWorkout());
        System.out.println("\nJava config: " + copDriver.getDailyFortune());
        System.out.println("\nJava config: " + copDriver.getName());
        System.out.println("\nJava config: " + copDriver.getLicenseNumber());
        System.out.println("================================================");


        //constructor autowire
        System.out.println(sillyDriver.getDailyWorkout());
        System.out.println(sillyDriver.getDailyFortune());
        System.out.println(sillyDriver.getName());
        System.out.println(sillyDriver.getLicenseNumber());

        System.out.println("__________________");

        //setter autowire
        System.out.println(busDriver.getDailyWorkout());
        System.out.println(busDriver.getDailyFortune());

        System.out.println("__________________");
        //field autowire
        System.out.println(truckDriver.getDailyWorkout());
        System.out.println(truckDriver.getDailyFortune());

        context.close();
    }
}
