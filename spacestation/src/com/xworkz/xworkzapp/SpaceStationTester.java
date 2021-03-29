package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dao.SpaceStationDAO;
import com.xworkz.xworkzapp.dao.SpaceStationDAOImpl;
import com.xworkz.xworkzapp.dto.SpaceStationDTO;
import com.xworkz.xworkzapp.service.SpaceStationService;
import com.xworkz.xworkzapp.service.SpaceStationServiceImpl;

public class SpaceStationTester {
	public static void main(String[] args) {
		System.out.println("program started");
		SpaceStationService service = new SpaceStationServiceImpl();

		SpaceStationDTO dto = new SpaceStationDTO("ISRO", 1122, "Bengaluru", 80);
		SpaceStationDTO dto1 = new SpaceStationDTO("NASA", 2255, "USA", 130);
		SpaceStationDTO dto2 = new SpaceStationDTO("Skylab", 2233, "USA", 50);

		service.validateSpacestationDetails(dto);
		service.validateSpacestationDetails(dto1);
		service.validateSpacestationDetails(dto2);
		service.displayDetails();
		
		service.validateRemoveSpaceStation(dto2);
		service.displayDetails();
		
		service.validateUpdateMethod("NASA", 180);
		service.displayDetails();
		
		System.out.println("program ended");
	}

}
