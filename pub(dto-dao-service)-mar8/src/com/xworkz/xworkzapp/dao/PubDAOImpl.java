package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.PubDTO;

public class PubDAOImpl implements PubDAO {

	private PubDTO pubdetails[] = new PubDTO[3];
	int index = 0;

	public PubDAOImpl() {
		System.out.println("PubDAO Constructor is called!!!!!");
	}

	@Override
	public void addPubDto(PubDTO dto) {
		pubdetails[index] = dto;
		index++;
		System.out.println("data added successfully");
	}

	@Override
	public void displyAll() {
		for (int i = 0; i < index; i++) {
			if (pubdetails[i] != null) {
				System.out.println("\npub licence no:" + pubdetails[i].getLicenceNumber() + "\n pub gst no: "
						+ pubdetails[i].getGstNumber() + "\n pub Name : " + pubdetails[i].getName()
						+ "\n pub location : " + pubdetails[i].getLocation() + "\n pub No of Tables : "
						+ pubdetails[i].getNoOfTables() + "\n pub entry fee : " + pubdetails[i].getEntryFees());
			}
		}
	}

	@Override
	public void updateEntryFeeUsingGstNO(String gstNo, int entryFee) {
		System.out.println("inside update method");
		for (int i = 0; i < index; i++) {
			if (pubdetails[i].getGstNumber() == gstNo) {
				pubdetails[i].setEntryFees(entryFee);
				System.out.println("updated successfully");
			}
		}
	}

	@Override
	public void displyUsingGstNo(String gstNo) {
		for (int i = 0; i < index; i++) {
			if (pubdetails[i].getGstNumber() == gstNo) {
				System.out.println("\npub licence no:" + pubdetails[i].getLicenceNumber() + "\n pub gst no: "
						+ pubdetails[i].getGstNumber() + "\n pub Name : " + pubdetails[i].getName()
						+ "\n pub location : " + pubdetails[i].getLocation() + "\n pub No of Tables : "
						+ pubdetails[i].getNoOfTables() + "\n pub entry fee : " + pubdetails[i].getEntryFees());
			}
		}
	}

	@Override
	public void deleteUsingLicenceNo(String licenceNo) {
		System.out.println("");
		for (int i = 0; i < index; i++) {
			if (pubdetails[i].getLicenceNumber() == licenceNo) {
				pubdetails[i] = null;
			}
		}
	}
}
