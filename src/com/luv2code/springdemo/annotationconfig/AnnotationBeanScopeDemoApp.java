package com.luv2code.springdemo.annotationconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext( "annotation-applicationContext.xml" );
        Driver busDriver = context.getBean( "busDriver", Driver.class );
        Driver truckDriver = context.getBean( "busDriver", Driver.class );

        boolean result = busDriver == truckDriver;

        System.out.println("\nPointing to the same object " + result);
        System.out.println("\nMemory location for busDriver " + busDriver);
        System.out.println("\nMemory location for truckDriver " + truckDriver );
        System.out.println("\ntruckDriver fortune - " + truckDriver.getDailyFortune() );

        context.close();
    }
}
