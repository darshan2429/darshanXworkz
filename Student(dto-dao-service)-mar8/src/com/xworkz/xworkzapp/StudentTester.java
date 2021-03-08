package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.StudentDTO;
import com.xworkz.xworkzapp.service.StudentService;
import com.xworkz.xworkzapp.service.StudentServiceImpl;

public class StudentTester {

	public static void main(String[] args) {
		StudentDTO dto=new StudentDTO("rekha", "12ABC01", 85698566987l,
				"rekha@gmail.com", "Gulbarga", "ECE");
		StudentDTO dto1=new StudentDTO("Ranju", "12OBC02", 86272777777l,
				"ranjuworkz@gmail.com", "Bengaluru", "CSE");
		
		StudentService impl=new StudentServiceImpl();
		impl.addStudent(dto);
		impl.addStudent(dto1);
		
		impl.displayStudent();
		
		impl.displayUsingStudentName("Ranju");
		
		impl.updateUsingemail("ranjuworkz@gmail.com", "ECE");
		impl.displayStudent();
		
		impl.updateUsingUsn("12ABC01", 1231231230);
		impl.displayStudent();
		
		impl.deleteUsingusn("12ABC01");
		impl.displayStudent();
		
		impl.deleteUsingusn("12OBC02");
		
		
		
		
		
	}

}
