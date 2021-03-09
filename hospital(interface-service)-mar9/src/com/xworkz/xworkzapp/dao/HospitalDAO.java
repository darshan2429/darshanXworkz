package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.HospitalDTO;

public interface HospitalDAO {
	
	public void addDetails(HospitalDTO dto);
	public void displayAll();
	public void displayUsing(String licence,String founder);
	public void updateUsing(String licence,String phno);
	public void deleteUsing(String licence);
	

}
