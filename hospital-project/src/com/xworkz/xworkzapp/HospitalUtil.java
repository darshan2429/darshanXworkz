package com.xworkz.xworkzapp;

import java.util.Scanner;

import com.xworkz.xworkzapp.hospital.Hospital;
import com.xworkz.xworkzapp.hospital.PatientsDTO;

public class HospitalUtil {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();

		Hospital hospital = new Hospital(size);

		for (int i = 0; i < size; i++) {

			System.out.println("enter the PatientId");
			int patientId = sc.nextInt();

			System.out.println("enter the name");
			String name = sc.next();

			System.out.println("enter the address");
			String address = sc.next();

			PatientsDTO patient = new PatientsDTO();
			patient.setPatientsId(patientId);
			patient.setName(name);
			patient.setAddress(address);
			hospital.addPatients(patient);

		}

		hospital.getPatientsDetails();

	}

}
