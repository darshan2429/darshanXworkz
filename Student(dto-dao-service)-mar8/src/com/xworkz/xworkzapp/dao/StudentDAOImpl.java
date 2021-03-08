package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.StudentDTO;

public class StudentDAOImpl implements StudentDAO {
	private StudentDTO studentDto[] = new StudentDTO[2];
	int index = 0;

	public StudentDAOImpl() {
		System.out.println("inside StudentDAOImpl object created");
	}

	@Override
	public void addStudent(StudentDTO dto) {
		System.out.println("inside adding method");
		studentDto[index] = dto;
		index++;
		System.out.println("data added successfully");
	}

	@Override
	public void displayStudent() {
		for (int i = 0; i < index; i++) {
			System.out.println("\nname: " + studentDto[i].getStudentName() + "\nusn:" + studentDto[i].getUsn()
					+ "\nmobileNO:" + studentDto[i].getMobileNo() + "\nEmail:" + studentDto[i].getEmail() + "\nAddress:"
					+ studentDto[i].getAddress() + "\nBranch:" + studentDto[i].getBranch());

		}

	}

	@Override
	public void displayUsingStudentName(String name) {
		for (int i = 0; i < index; i++) {
			if (studentDto[i].getStudentName() == name) {
				System.out.println("\nname: " + studentDto[i].getStudentName() + "\nusn:" + studentDto[i].getUsn()
						+ "\nmobileNO:" + studentDto[i].getMobileNo() + "\nEmail:" + studentDto[i].getEmail()
						+ "\nAddress:" + studentDto[i].getAddress() + "\nBranch:" + studentDto[i].getBranch());
			}
		}
	}

	@Override
	public void updateUsingUsn(String usn, long number) {
		for (int i = 0; i < index; i++) {
			if (studentDto[i].getUsn() == usn) {
				studentDto[i].setMobileNo(number);
				System.out.println("updated number successfully");
			}
		}
	}

	@Override
	public void updateUsingemail(String mail, String branch) {
		for (int i = 0; i < index; i++) {
			if (studentDto[i].getEmail() == mail) {
				studentDto[i].setBranch(branch);
				System.out.println("updated branch successfully");
			}
		}
	}

	@Override
	public void deleteUsingusn(String usn) {
		for (int i = 0; i < index; i++) {
			if (studentDto[i].getUsn() == usn) {
				studentDto[i] = null;
				System.out.println("deleted successfully");

			}
		}
	}
}
