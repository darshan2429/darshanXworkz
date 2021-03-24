package com.xworkz.olympic.dto;

public class OlympicDto implements Cloneable{

	private String countryHosted;
	private int year;
	private boolean completed;

	public OlympicDto(String countryHosted, int year, boolean completed) {
		super();
		this.countryHosted = countryHosted;
		this.year = year;
		this.completed = completed;
	}
	public OlympicDto() {
		System.out.println("olympic objected is created");
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		System.out.println("invoke clone method into OlympicDto");
		return super.clone();
	}

	public String getCountryHosted() {
		return countryHosted;
	}

	public int getYear() {
		return year;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCountryHosted(String countryHosted) {
		this.countryHosted = countryHosted;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;

		if (obj instanceof OlympicDto) {
			OlympicDto olympic = (OlympicDto) obj;
			if (olympic.year == this.year) {
				System.out.println("olympic is equal");
				return true;
			} else {
				System.out.println("olympic not is equal");
			}

		}
		return false;

	}

	

}
