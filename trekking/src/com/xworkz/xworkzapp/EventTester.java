package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.Event;

public class EventTester {
	public static void main(String[] args) {
		Event event = new Event();
		System.out.println(event.toString());
		
		Event frnds = event.myEvents();
		System.out.println(frnds);
		 
	}

}
