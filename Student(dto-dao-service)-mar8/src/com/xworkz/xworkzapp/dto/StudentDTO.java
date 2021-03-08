package com.xworkz.xworkzapp.dto;

public class StudentDTO {
	private String studentName;
	private String usn;
	private long mobileNo;
	private String email;
	private String address;
	private String branch;

	public StudentDTO(String studentName, String usn, long mobileNo, String email, String address, String branch) {
		super();
		this.studentName = studentName;
		this.usn = usn;
		this.mobileNo = mobileNo;
		this.email = email;
		this.address = address;
		this.branch = branch;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getUsn() {
		return usn;
	}

	public void setUsn(String usn) {
		this.usn = usn;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

}
