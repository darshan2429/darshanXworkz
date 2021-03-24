package com.xworkz.name.dto;

public class NameDTO implements Cloneable {

	private String firstName;
	private String middleName;
	private String lastName;
	private String surName;
	private String nickName;

	public NameDTO() {
		System.out.println("namedto object is created");
	}

	public NameDTO(String firstName, String middleName, String lastName, String surName, String nickName) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.surName = surName;
		this.nickName = nickName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSurName() {
		return surName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("override equals method");
		if (obj == null)
			return false;
		if (obj instanceof NameDTO) {
			NameDTO name = (NameDTO) obj;
			if (name.firstName.equals(firstName)) {
				System.out.println("name is equal");
				return true;
			} else {
				System.out.println("name is not equal");
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("clone method is invoked");
		return super.clone();
	}

}
