package com.xworkz.school.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.school.dto.SchoolDTO;

public class SchoolDAOImpl implements SchoolDAO {

	private List<SchoolDTO> school;

	/**
	 * @param school
	 */
	public SchoolDAOImpl() {
		this.school = new ArrayList<>();
	}

	@Override
	public void save(SchoolDTO dto) {
		System.out.println("Invoked save method");
		boolean added = false;
		boolean contains = this.school.contains(dto);
		if (!contains) {
			added = this.school.add(dto);
		}
		if (added) {
			System.out.println("School added ");
		} else {
			System.out.println("School already exist");
		}
	}

	@Override
	public SchoolDTO findBySchoolName(String schoolName) {
		System.out.println("Invoked findBySchoolName");
		for (SchoolDTO schoolsdtos : this.school) {
			String nameOfTheSchool = schoolsdtos.getNameOfTheSchool();
			if (nameOfTheSchool.equals(schoolName)) {
				return schoolsdtos;
			}

		}
		return null;
	}

	@Override
	public boolean updateAddressUsingSchoolName(String schoolName, String address) {
		System.out.println("Invoked updateAddressUsingSchoolName");
		SchoolDTO findBySchoolName = this.findBySchoolName(schoolName);
		if (schoolName != null && !schoolName.contains(" ") && !schoolName.isEmpty()
				&& findBySchoolName.equals(address)) {
			findBySchoolName.setAddressOfTheSchool(address);
			System.out.println("School found can update");
			return true;
		} else {
			System.out.println("School not  found , cannot update");
		}
		return false;
	}

	@Override
	public boolean deleteUsingSchholName(String schoolName) {
		System.out.println("Invoked deleteUsingSchholName");
		ListIterator<SchoolDTO> listIterator = this.school.listIterator();
		while (listIterator.hasNext()) {
			SchoolDTO dto = listIterator.next();
			if (dto.getNameOfTheSchool().equals(schoolName)) {
				listIterator.remove();
				System.out.println("School found can remove");
				return true;
			}
		}
		System.out.println("School name not found cannot delete");
		return false;
	}

}
