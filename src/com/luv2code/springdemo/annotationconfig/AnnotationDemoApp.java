package com.luv2code.springdemo.annotationconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext( "annotation-applicationContext.xml" );
        Driver sillyDriver = context.getBean( "sportDriver", Driver.class );

        System.out.println(sillyDriver.getDailyWorkout());

        context.close();
    }
}
