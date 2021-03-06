package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.fruits.Apple;
import com.xworkz.xworkzapp.fruits.Mango;

public class FruitsTester {
	public static void main(String[] args) {

		Apple apple = new Apple();
		apple.name = "APPLE";
		apple.price = 200f;
		apple.eating();
		System.out.println(apple.name + "   " + apple.price);

		Mango mango = new Mango();
		mango.name = "MANGO";
		mango.price = 150;
		apple.eating();
		System.out.println(mango.name + "   " + mango.price);

	}

}
