package com.luv2code.springdemo.annotationconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext( "annotation-applicationContext.xml" );
        SportDriver sillyDriver = (SportDriver) context.getBean( "sportDriver", Driver.class );
        Driver busDriver = context.getBean( "busDriver", Driver.class );
        Driver truckDriver = context.getBean( "truckDriver", Driver.class );

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
