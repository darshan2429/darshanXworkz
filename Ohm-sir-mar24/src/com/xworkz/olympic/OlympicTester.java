package com.xworkz.olympic;

import com.xworkz.olympic.dto.OlympicDto;

public class OlympicTester {

	public static void main(String[] args) {

		OlympicDto dto = new OlympicDto("greece", 1986, true);
		OlympicDto dto1 = new OlympicDto("france", 1900, true);

		if (dto.equals(dto1)) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}

		System.out.println(dto.hashCode());
		System.out.println(dto1.hashCode());
		
		
	}

}
