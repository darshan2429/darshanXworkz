package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.PubDTO;
import com.xworkz.xworkzapp.service.PubService;
import com.xworkz.xworkzapp.service.PubServiceImpl;

public class PubTester {
	public static void main(String[] args) {
		PubDTO dto=new PubDTO("12AB", "123ABC", "Tipsy", "Koramangala", 20, 1500);
		PubDTO dto1=new PubDTO("23CD", "456DEF", "story", "rajajinagar", 15, 500);
		PubDTO dto2=new PubDTO("34EF", "789GHI", "three dot and dash", "vijaynagar", 25, 1000);
		PubService pubService=new PubServiceImpl();
		pubService.validateLicenceNumber(dto);
		pubService.validateLicenceNumber(dto1);
		pubService.validateLicenceNumber(dto2);
		pubService.displayAll();
		
		pubService.updateEntryFeeUsingGstNO("123ABC", 2500);
		
		pubService.displyUsingGstNo("789GHI");
		
		pubService.deleteUsingLicenceNo("23CD");
		pubService.displayAll();
		
	}

}
