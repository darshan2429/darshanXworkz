package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.exam.Exam;
import com.xworkz.xworkzapp.exam.Hallticket;
import com.xworkz.xworkzapp.exam.SupplimentaryExam;

public class ExanTester {
	public static void main(String[] args) {

		Exam exam = new Exam();
		exam.setExamCode("CS001");
		exam.setFees(1200);
		System.out.println(Exam.universityName + " " + exam.getExamCode());

		Hallticket hallticket = new Hallticket("darshan", "1bt16cs013", "15css");
//		hallticket.displyInfo();
		exam.allow(hallticket);

		Exam exam2 = new SupplimentaryExam();
		exam2.setFees(1100);
		exam2.allow(hallticket);

	}

}
