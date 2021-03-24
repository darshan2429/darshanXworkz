package com.xworkz.olympic;

import com.xworkz.olympic.dto.OlympicDto;

public class Olympictester1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		OlympicDto olympic=new OlympicDto("england", 1908, true);
		
		Object object=olympic.clone();
		System.out.println(object);
		OlympicDto clone=(OlympicDto)object;
		System.out.println(clone.getCountryHosted());
		System.out.println(clone.getYear());
		System.out.println(clone.isCompleted());
	}

}
