package com.xworkz.xworkzapp;

import java.util.Scanner;

import com.xworkz.xworkzapp.cricket.Cricket;
import com.xworkz.xworkzapp.cricket.PlayersDTO;

public class gameUtil {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size");
		int size = scan.nextInt();

		Cricket cricket = new Cricket(size);
		for (int i = 0; i < size; i++) {

			System.out.println("enter the name");
			String name = scan.next();
			
			System.out.println("enter the jersey number");
			int jersey = scan.nextInt();
			
			System.out.println("enter the address");
			String address = scan.next();

			PlayersDTO dto = new PlayersDTO();
			dto.setName(name);
			dto.setJerseyNo(jersey);
			dto.setAddress(address);
			cricket.addPlayers(dto);

		}
		cricket.getPlayersDetails();

	}

}
