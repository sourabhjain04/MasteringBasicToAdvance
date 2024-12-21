package com.spring.stereotype;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/stereotype/config.xml");
		Student student = context.getBean("student",Student.class);
		System.out.println(student);
		
	}
}
