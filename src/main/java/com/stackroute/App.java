package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("beans loaded");
        Movie movie = context.getBean("movie",Movie.class);
        movie.getActor().displayDetails();

        //System.out.println( "Hello World!" );
    }
}
