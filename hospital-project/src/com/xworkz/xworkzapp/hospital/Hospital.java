package com.xworkz.xworkzapp.hospital;

public class Hospital {

	private String hospitalName="NIMANS";
	public PatientsDTO[] patient ;
	int index;
	
	public Hospital(int size) {
		patient = new PatientsDTO[size];
		// TODO Auto-generated constructor stub
	}

	public void addPatients(PatientsDTO patientsDTO) {
		if(patientsDTO.getName() != null)
		
		patient[index++] = patientsDTO ;

	}
	
	public void getPatientsDetails() {
		System.out.println(hospitalName);
		for (int i = 0; i < patient.length; i++) {
			System.out.println(patient[i].getPatientsId()+"  "+patient[i].getName()+"  "
		                    +patient[i].getAddress());
			
		}
		
	}

}
