package com.xworkz.xworkzapp;

import java.awt.List;
import java.util.LinkedList;

import com.xworkz.xworkzapp.dao.ElectricBillDAO;
import com.xworkz.xworkzapp.dao.ElectricBillDAOImpl;
import com.xworkz.xworkzapp.dto.ElectrivBillDTO;

public class ElectricBillTester {
	
	public static void main(String[] args) {
		ElectrivBillDTO dto=new ElectrivBillDTO(100, 420,1000, "south");
		ElectrivBillDTO dto1=new ElectrivBillDTO(101, 421, 1100, "north");
		ElectrivBillDTO dto2=new ElectrivBillDTO(102, 422, 1200, "east");
		ElectrivBillDTO dto3=new ElectrivBillDTO(103, 423, 1300, "west");
		ElectricBillDAO electricBillDAOImpl = new ElectricBillDAOImpl();
		electricBillDAOImpl.addDetails(dto);
		electricBillDAOImpl.addDetails(dto1);
		electricBillDAOImpl.addDetails(dto2);
		electricBillDAOImpl.addDetails(dto3);
		electricBillDAOImpl.displayDetails();
		electricBillDAOImpl.removeDetails();
		
		
		
//		LinkedList<String> linkedList = new LinkedList<String>();
//		linkedList.add("darshan");
//		linkedList.add("santhu");
//		linkedList.add("teertha");
//		linkedList.add("ali");
//		String peekFirst = linkedList.peekFirst();
//		System.out.println(peekFirst);
//		System.out.println(linkedList);
//		
//		String peek = linkedList.peekLast();
//		System.out.println(peek);
//		System.out.println(linkedList);
//		
//		String poll = linkedList.poll();
//		System.out.println(poll);
//		System.out.println(linkedList);
//		
//		linkedList.set(1, "dev");
//		System.out.println(linkedList);
//		
		
		
		
	
		
	}

}
