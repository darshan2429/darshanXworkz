package com.xworkz.school.service;

import com.xworkz.school.dao.SchoolDAO;
import com.xworkz.school.dto.SchoolDTO;

public class ServiceDAOImpl implements ServiceDAO {

	SchoolDAO schooldao;

	

	public ServiceDAOImpl(SchoolDAO schooldao) {
		this.schooldao = schooldao;
	}

	@Override
	public boolean ValidateAndSave(SchoolDTO dto) {
		boolean validate = false;
		if (dto != null) {
			String nameOfTheSchool = dto.getNameOfTheSchool();
			if (nameOfTheSchool != null && !nameOfTheSchool.isEmpty() && !nameOfTheSchool.contains(" ")
					&& nameOfTheSchool.length() >= 3 && nameOfTheSchool.length() <= 15) {
				System.out.println("Valid SchoolName");
				validate = true;
			} else {
				System.out.println("Invalid SchoolName");
				validate = false;
			}

			String addressOfTheSchool = dto.getAddressOfTheSchool();
			if (validate && addressOfTheSchool != null && !addressOfTheSchool.isEmpty()
					&& !addressOfTheSchool.contains(" ")) {
				System.out.println("valid Address");
				validate = true;
			} else {
				System.out.println("Invalid addresss");
				validate = false;
			}

			int noOfStudents = dto.getNoOfStudents();
			if (validate && noOfStudents > 0 && noOfStudents <= 15) {
				System.out.println("Valid no of students");
				validate = true;
			} else {
				System.out.println("Invalid no of students");
				validate = false;
			}
			if (validate) {
				schooldao.save(dto);
			} else {
				System.out.println("dto is not valid cannot add");
			}

		}

		return false;

	}
}
