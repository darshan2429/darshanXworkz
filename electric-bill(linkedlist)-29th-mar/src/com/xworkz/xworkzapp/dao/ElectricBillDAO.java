package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.ElectrivBillDTO;

public interface ElectricBillDAO {
	
	public void addDetails(ElectrivBillDTO dto);
	public void displayDetails();
	public void removeDetails();
	

}
