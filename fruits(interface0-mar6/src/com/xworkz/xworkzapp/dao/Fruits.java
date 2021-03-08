package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.FruitsDTO;

public class Fruits implements FruitDAO {
	int index = 0;

	FruitsDTO dto[] = new FruitsDTO[5];

	@Override
	public void addFruits(FruitsDTO dto) {
		this.dto[index] = dto;
		index++;
	}

	@Override
	public void displayFruits() {
		for (int i = 0; i < dto.length; i++) {
			if (dto[i] != null) {
				System.out.println("FruitName:" + dto[i].getName() + "  Price " + dto[i].getPrice());
			}
		}
	}

	@Override
	public void updateFruitPrice(String fruitName, int price) {
		System.out.println(" inside updated method");
		boolean b = false;
		for (int i = 0; i < dto.length; i++) {
			if (dto[i].getName().equals(fruitName)) {
				dto[i].setPrice(price);
				System.out.println("update successfully");
				b = true;
			} else {
				b = false;
			}
		}
		if (b == false) {
			System.out.println("fruite not found");
		}
	}

	@Override
	public void deleteFruits(String fruitName) {
		System.out.println("inside delete method");
		for (int i = 0; i < dto.length; i++) {
			if (dto[i].getName().equals(fruitName)) {
				dto[i] = null;
				System.out.println("deleted successfully");
			}
		}
	}
}
