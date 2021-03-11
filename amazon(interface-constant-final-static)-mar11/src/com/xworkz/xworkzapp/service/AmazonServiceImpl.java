package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dao.AmazonDao;
import com.xworkz.xworkzapp.dao.AmazonDaoImpl;
import com.xworkz.xworkzapp.dto.AmazonMovieDto;

public class AmazonServiceImpl implements AmazonServie {

	AmazonDao amazon = new AmazonDaoImpl();

	@Override
	public void validateToLogin(String userName, String password) {
		if (password.length() >= 6 && userName != null 
				&& userName.contains("@") && userName.contains(".com")) {
			amazon.login(userName, password);
		}else
			System.out.println("enter valid credential");
	}

	@Override
	public void validateToAddmovie(AmazonMovieDto movie) {
		if(movie!=null){
			amazon.addMoive(movie);
		}else
			System.out.println("invalid input");
	}

	@Override
	public void validateToViewSubscribe(String[] subscriber) {
		if(subscriber!=null){
			amazon.viewSubscribers(subscriber);
		}
	}

	@Override
	public void displayMovie() {
		amazon.displayMovie();
	}

}
