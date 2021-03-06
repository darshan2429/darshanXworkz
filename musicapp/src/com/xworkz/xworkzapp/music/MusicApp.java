package com.xworkz.xworkzapp.music;

public class MusicApp {
//	instance variable
	private String size;
	private String lang;
	
	public MusicApp() {
		this("17MB ", "tamil ");
	}
	
	public MusicApp(String size , String lang ) {
		this.lang=lang;
		this.size=size;
		System.out.println("music object is created");
		
		// TODO Auto-generated constructor stub
	}

	public String searchSong() {
		System.out.println("search the songs by artest");
		return null;

	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getSize() {
		return size;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getLang() {
		return lang;
	}
	

}
