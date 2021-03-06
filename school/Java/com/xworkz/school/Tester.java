package com.xworkz.school;

import com.xworkz.school.dao.SchoolDAO;
import com.xworkz.school.dao.SchoolDAOImpl;
import com.xworkz.school.dto.SchoolDTO;

public class Tester {

	public static void main(String[] args) {

		SchoolDTO dto1 = new SchoolDTO("st,Johns", 500, "vijayanagar");
	//SchoolDTO dt02 = new SchoolDTO("st,Johns", 400, "jayanagar");

		SchoolDAO schoolDAOImpl = new SchoolDAOImpl();
		schoolDAOImpl.save(dto1);
		//schoolDAOImpl.save(dt02);
		
//		boolean updateAddressUsingSchoolName = schoolDAOImpl.updateAddressUsingSchoolName("st,Jhns", "rajajinagar");
//		System.out.println(updateAddressUsingSchoolName);

		boolean deleteUsingSchholName = schoolDAOImpl.deleteUsingSchholName("st,Johns");
		System.out.println(deleteUsingSchholName);
		
		
	}

}
