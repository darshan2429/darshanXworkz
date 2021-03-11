package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dao.AmazonDao;
import com.xworkz.xworkzapp.dao.AmazonDaoImpl;
import com.xworkz.xworkzapp.dto.AmazonMovieDto;
import com.xworkz.xworkzapp.service.AmazonServiceImpl;
import com.xworkz.xworkzapp.service.AmazonServie;

public class AmazonTester {
	public static void main(String[] args) {
		AmazonServie impl = new AmazonServiceImpl();
		impl.validateToLogin("admin@amazon.com", "admin123");

		AmazonMovieDto dto = new AmazonMovieDto("Robert", "2:45min", 4);
		AmazonMovieDto dto1 = new AmazonMovieDto("Hero", "2:15min", 3);
		AmazonMovieDto dto2 = new AmazonMovieDto("Ohm", "2:35min", 6);

		impl.validateToAddmovie(dto);
		impl.validateToAddmovie(dto1);
		impl.validateToAddmovie(dto2);

		impl.displayMovie();
		String[] subscribers = { "ali", "teertha", "appu", "shivu", "pramod", "dboss", "satya" };
		impl.validateToViewSubscribe(subscribers);

	}

}
