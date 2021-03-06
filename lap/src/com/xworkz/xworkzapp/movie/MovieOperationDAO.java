package com.xworkz.xworkzapp.movie;

public class MovieOperationDAO {

	public MovieDTO[] movie;
	public int index;

	public MovieOperationDAO(int size) {
		movie = new MovieDTO[size];
	}

	public void addDetails(MovieDTO dto) {
		movie[index++] = dto;
	}

	public void getDetails() {
		for (int i = 0; i < movie.length; i++)
			System.out.println(movie[i].getMvId() + " " + movie[i].getMvName());
	}
	
}
