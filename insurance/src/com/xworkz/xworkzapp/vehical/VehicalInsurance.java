package com.xworkz.xworkzapp.vehical;

public class VehicalInsurance {
	public String vehicalNo;
	public int insuranceID;
	public String type;
	
	
	public void security() {
		System.out.println("provide security for vehical");
	}

	@Override
	public int hashCode() {
		return this.insuranceID;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ vehicalNo = "+this.vehicalNo +" , InsuranceNo = "
				+this.insuranceID+",type= "+this.type +"]";
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean check=false;
		if(obj instanceof VehicalInsurance){
			if(obj !=null){
				System.out.println("inside obj class");
				if(this.hashCode()==obj.hashCode())
					return true;
			}
		}
		return check;
	}
}
