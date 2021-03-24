package com.xworkz.shop;

import com.xworkz.shop.dto.Shop;

public class ShopTester {
	public static void main(String[] args) throws CloneNotSupportedException {
		Shop shop=new Shop("manjunatha", "rajajinagar", "electric", "manja");
		Shop shop1=new Shop("ganesha", "rajajinagar", "tea-shop", "ganesha");
		
		Object object=shop.clone();
		Shop clone=(Shop)object;
		if(shop.equals(clone)){//clone reference is a copy of an shop
			System.out.println("same");
		}else{
			System.out.println("not same");
		}
	}

}
