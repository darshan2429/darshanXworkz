package com.xworkz.shop.dto;

public class Shop implements Cloneable {
	
	private String shopName;
	private String location;
	private String type;
	private String ownerName;
	
	public Shop(String shopName, String location, String type, String ownerName) {
		super();
		this.shopName = shopName;
		this.location = location;
		this.type = type;
		this.ownerName = ownerName;
	}

	public String getShopName() {
		return shopName;
	}

	public String getLocation() {
		return location;
	}

	public String getType() {
		return type;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj==null)return false;
		if(obj instanceof Shop){
			Shop shop=(Shop)obj;
			if(shop.ownerName.equals(ownerName)){
				System.out.println("owner name is equal");
				return true;
			}else{
				System.out.println("owner name is not equal");
			}
		}
		return false;
		
		
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("invoke clone method");
		return super.clone();
	}

	
	
	
	
	
	

}
