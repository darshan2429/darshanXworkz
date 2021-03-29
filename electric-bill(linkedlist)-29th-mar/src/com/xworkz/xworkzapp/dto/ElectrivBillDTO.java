package com.xworkz.xworkzapp.dto;

public class ElectrivBillDTO {
	private int billNo;
	private int electricBillId;
	private int amount;
	private String zone;

	public ElectrivBillDTO(int billNo, int electricBillId, int amount, String zone) {
		super();
		this.billNo = billNo;
		this.electricBillId = electricBillId;
		this.amount = amount;
		this.zone = zone;
	}

	public int getBillNo() {
		return billNo;
	}

	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}

	public int getElectricBillId() {
		return electricBillId;
	}

	public void setElectricBillId(int electricBillId) {
		this.electricBillId = electricBillId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	@Override
	public String toString() {
		return "**************************\nbillNo=" + billNo + "\nelectricBillId=" + electricBillId + "\namount=" + amount
				+ "\nzone=" + zone + "\n*******************************";
	}
	
}
