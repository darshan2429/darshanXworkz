package com.xworkz.xworkzapp.dao;

import java.util.Date;

import com.xworkz.xworkzapp.dto.AmazonMovieDto;

public interface AmazonDao {
	
	static final String userName="admin@amazon.com";
	static final String password="admin123";
	
	public void login(String userName,String password);
	public void addMoive(AmazonMovieDto movie);
	public void displayMovie();
	public void viewSubscribers(String[] subscribers);
	
	
	default void displayDate(){
		System.out.println(new Date());
	}

}
