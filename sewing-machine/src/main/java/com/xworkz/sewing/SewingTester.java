package com.xworkz.sewing;

import com.xworkz.sewing.dto.SewingMachineDTO;
import com.xworkz.sewing.service.SewingMachineServiceImpl;

public class SewingTester {
	
	public static void main(String[] args) {
		
		
		SewingMachineServiceImpl sewingMachineServiceImpl = new SewingMachineServiceImpl();
		
		SewingMachineDTO sewingMachineDTO = new SewingMachineDTO("A-Movers", "A00G1", 20000);
		
		sewingMachineServiceImpl.validateSewingMachine(sewingMachineDTO);
		sewingMachineServiceImpl.validateSewingMachinedisplay();
		
	}

}
