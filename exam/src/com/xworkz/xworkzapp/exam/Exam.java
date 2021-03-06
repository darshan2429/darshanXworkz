package com.xworkz.xworkzapp.exam;

//parent class or Base class or super class
public class Exam {

	public static String universityName = "VTU";
	private String examCode;
	// has a relationship
	private Hallticket ticket;
	private int fees;

	public void allow(Hallticket ticket) {
		System.out.println("inside exam");
		if (fees >= 1100) {
			if (ticket != null) {
				this.ticket = ticket;
				System.out.println("can attend the exam");
			} else {
				System.out.println("no hallticket");
			}
		} else {
			System.out.println("please pay the fees");
		}

	}

	public String getExamCode() {
		return examCode;
	}

	public void setExamCode(String examCode) {
		this.examCode = examCode;
	}

	public Hallticket getTicket() {
		return ticket;
	}

	public void setTicket(Hallticket ticket) {
		this.ticket = ticket;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

}
