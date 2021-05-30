package com.xworkz.facebook.dao;

import com.xworkz.facebook.dto.FacebookDTO;

public interface FacebookDAO {
	
	public void addDetails(FacebookDTO dto);
	
	public void displayFacebookDetails();
	
	public void updateMobileNoUsingFacebookId(int id, String mobileNo);
	
	public void deleteFacebookDetailsUsingFacebookId(int id);
	
	
	

}
