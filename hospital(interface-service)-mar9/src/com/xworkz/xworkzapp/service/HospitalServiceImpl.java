package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dao.HospitalDAO;
import com.xworkz.xworkzapp.dao.HospitalDAOImpl;
import com.xworkz.xworkzapp.dto.HospitalDTO;

public class HospitalServiceImpl implements HospitalService {

	HospitalDAO dao = new HospitalDAOImpl();

	@Override
	public boolean validatetoadddata(HospitalDTO dto) {
		boolean isValidData = true;
		if (dto.getLicenceNo() == null || dto.getLicenceNo().length() != 8) {
			System.out.println("invalid licence No");
			isValidData = false;
			return isValidData;
		}
		if (dto.getName() == null || dto.getName().length() < 6) {
			System.out.println("invalid name");
			isValidData = false;
			return isValidData;
		}
		if (dto.getLocation() == null || dto.getLocation().length() < 4) {
			System.out.println("invalid location");
			isValidData = false;
			return isValidData;
		}
		if (dto.getFounder() == null || dto.getFounder().length() < 4) {
			System.out.println("invalid name");
			isValidData = false;
			return isValidData;
		}
		if (dto.getSpecialized() == null || dto.getSpecialized().length() < 3) {
			System.out.println("invalid name");
			isValidData = false;
			return isValidData;
		}
		if (dto.getPhoneNo() == null || dto.getPhoneNo().length() != 10) {
			System.out.println("invalid name");
			isValidData = false;
			return isValidData;
		}
		if (isValidData) {
			dao.addDetails(dto);
		}
		return isValidData;

	}

	@Override
	public void display() {
		dao.displayAll();

	}

	@Override
	public void validateTodisplay(String licence, String founder) {
		if (licence!=null || founder!=null) {
			dao.displayUsing(licence, founder);
		}else{
			System.out.println("invalid input");		
		}
	}

	@Override
	public void validateToupdateUsing(String licence, String phno) {
		if (licence!=null || phno!=null) {
			dao.updateUsing(licence, phno);;
		}else{
			System.out.println("invalid input");		
		}
	}

	@Override
	public void validateTodeleteUsing(String licence) {
		if (licence!=null) {
			dao.deleteUsing(licence);
		}else{
			System.out.println("invalid input");		
		}
	}
	
	

}
