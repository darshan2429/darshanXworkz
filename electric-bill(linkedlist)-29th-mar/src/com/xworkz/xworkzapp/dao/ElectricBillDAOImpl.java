package com.xworkz.xworkzapp.dao;


import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.xworkzapp.dto.ElectrivBillDTO;

public class ElectricBillDAOImpl implements ElectricBillDAO{
	LinkedList<ElectrivBillDTO> electric=new LinkedList<ElectrivBillDTO>();
	@Override
	public void addDetails(ElectrivBillDTO dto) {
		electric.push(dto);
		System.out.println("electric bill added successfully");
	}

	@Override
	public void displayDetails() {
		Iterator<ElectrivBillDTO> iterator = electric.iterator();
		while (iterator.hasNext()) {
			ElectrivBillDTO electrivBillDTO = (ElectrivBillDTO) iterator.next();
			System.out.println(electrivBillDTO);
		}
	}

	@Override
	public void removeDetails() {
		ElectrivBillDTO pop = electric.pop();
		System.out.println("removed data successfully");
		System.out.println(pop);
	}
	
	

}
