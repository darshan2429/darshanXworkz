package com.xworkz.restaurant;

import com.xworkz.restaurant.dto.Restaurant;

public class RestaurantTester {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Restaurant restaurant=new Restaurant("grillHouse", "veg", 5, true);
		Restaurant restaurant1=new Restaurant("grillHouse", "veg", 5, true);

		Object object=restaurant.clone();
		Restaurant clone=(Restaurant)object;
		
		if(restaurant.equals(restaurant1)){
			System.out.println("same");
		}else{
			System.out.println("not same");
		}
	}

}
