package com.xworkz.sewing.service;

import com.xworkz.sewing.dao.SewingMachineDAO;
import com.xworkz.sewing.dao.SewingMachineDAOImpl;
import com.xworkz.sewing.dto.SewingMachineDTO;

public class SewingMachineServiceImpl implements SewingMachineService {

	SewingMachineDAO sewing = new SewingMachineDAOImpl();

	public void validateSewingMachine(SewingMachineDTO dto) {
		Boolean validate = true;

		if (dto.getName() == null || dto.getName().length() < 4) {
			System.out.println("Invalid SewingMachine Name");
			validate = false;
		}

		if (dto.getModelNo() == null || dto.getModelNo().length() < 4) {
			System.out.println("Invalid SewingMachine Model");
			validate = false;
		}

		if (dto.getPrice() == 0 || dto.getPrice() < 5000) {
			System.out.println("Invalid SewingMachine Price");
			validate = false;
		}

		if (validate) {
			sewing.addSewingMachineDetails(dto);
			System.out.println("Added Details Successfully");
		}

	}

	public void validateSewingMachinedisplay() {
		sewing.displaySewingMachineDetails();
		System.out.println("Fetched Details From DB");
	}
}
