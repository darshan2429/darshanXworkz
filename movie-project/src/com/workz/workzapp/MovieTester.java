package com.workz.workzapp;

import java.util.Scanner;

import com.workz.workzapp.movies.MovieDTO;
import com.workz.workzapp.movies.MovieOperation;

public class MovieTester {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the no of movies");
		int size=sc.nextInt();

		MovieOperation movieOperation=new MovieOperation(size);		
		for (int i = 0; i < size; i++) {
			System.out.println("enter the movieID");
			int movieId=sc.nextInt();
			System.out.println("enter the movie name");
			String movieName=sc.next();
			
			MovieDTO movie=new MovieDTO();
			
			
			movieOperation.addMovie(movie);
		}
		
		
		
		
		
		
		movieOperation.getMovie();
		
	}

}
