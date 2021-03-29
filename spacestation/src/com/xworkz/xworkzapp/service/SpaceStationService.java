package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dto.SpaceStationDTO;

public interface SpaceStationService {
	public void validateSpacestationDetails(SpaceStationDTO dto);
	public void validateRemoveSpaceStation(SpaceStationDTO dto);
	public void displayDetails();
	public void validateUpdateMethod(String name,int updatesateliteLaunched);

}
