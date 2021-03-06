package com.xworkz.xworkzapp.city;

import com.xworkz.xworkzapp.constant.WardName;

public class CityWardDTO {

	private int wardNo;
	private WardName wardName;
	private String corporatorName;
	private long papulation;
	private String area;

	public int getWardNo() {
		return wardNo;
	}

	public void setWardNo(int wardNo) {
		this.wardNo = wardNo;
	}

	public WardName getWardName() {
		return wardName;
	}

	public void setWardName(WardName wardName) {
		this.wardName = wardName;
	}

	public String getCorporateName() {
		return corporatorName;
	}

	public void setCorporateName(String corporatorName) {
		this.corporatorName = corporatorName;
	}

	public long getPapulation() {
		return papulation;
	}

	public void setPapulation(long papulation) {
		this.papulation = papulation;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

}
