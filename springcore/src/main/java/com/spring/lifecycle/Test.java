package com.spring.lifecycle;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/lifecycle/config.xml");
		Samosa s1 = (Samosa) context.getBean("s1");
		System.out.println(s1);
		
		context.registerShutdownHook();
	}
}
