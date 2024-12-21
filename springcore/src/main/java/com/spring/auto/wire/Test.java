package com.spring.auto.wire;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/auto/wire/config.xml");
		Emp emp1 = (Emp) context.getBean("emp1");
		System.out.println(emp1);
		
	}
}
