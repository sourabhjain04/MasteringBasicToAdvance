package com.spring.ci;

import java.util.List;

public class Person {

	private String name;
	private int personId;
	private Certi certi;
	private List<String> list;
	
	public Person(String name, int personId, Certi certi, List<String> list) {
	
		this.name = name;
		this.personId = personId;
		this.certi=certi;
		this.list=list;
	}
	
	public List<String>getList(){
		return list;
	}
	
	// Method to pop the last element
	public String popFriend() {
		if (list.isEmpty()) {
			return null; //handle the empty list
		}
		return list.remove(list.size()-1);
	}
	
	// method to remove a friend by name
	public boolean removeFriend(String friendname) {
		return list.remove(friendname);
	}
	@Override
	public String toString() {
		return this.name+" : "+ this.personId + "{"+this.certi.name+"}"+this.list;
	}
	
	
}
