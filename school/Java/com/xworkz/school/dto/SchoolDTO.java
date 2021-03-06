package com.xworkz.school.dto;

public class SchoolDTO {

	private String nameOfTheSchool;
	private int noOfStudents;
	private String addressOfTheSchool;

	public SchoolDTO() {

	}

	/**
	 * @param nameOfTheSchool
	 * @param noOfStudents
	 * @param addressOfTheSchool
	 */
	public SchoolDTO(String nameOfTheSchool, int noOfStudents, String addressOfTheSchool) {
		super();
		this.nameOfTheSchool = nameOfTheSchool;
		this.noOfStudents = noOfStudents;
		this.addressOfTheSchool = addressOfTheSchool;
	}

	/**
	 * @return the nameOfTheSchool
	 */
	public String getNameOfTheSchool() {
		return nameOfTheSchool;
	}

	/**
	 * @param nameOfTheSchool
	 *            the nameOfTheSchool to set
	 */
	public void setNameOfTheSchool(String nameOfTheSchool) {
		this.nameOfTheSchool = nameOfTheSchool;
	}

	/**
	 * @return the noOfStudents
	 */
	public int getNoOfStudents() {
		return noOfStudents;
	}

	/**
	 * @param noOfStudents
	 *            the noOfStudents to set
	 */
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	/**
	 * @return the addressOfTheSchool
	 */
	public String getAddressOfTheSchool() {
		return addressOfTheSchool;
	}

	/**
	 * @param addressOfTheSchool
	 *            the addressOfTheSchool to set
	 */
	public void setAddressOfTheSchool(String addressOfTheSchool) {
		this.addressOfTheSchool = addressOfTheSchool;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SchoolDTO [nameOfTheSchool=" + nameOfTheSchool + ", noOfStudents=" + noOfStudents
				+ ", addressOfTheSchool=" + addressOfTheSchool + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals method");
		if (obj == null) {
			System.out.println("Object is Null");
		}

		if (obj instanceof SchoolDTO) {
			SchoolDTO casted = (SchoolDTO) obj;
			if (this.nameOfTheSchool != null && this.nameOfTheSchool.equals(casted.getNameOfTheSchool())) {
				return true;
			}
		}

		return false;
	}

}
