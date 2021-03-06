package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.music.MusicApp;
import com.xworkz.xworkzapp.music.Spotify;

public class MUsicTester {
	public static void main(String[] args) {
		
		MusicApp spotify = new Spotify();
		String song=spotify.searchSong();
		System.out.println(spotify.getLang()+"  "+spotify.getSize()+ "  "+ song);
	}

}
