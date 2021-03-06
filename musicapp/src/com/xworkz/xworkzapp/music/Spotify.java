package com.xworkz.xworkzapp.music;

public class Spotify extends MusicApp {

	public Spotify() {
		super();
		System.out.println("spotify object is created");
		// TODO Auto-generated constructor stub
	}

	public Spotify(String size, String lang) {
		super(size, lang);
		System.out.println("spotify object is created");

	}

	@Override
	public String searchSong() {
		return "manase karagada";
	}

}
