package com.xworkz.wineshop.dto;

public class WineShop implements Cloneable{

	private String name;
	private int gstNo;
	private String location;

	public WineShop(String name, int gstNo, String location) {
		super();
		this.name = name;
		this.gstNo = gstNo;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public int getGstNo() {
		return gstNo;
	}

	public String getLocation() {
		return location;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGstNo(int gstNo) {
		this.gstNo = gstNo;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj==null)return false;
		if(obj instanceof WineShop){
			WineShop shop=(WineShop)obj;
			if(shop.name.equals(name)){
				System.out.println("name is equal");
				return true;
			}else{
				System.out.println("name is not equal");
			}
		}

		return false;
	}
	
	@Override
	public int hashCode() {
		return this.getGstNo();
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("invoked clone object");
		return super.clone();
	}

}
