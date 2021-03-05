package com.xworkz.xworkzapp.bank;

public class ATM {
	
	private int atmNo;
	private String address;
	private String type;
	private String bankName;
	/**
	 * @return the atmNo
	 */
	public int getAtmNo() {
		return atmNo;
	}
	/**
	 * @param atmNo the atmNo to set
	 */
	public void setAtmNo(int atmNo) {
		this.atmNo = atmNo;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}
	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public void atmWithdrawal(){
		System.out.println("withdrawal successfull");
	}
	public void accStatement(){
		System.out.println("account Statement");
	}
}
