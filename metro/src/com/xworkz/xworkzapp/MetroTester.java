package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.metro.Metro;
import com.xworkz.xworkzapp.metro.MetroCard;

public class MetroTester {
	
	public static void main(String[] args) {
		
		Metro metro = new Metro();
		metro.setAmount(49.00);
		System.out.println(metro.name);
		
		MetroCard card = new MetroCard("NAMMA13535624", "Metro Card");
		card.displyInfo();
		metro.allow(card);
		
		
	}

}
