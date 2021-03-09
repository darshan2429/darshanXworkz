package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.HospitalDTO;
import com.xworkz.xworkzapp.service.HospitalServiceImpl;

public class HospitalTester {
	public static void main(String[] args) {
		HospitalDTO dto=new HospitalDTO("123abcde", "darshan", "Bengaluru", "alishake", "multispeciality", "8989898989");
		HospitalDTO dto1=new HospitalDTO("1235adcs", "santosh", "mangalore", "appaiya", "kednys", "8855885588");
		HospitalDTO dto2=new HospitalDTO("2345fggs", "teertha", "shivamogga", "punith", "heartat", "6363636363");
		HospitalServiceImpl impl=new HospitalServiceImpl();
		impl.validatetoadddata(dto);
		impl.validatetoadddata(dto1);
		impl.validatetoadddata(dto2);
		
		impl.display();
		
//		impl.validateTodisplay("2345fggs", "punith");
		
		impl.validateToupdateUsing("2345fggs", "9999999998");
		
		impl.display();
		
		impl.validateTodeleteUsing("2345fggs");
		
		impl.display();
				
		
	}

}
