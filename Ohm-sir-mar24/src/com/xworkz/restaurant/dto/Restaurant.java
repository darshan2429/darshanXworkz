package com.xworkz.restaurant.dto;

public class Restaurant implements Cloneable {

	private String name;
	private String type;
	private int noOfTable;
	private boolean reservation;

	public Restaurant(String name, String type, int noOfTable, boolean reservation) {
		super();
		this.name = name;
		this.type = type;
		this.noOfTable = noOfTable;
		this.reservation = reservation;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getNoOfTable() {
		return noOfTable;
	}

	public boolean isReservation() {
		return reservation;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setNoOfTable(int noOfTable) {
		this.noOfTable = noOfTable;
	}

	public void setReservation(boolean reservation) {
		this.reservation = reservation;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof Restaurant) {
			Restaurant restaurant = (Restaurant) obj;
			if (restaurant.name.equals(name)) {
				System.out.println("name is equal");
				return true;
			} else {
				System.out.println("name is not equal");
			}
		}

		return false;

	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("invoked clone method");
		return super.clone();
	}
}
