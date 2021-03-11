package com.xworkz.xworkzapp.dto;

public class AmazonMovieDto {
	private String movieTime;
	private String movieName;
	private int noOfSongs;

	public AmazonMovieDto(String movieTime, String movieName, int noOfSongs) {
		this.movieTime = movieTime;
		this.movieName = movieName;
		this.noOfSongs = noOfSongs;
	}

	public String getMovieTime() {
		return movieTime;
	}

	public void setMovieTime(String movieTime) {
		this.movieTime = movieTime;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getNoOfSongs() {
		return noOfSongs;
	}

	public void setNoOfSongs(int noOfSongs) {
		this.noOfSongs = noOfSongs;
	}

}
