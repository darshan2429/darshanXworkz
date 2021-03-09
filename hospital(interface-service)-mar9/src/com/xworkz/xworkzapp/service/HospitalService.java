package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dto.HospitalDTO;

public interface HospitalService {
	public boolean validatetoadddata(HospitalDTO dto);
	public void display();
	public void validateTodisplay(String licence,String founder);
	public void validateToupdateUsing(String licence,String phno);
	public void validateTodeleteUsing(String licence);
	

}
