package com.xworkz.xworkzapp.stadium;

public class StadiumDaoImplimented implements StadiumDao {

	StadiumDTO stadiunDto[] = new StadiumDTO[1];

	@Override
	public void addStadium(StadiumDTO stadium) {
		for (int i = 0; i < stadiunDto.length; i++) {

			stadiunDto[i] = stadium;
			System.out.println("add details successfully");
		}
	}

	@Override
	public void getStadiumDetails() {
		for (int i = 0; i < stadiunDto.length; i++) {
			System.out.println(stadiunDto[i].getName() + " " + stadiunDto[i].getStadiumId() + " "
					+ stadiunDto[i].getLocation() + " " + stadiunDto[i].getCapacity());
		}

	}
	@Override
	public void delete(int id) {
		for (int i = 0; i < stadiunDto.length; i++) {
			if (stadiunDto[i].getStadiumId() == id)
				stadiunDto[i] = null;
		}
	}

}
