package com.luv2code.springdemo.annotationconfig;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class RandomFortuneService implements FortuneService
{
    private String fileName = "C:\\Exadel\\Project\\spring-demo-one\\src\\fortunes.txt";
    private List<String> fortunes = new ArrayList<>();
    private Random random = new Random();

    @PostConstruct
    public void doMyStartupStuff()
    {
        System.out.println( "\n>> RandomFortuneService: inside doMyStartupStuff" );
        try( Stream<String> stream = Files.lines( Paths.get( fileName ) ) )
        {
            fortunes = stream.collect( Collectors.toList() );
        }
        catch( IOException e )
        {
            e.printStackTrace();
        }
    }

    @Override
    public String getFortune()
    {
        return fortunes.get( random.nextInt( fortunes.size() ) );
    }
}
