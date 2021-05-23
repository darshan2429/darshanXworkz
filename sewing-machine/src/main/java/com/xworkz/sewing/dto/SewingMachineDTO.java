package com.xworkz.sewing.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sewing_machine")

public class SewingMachineDTO {

	@Column(name = "MACHINE_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int machineId;

	@Column(name = "NAME")
	private String name;

	@Column(name = "MODEL_NO")
	private String modelNo;

	@Column(name = "PRICE")
	private double price;

	

	public int getMachineId() {
		return machineId;
	}

	public void setMachineId(int machineId) {
		this.machineId = machineId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public SewingMachineDTO() {
		System.out.println("dto object is created");
	}

	

	public SewingMachineDTO( String name, String modelNo, double price) {
		this.name = name;
		this.modelNo = modelNo;
		this.price = price;
	}

	@Override
	public String toString() {
		return "SewingMachineDTO [machineId=" + machineId + ", name=" + name + ", modelNo=" + modelNo + ", price="
				+ price + "]";
	}

}
