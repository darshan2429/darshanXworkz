package com.xworkz.school;

import com.xworkz.school.dao.SchoolDAO;
import com.xworkz.school.dao.SchoolDAOImpl;
import com.xworkz.school.dto.SchoolDTO;
import com.xworkz.school.service.ServiceDAO;
import com.xworkz.school.service.ServiceDAOImpl;

public class ServiceTester {

	public static void main(String[] args) {
		
		
		SchoolDTO schoolDTO = new SchoolDTO();
		schoolDTO.setNameOfTheSchool("stjohns");
		schoolDTO.setAddressOfTheSchool("raja");
		schoolDTO.setNoOfStudents(15);
		
		 SchoolDAO dao = new SchoolDAOImpl();
		
		ServiceDAO serviceDAOImpl = new ServiceDAOImpl(dao);
		serviceDAOImpl.ValidateAndSave(schoolDTO);
		
		
		

	}

}
