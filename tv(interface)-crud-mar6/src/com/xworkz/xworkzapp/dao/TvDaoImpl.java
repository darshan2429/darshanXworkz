package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dao.TvDao;
import com.xworkz.xworkzapp.dto.TvDto;

public class TvDaoImpl implements TvDao {

	TvDto[] tvDto = new TvDto[5];

	@Override
	public void addTvObject(TvDto dto) {

		tvDto[0] = dto;
		System.out.println("object added successfully");

	}

	@Override
	public void displayTvObject() {
		if(tvDto[0]!=null){
		System.out.println("BrandName:" + tvDto[0].getBrandName() + "\nIMEINO: " + tvDto[0].getImeiNo() + "\nMODEL: "
				+ tvDto[0].getModel() + "\n PRICE :" + tvDto[0].getPrice() + "\nRESOLUTION: "
				+ tvDto[0].getResolution());
		}
		else{
			System.out.println("empty");
		}
	}

	@Override
	public void updateTvprice(int imei, String model) {
		System.out.println("\ninside the update method");
		if (tvDto[0].getImeiNo() == imei) {
			tvDto[0].setModel(model);
		} else {
			System.out.println("imei number is not matching ! update is unsuccessfully");
		}

	}

	@Override
	public void deleteTv(int imeiNo) {
		System.out.println("inside deleted method");
		if (tvDto[0].getImeiNo() == imeiNo) {
			tvDto[0] = null;
			System.out.println("deleted successfully");
		} else {
			System.out.println("imei number is not matching ! ");
		}
	}

}
