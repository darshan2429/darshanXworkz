package com.xworkz.xworkzapp.dao;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import com.xworkz.xworkzapp.dto.AmazonMovieDto;

public class AmazonDaoImpl implements AmazonDao {

	AmazonMovieDto[] dto = new AmazonMovieDto[3];
	int index = 0;


	@Override
	public void login(String userName, String password) {
		if (AmazonDao.userName.equals(userName) && AmazonDao.password.equals(password)) {
			System.out.println("Welcomw To Amazon prime Videos\n");
			AmazonDao.super.displayDate();
		} else
			System.out.println("invalid credentials");
	}

	@Override
	public void addMoive(AmazonMovieDto movie) {
		dto[index] = movie;
		index++;
	}

	@Override
	public void displayMovie() {
		for (int i = 0; i < dto.length; i++) {
			if(dto[i]!=null)
			System.out.println("Movie Name: " + dto[i].getMovieName());
			System.out.println("Movie Timings: " + dto[i].getMovieTime());
			System.out.println("No Of Songs: " + dto[i].getNoOfSongs()+"\n");
		}
	}

	@Override
	public void viewSubscribers(String[] subscribers) {
		System.out.print("subscribers : ");
		for (int i = 0; i < subscribers.length; i++) {	
			System.out.print(subscribers[i]+", " );
		}
	}

}
