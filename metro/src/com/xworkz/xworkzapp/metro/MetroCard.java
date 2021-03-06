package com.xworkz.xworkzapp.metro;

public class MetroCard {

	private String cardNumber;
	private String cardName;

	public MetroCard(String cardNumber, String cardName) {
		super();
		this.cardNumber = cardNumber;
		this.cardName = cardName;
	}
	public void displyInfo() {
		System.out.println(this.cardName);
		System.out.println(this.cardNumber);
	}
	

}
