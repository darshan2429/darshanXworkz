package com.xworkz.xworkzapp.methodVar;

public class Hotel{
	
	static String hotelName="Hotel Taj";
	private String name;
	private double price;
	
	
	
	public void southIndian(String name, double price){
		this.name=name;
		this.price=price;	
	}
	
	public void northIndian(String name, double price){
		this.name=name;
		this.price=price;
		System.out.println("name="+name+"address");
	}
	public static void main(String[] args) {
		int a=10;int b=20;
		int sum=a+b;
		Hotel hotel = new Hotel();
		hotel.setName("north indian meals");
		hotel.setPrice(130.0);
		System.out.println(hotelName+"\n "+hotel.getName()+" "+hotel.getPrice()+" \n "+sum);
		hotel.northIndian("south indian meals", 160);
		
		
	}
	public static String getHotelName() {
		return hotelName;
	}
	public static void setHotelName(String hotelName) {
		Hotel.hotelName = hotelName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
