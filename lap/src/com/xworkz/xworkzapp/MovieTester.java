package com.xworkz.xworkzapp;

import java.util.Scanner;

import com.xworkz.xworkzapp.movie.MovieDTO;
import com.xworkz.xworkzapp.movie.MovieOperationDAO;

public class MovieTester {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		
		MovieOperationDAO dao=new MovieOperationDAO(size);
		for (int i = 0; i <size; i++) {
			System.out.println("enter movie name");
			String mvName=sc.next();
			System.out.println("enter movie id");
			int mvId=sc.nextInt();
			
			MovieDTO dto=new MovieDTO();
			dto.setMvId(mvId);
			dto.setMvName(mvName);
			dao.addDetails(dto);
			
		}
		
		dao.getDetails();
	}

}
