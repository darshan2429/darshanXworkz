package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dao.SpaceStationDAO;
import com.xworkz.xworkzapp.dao.SpaceStationDAOImpl;
import com.xworkz.xworkzapp.dto.SpaceStationDTO;
import com.xworkz.xworkzapp.exceptiion.InvalidSpaceStationDetails;
import com.xworkz.xworkzapp.exceptiion.InvalidStelite;
import com.xworkz.xworkzapp.exceptiion.LocationException;
import com.xworkz.xworkzapp.exceptiion.UndefinedNameException;
import com.xworkz.xworkzapp.exceptiion.invalidSpaceStationIdException;

public class SpaceStationServiceImpl implements SpaceStationService {
	SpaceStationDAO space = new SpaceStationDAOImpl();

	@Override
	public void validateSpacestationDetails(SpaceStationDTO dto) {
		boolean isValidate = true;
		try {
			if (dto.getName() == null || dto.getName().length() < 2) {
				isValidate = false;
				throw new UndefinedNameException("undefined name");
			}
			if (dto.getLocation() == null || dto.getLocation().length() < 2) {
				isValidate = false;
				throw new LocationException("invalid location");

			}
			if (dto.getSpaceStationId() == 0) {
				isValidate = false;
				throw new invalidSpaceStationIdException("invalid Space Station Id");
			}
			if (dto.getNoOfSateliteLaunched() == 0) {
				isValidate = false;
				throw new InvalidStelite("invalid rocket launched details");
			}
			if (isValidate) {
				space.addSapaceStation(dto);
			}

		} catch (UndefinedNameException e) {
			System.out.println("invalid Space Station Name");
		} catch (LocationException e) {
			System.out.println("invalid Space Station location");
		} catch (invalidSpaceStationIdException e) {
			System.out.println("invalid Space StationId");
		} catch (InvalidStelite e) {
			System.out.println("invalid no of satelite");
		}

	}

	@Override
	public void validateRemoveSpaceStation(SpaceStationDTO dto) {
		try {
			if (dto != null) {
				space.removeSpaceStation(dto);
			} else {
				throw new InvalidSpaceStationDetails("please enter proper details");
			}
		} catch (InvalidSpaceStationDetails e) {
			System.out.println("please enter valid details to remove");
		}
	}

	@Override
	public void displayDetails() {
		space.displayStation();
	}

	@Override
	public void validateUpdateMethod(String name, int updatesateliteLaunched) {
		try {
			if (name != null && updatesateliteLaunched != 0) {
				space.updateNumberSateliteLaunchBySpaceId(updatesateliteLaunched, name);
			} else {
				throw new UndefinedNameException("invalid name to update");
			}

		} catch (UndefinedNameException e) {
			System.out.println("invalid name ");
		}

	}

}
