package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("beans loaded");


        Movie movieBean = context.getBean("movie",Movie.class);
        movieBean.getActor().displayDetails();

        Movie movieBean1 = context.getBean("movie1",Movie.class);
        movieBean1.getActor().displayDetails();

        context.close();


    }
}
