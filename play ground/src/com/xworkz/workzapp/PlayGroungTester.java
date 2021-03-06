package com.xworkz.workzapp;

public class PlayGroungTester {
	public static void main(String[] args) {

		PlayGround ground = new PlayGround("");
		System.out.println(ground.area + "  " + ground.typeOfGames);
		PlayGround ground1 = ground.playGames();
		System.out.println(ground1);
	}

}
