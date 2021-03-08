package com.xworkz.xworkzapp.tester;

import com.xworkz.xworkzapp.dao.FruitDAO;
import com.xworkz.xworkzapp.dao.Fruits;
import com.xworkz.xworkzapp.dto.FruitsDTO;

public class FruitTester {
	
	public static void main(String[] args) {
		Fruits fruits=new Fruits();
		FruitsDTO dto=new FruitsDTO("APPLE", 450);
		FruitsDTO dto1=new FruitsDTO("MANGO", 150);
		FruitsDTO dto2=new FruitsDTO("ORANGE", 200);
		FruitsDTO dto3=new FruitsDTO("BANANNA", 50);
		FruitsDTO dto4=new FruitsDTO("PAPPAYA", 60);
		
		fruits.addFruits(dto);
		fruits.addFruits(dto1);
		fruits.addFruits(dto2);
		fruits.addFruits(dto3);
		fruits.addFruits(dto4);
		
		fruits.displayFruits();
		
		fruits.updateFruitPrice("ABCD", 600);
		fruits.displayFruits();
		
		fruits.deleteFruits("PAPPAYA");
		fruits.displayFruits();
		
	}

}
