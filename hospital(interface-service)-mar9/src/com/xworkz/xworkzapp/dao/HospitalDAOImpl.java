package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.HospitalDTO;

public class HospitalDAOImpl implements HospitalDAO {

	HospitalDTO dto[] = new HospitalDTO[4];
	int index = 0;

	@Override
	public void addDetails(HospitalDTO dto) {
		this.dto[index] = dto;
		index++;
		System.out.println("data added successfully");
	}

	@Override
	public void displayAll() {
		for (int i = 0; i < index; i++) {
			if (dto[i] != null) {
				System.out.println("licence no : " + dto[i].getLicenceNo());
				System.out.println("Hospital name: " + dto[i].getName());
				System.out.println("Location : " + dto[i].getLocation());
				System.out.println("Founder Name : " + dto[i].getFounder());
				System.out.println("Specialized : " + dto[i].getSpecialized());
				System.out.println("phone no:" + dto[i].getPhoneNo() + "\n");
			}
		}
	}

	@Override
	public void displayUsing(String licence, String founder) {
		System.out.println("inside display method");
		for (int i = 0; i < index; i++) {
			if (dto[i].getLicenceNo().equals(licence) && dto[i].getFounder().equals(founder)) {
				System.out.println("licence no : " + dto[i].getLicenceNo());
				System.out.println("Hospital name: " + dto[i].getName());
				System.out.println("Location : " + dto[i].getLocation());
				System.out.println("Founder Name : " + dto[i].getFounder());
				System.out.println("Specialized : " + dto[i].getSpecialized());
				System.out.println("phone no:" + dto[i].getPhoneNo() + "\n");
			}
		}
	}

	@Override
	public void updateUsing(String licence, String phNo) {
		System.out.println("inside update method");
		for (int i = 0; i < index; i++) {
			if (dto[i].getLicenceNo() == licence) {
				dto[i].setPhoneNo(phNo);
				System.out.println("updated successfully");
			}
		}
	}

	@Override
	public void deleteUsing(String licence) {
		for (int i = 0; i < index; i++) {
			if (dto[i].getLicenceNo() == licence) {
				dto[i] = null;
			}
		}
	}

}
