package com.xworkz.xworkzapp.metro;

public class Metro {

	public static String name = "NAMMA METRO";
	private MetroCard card;
	private double amount;

	public void allow(MetroCard card) {
		if (amount >= 50.00) {
			if (card != null) {
				this.card = card;
				System.out.println("you are elegable to travel");
			}
			else {
				System.out.println(" card is compalsory to travel in to th metro");
			}
		}
		else {
			System.out.println("please recharge your card");
		}
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Metro.name = name;
	}
	public MetroCard getCard() {
		return card;
	}
	public void setCard(MetroCard card) {
		this.card = card;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double d) {
		this.amount = d;
	}
	

}
