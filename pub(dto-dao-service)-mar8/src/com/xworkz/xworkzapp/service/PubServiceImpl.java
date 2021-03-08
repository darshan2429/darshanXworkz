package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dao.PubDAO;
import com.xworkz.xworkzapp.dao.PubDAOImpl;
import com.xworkz.xworkzapp.dto.PubDTO;

public class PubServiceImpl implements PubService {

	PubDAO dao = new PubDAOImpl();
	
	public PubServiceImpl() {
		System.out.println("PubService Constructor is Called!!!!");
	}

	@Override
	public void validateLicenceNumber(PubDTO dto) {
		if (dto.getLicenceNumber() != null) {
			dao.addPubDto(dto);
		}else{
			System.out.println("Licence Number is not valid");
		}
	}

	@Override
	public void displayAll() {
		dao.displyAll();
	}

	@Override
	public void updateEntryFeeUsingGstNO(String gstNo, int entryFee) {
		if(gstNo!=null){
			dao.updateEntryFeeUsingGstNO(gstNo, entryFee);
			dao.displyUsingGstNo(gstNo);
		}
	}

	@Override
	public void displyUsingGstNo(String gstNo) {
		if(gstNo!=null){
			dao.displyUsingGstNo(gstNo);
		}
	}

	@Override
	public void deleteUsingLicenceNo(String licenceNo) {
		if(licenceNo!=null){
			dao.deleteUsingLicenceNo(licenceNo);
		}
	}

	

}
