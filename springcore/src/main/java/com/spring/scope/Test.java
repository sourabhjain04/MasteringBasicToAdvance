package com.spring.scope;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/scope/config.xml");
		Student student = context.getBean("ob",Student.class);
		System.out.println(student.hashCode());
		Student student1 = context.getBean("ob",Student.class);
		System.out.println(student1.hashCode());
	}
}
