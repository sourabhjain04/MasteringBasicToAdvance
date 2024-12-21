package com.spring.collections;

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
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/collections/config.xml");
     Emp emp1 =(Emp) context.getBean("emp1");
     
     System.out.println(emp1.getName());
     System.out.println(emp1.getPhone());
     System.out.println(emp1.getAddress());
     System.out.println(emp1.getCourses());
    }
}
