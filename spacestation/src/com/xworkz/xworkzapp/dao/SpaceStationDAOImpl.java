package com.xworkz.xworkzapp.dao;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import com.xworkz.xworkzapp.dto.SpaceStationDTO;
import com.xworkz.xworkzapp.exceptiion.UndefinedNameException;

public class SpaceStationDAOImpl implements SpaceStationDAO {
	List space = new ArrayList();

	@Override
	public void addSapaceStation(SpaceStationDTO dto) {
		space.add(dto);
		System.out.println("adding list successfully the size is :" + space.size());
	}

	@Override
	public void removeSpaceStation(SpaceStationDTO dto) {
		space.remove(dto);
		System.out.println("removing successfully the size is : " + space.size());
	}

	@Override
	public void displayStation() {
		Iterator iterator = space.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	@Override
	public void updateNumberSateliteLaunchBySpaceId(int noOfRockets, String name) {
		Iterator iterator = space.iterator();
		try {
			while (iterator.hasNext()) {
				SpaceStationDTO station = (SpaceStationDTO) iterator.next();
				if (station.getName().equals(name)) {
					station.setNoOfSateliteLaunched(noOfRockets);
				} else {
					throw new UndefinedNameException("undefined name");
				}
			}
		} catch (UndefinedNameException e) {
			System.out.println("invalid name ");
		}

	}

}
