package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.SpaceStationDTO;

public interface SpaceStationDAO {
	public void addSapaceStation(SpaceStationDTO dto);
	public void removeSpaceStation(SpaceStationDTO dto);
	public void displayStation();
	public void updateNumberSateliteLaunchBySpaceId(int satelite, String name);
}
