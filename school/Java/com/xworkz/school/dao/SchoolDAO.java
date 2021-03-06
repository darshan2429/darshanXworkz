package com.xworkz.school.dao;

import com.xworkz.school.dto.SchoolDTO;

public interface SchoolDAO {

	void save(SchoolDTO dto);

	SchoolDTO findBySchoolName(String schoolName);

	boolean updateAddressUsingSchoolName(String schoolName, String address);

	boolean deleteUsingSchholName(String schoolName);
	
	
	
}
