package com.xworkz.xworkzapp.dto;

public class SpaceStationDTO {

	private String name;
	private int spaceStationId;
	private String location;
	private int noOfSateliteLaunched;

	public SpaceStationDTO(String name, int spaceStationId, String location, int noOfSateliteLaunched) {
		super();
		this.name = name;
		this.spaceStationId = spaceStationId;
		this.location = location;
		this.noOfSateliteLaunched = noOfSateliteLaunched;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpaceStationId() {
		return spaceStationId;
	}

	public void setSpaceStationId(int spaceStationId) {
		this.spaceStationId = spaceStationId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfSateliteLaunched() {
		return noOfSateliteLaunched;
	}

	public void setNoOfSateliteLaunched(int noOfSateliteLaunched) {
		this.noOfSateliteLaunched = noOfSateliteLaunched;
	}

	@Override
	public String toString() {
		return "************************************************\n"
				+ "name=" + name + "\nspaceStationId=" + spaceStationId + 
				"\nlocation=" + location
				+ "\nnoOfSateliteLaunched=" + noOfSateliteLaunched +
				"\n*************************************************";
	}

	
}
