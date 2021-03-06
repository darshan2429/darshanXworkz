package com.xworkz.xworkzapp.exam;

public class Hallticket {
	

	private String name;
	private String usn;
	private String subjectCode;

	public Hallticket(String name, String usn, String subjectCode) {
		super();
		this.name = name;
		this.usn = usn;
		this.subjectCode=subjectCode;
	}

	public void displyInfo() {
		System.out.println(this.name);
		System.out.println(this.usn);
		System.out.println(this.subjectCode);

	}

	// TODO Auto-generated constructor stub
}
