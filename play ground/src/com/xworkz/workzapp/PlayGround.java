package com.xworkz.workzapp;

public class PlayGround {
	public String area;
	public String typeOfGames;

	public PlayGround() {
		this("Rajajinagar");
		System.out.println("Playground object is created");
	}

	public PlayGround(String area) {
		this(area ,"Crickt");
		System.out.println("Playground object with one is created");
		this.area = area;
	}

	public PlayGround(String area,String typeOfGames) {
		System.out.println("Playground object with two is created");
		this.area = area;
		this.typeOfGames = typeOfGames;
	}
	
	public PlayGround playGames() {
		System.out.println("playing cricket"); 
		return this;
	}
}
