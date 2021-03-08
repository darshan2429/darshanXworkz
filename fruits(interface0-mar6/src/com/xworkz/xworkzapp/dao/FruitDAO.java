package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.FruitsDTO;

public interface FruitDAO {
	public void addFruits(FruitsDTO dto);
	public void displayFruits();
	public void updateFruitPrice(String fruitName,int price);
	public void deleteFruits(String fruitName);

}
