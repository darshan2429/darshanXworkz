package com.xworkz.wineshop;

import com.xworkz.wineshop.dto.WineShop;

public class WineShopTester {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		WineShop shop=new WineShop("venna", 4562, "vijaynagar");
		WineShop shop1=new WineShop("balaji", 4562, "nagarbhavi");
		
		Object object=shop.clone();
		WineShop clone=(WineShop)object;
		
		if(shop.equals(clone) && shop.getGstNo()==clone.getGstNo()){
			System.out.println("same");
		}else{
			System.out.println("not same");
		}
	}

}
