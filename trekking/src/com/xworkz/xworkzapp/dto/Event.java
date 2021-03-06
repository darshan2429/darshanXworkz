package com.xworkz.xworkzapp.dto;

public class Event {
	private String name;
	private String address;
	private double cost;

	public Event() {
		this("bday");
		System.out.println("welcome to the bday party ");
	}
	public Event(String name) {
		this(name,"bengaluru",8000);
		this.name = name;
	}

	public Event(String name, String address, double cost) {
//		String output = this.toString();
//		System.out.println("output= " + output); 
		this.name = name;
		this.address = address;
		this.cost = cost;
	}

	public Event myEvents() {
		System.out.println("welcome");
		return this;
	}

	@Override
	public String toString() {
		return "Event [name= " + name + ",address= " + address + ",cost= " + cost + " ]";
	}

}
