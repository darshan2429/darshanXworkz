package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.PubDTO;

public interface PubDAO {
	public void addPubDto(PubDTO dto);
	public void  displyAll();
	public void updateEntryFeeUsingGstNO(String gstNo,int entryFee);
	public void displyUsingGstNo(String gstNo);
	public void deleteUsingLicenceNo(String licenceNo);
	
}
