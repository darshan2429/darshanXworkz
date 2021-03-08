package com.xworkz.xworkzapp.tester;

import java.util.Scanner;

import com.xworkz.xworkzapp.dao.TvDao;
import com.xworkz.xworkzapp.dao.TvDaoImpl;
import com.xworkz.xworkzapp.dto.TvDto;

public class TvTester {

	public static void main(String[] args) {
		
		
		TvDaoImpl daoImpl=new TvDaoImpl();
		
		TvDto dto=new TvDto(12334, "SAMSUNG", 45.1, "Xperia", 45000);
		daoImpl.addTvObject(dto);
		daoImpl.displayTvObject();
		
		daoImpl.updateTvprice(12334, "Xperia-Pro");
		daoImpl.displayTvObject();
		
		daoImpl.deleteTv(12334);
		daoImpl.displayTvObject();
	}
	
}
