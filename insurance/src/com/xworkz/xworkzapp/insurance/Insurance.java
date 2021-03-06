package com.xworkz.xworkzapp.insurance;

public class Insurance {

	public int insuranceId;
	public String type;

	public void security() {
		System.out.println("providing security for family");
	}

	@Override
	public int hashCode() {
		return this.insuranceId;
	}
	//this is inbuilt hashcode method
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return super.hashCode();
//	}

	@Override
	public String toString() {
		return "insurance - [ insuranceId = " + this.insuranceId + " , type =" + this.type + "  ]";
	}

	@Override
	public boolean equals(Object obj) {
		boolean check = false;
		if (obj instanceof Insurance) {
			if (obj != null) {
				System.out.println("inside instanceof");
				if (this.hashCode() == obj.hashCode()) {
					return true;
				}
			}
		}
		return check;
	}
}
