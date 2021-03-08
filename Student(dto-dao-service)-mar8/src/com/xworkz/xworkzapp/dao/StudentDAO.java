package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.StudentDTO;

public interface StudentDAO {
	public void addStudent(StudentDTO dto);
	public void displayStudent();
	public void displayUsingStudentName(String name);
	public void updateUsingUsn(String usn,long number);
	public void updateUsingemail(String mail, String branch);
	public void deleteUsingusn(String usn);
	

}
