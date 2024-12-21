package com.spring.ci;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/ci/config.xml");
		Person p =(Person) context.getBean("person");
		System.out.println("Original List "+ p.getList());
		
		// perform pop (remove last element)
		List<String> friendsList =p.getList();
		String removedElement =friendsList.remove(friendsList.size()-1);
		System.out.println("Removed Element: "+ removedElement);
		
		friendsList.remove("Vedkia jain");
		
		System.out.println("Modified List: "+ friendsList);
		// Second way
		System.out.println("Original List "+ p);
		
		String popped = p.popFriend();
		System.out.println("popped friend :" + popped);
		
		// Remove a specific friend
		
	boolean removed = p.removeFriend("Bhavya Jain");
	System.out.println("Was Bhavya Jain removed? "+removed);
	//print the modified list
	System.out.println("Modified List: "+p);
		
	}

}
