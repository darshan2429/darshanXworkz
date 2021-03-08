package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.TvDto;

public interface TvDao {
	public void addTvObject(TvDto dto);
	public void displayTvObject();
	public void updateTvprice(int imeiNo,String newModel);
	public void deleteTv(int imeiNo);

}
