package com.xworkz.xworkzapp.dto;

public class TvDto {
	private int imeiNo;
	private String brandName;
	private double resolution;
	private String model;
	private int price;

	public TvDto(int imeiNo, String brandName, double resolution, String model, int price) {
		super();
		this.imeiNo = imeiNo;
		this.brandName = brandName;
		this.resolution = resolution;
		this.model = model;
		this.price = price;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getImeiNo() {
		return imeiNo;
	}

	public void setImeiNo(int imeiNo) {
		this.imeiNo = imeiNo;
	}

	public double getResolution() {
		return resolution;
	}

	public void setResolution(double resolution) {
		this.resolution = resolution;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
