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
//        System.out.println("Comparison using prototype scope!");
//        Movie bean1 = context.getBean("movie",Movie.class);
//        bean1.getActor().displayDetails();
//        Movie bean2 = context.getBean("movie",Movie.class);
//        bean2.getActor().displayDetails();
//        System.out.println(bean1==bean2);
//
//        System.out.println("Comparison using two names!");
//        Movie movieBeanA = context.getBean("movieA",Movie.class);
//        movieBeanA.getActor().displayDetails();
//        Movie movieBeanB = context.getBean("movieB",Movie.class);
//        movieBeanB.getActor().displayDetails();

//        System.out.println("Comparison without prototype scope!");

        Movie movieBean = context.getBean("movie",Movie.class);
        movieBean.getActor().displayDetails();


//        Movie movieBean2 = context.getBean("movie",Movie.class);
//        movieBean2.getActor().displayDetails();

    }
}
