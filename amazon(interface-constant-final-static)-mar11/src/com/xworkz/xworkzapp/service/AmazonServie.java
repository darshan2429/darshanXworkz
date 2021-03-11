package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dto.AmazonMovieDto;

public interface AmazonServie {
	
	String[] subscribers = { "ali", "teertha", "appu", "shivu", "pramod", "dboss", "satya" };
	
	public void validateToLogin(String userName,String pass);
	public void validateToAddmovie(AmazonMovieDto movie);
	public void validateToViewSubscribe(String[] subscriber);
	public void displayMovie();

}
