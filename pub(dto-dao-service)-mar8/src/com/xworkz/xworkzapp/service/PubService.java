package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dto.PubDTO;

public interface PubService {
	public void validateLicenceNumber(PubDTO dto);
	public void displayAll();
	public void updateEntryFeeUsingGstNO(String gstNo,int entryFee);
	public void displyUsingGstNo(String gstNo);
	public void deleteUsingLicenceNo(String licenceNo);

}
