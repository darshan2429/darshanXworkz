package com.xworkz.name;

import com.xworkz.name.dto.NameDTO;

public class NmaeTester {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		NameDTO nameDTO = new NameDTO("darshan", "n", "b", "basavaraj", "nb");
		NameDTO nameDTO1 = new NameDTO("santhosh", "kumar", "n v", "venkatesh", "pramod sheetty");
		
		Object object=nameDTO.clone();
		NameDTO clone=(NameDTO)object;
		System.out.println(nameDTO.hashCode());
		System.out.println(clone.hashCode());
		if(nameDTO.equals(nameDTO1)){
			System.out.println("same");
		}else{
			System.out.println("not same");
		}
		
	
	
	}

}
