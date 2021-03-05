package com.xworkz.xworkzapp.dto;

public class LaptopDTO {
	private String brandName;
	private String modelName;
	private int price;
	private String colour;
	
	public LaptopDTO() {
		System.out.println("develop "+this.getClass().getSimpleName());
	}
	
	public String getBrandName() {
		return brandName;
	}
	
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}

	
	@Override
	public String toString() {
		return "LaptopDTO [brandName=" + brandName + ", modelName=" + modelName + ", price=" + price + ", colour="
				+ colour + "]";
	}
	
	
	

}
