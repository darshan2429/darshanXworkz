package com.workz.workzapp.movies;

public class MovieOperation {

	public MovieDTO[] dto;
	public int index;

	public MovieOperation(int size) {

		dto = new MovieDTO[size];
	}

	public void addMovie(MovieDTO dto) {

		this.dto[index] = dto;
		index++;
	}

	public void getMovie() {
		for (int i = 0; i < dto.length; i++) {
			System.out.println(dto[i].getMovieId() + " " + dto[i].getMovieName());
		}
	}

	public void fetchMoviebyname(String name) {
		for (int i = 0; i < dto.length; i++) {
			System.out.println("enter the name");
			if (dto[i].getMovieName().equals(name)) {
				System.out.println(name);
			}

		}
	}
}
