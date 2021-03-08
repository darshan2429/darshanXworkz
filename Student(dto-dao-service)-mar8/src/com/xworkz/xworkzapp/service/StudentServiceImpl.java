package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dao.StudentDAO;
import com.xworkz.xworkzapp.dao.StudentDAOImpl;
import com.xworkz.xworkzapp.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {

	StudentDAO dao = new StudentDAOImpl();

	public StudentServiceImpl() {
		System.out.println("service object is created");
	}

	@Override
	public void addStudent(StudentDTO dto) {
		if (dto.getStudentName() != null) {
			dao.addStudent(dto);
		}

	}

	@Override
	public void displayStudent() {
		dao.displayStudent();
	}

	@Override
	public void displayUsingStudentName(String name) {
		if (name != null) {
			dao.displayUsingStudentName(name);
		}
	}

	@Override
	public void updateUsingUsn(String usn, long number) {
		if (usn != null) {
			dao.updateUsingUsn(usn, number);
		}
	}

	@Override
	public void updateUsingemail(String mail, String branch) {
		if (mail != null) {
			dao.updateUsingemail(mail, branch);
		}
	}

	@Override
	public void deleteUsingusn(String usn) {
		if (usn != null) {
			dao.deleteUsingusn(usn);
		}else{
			System.out.println("no data found");
		}
	}

}
