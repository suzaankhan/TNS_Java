package com.assignment11;

public class SmartPhone extends Product {
	
	private float warranty;

	public SmartPhone(String id, String name, double price,float warranty ) {
		super(id, name, price);
		this.warranty = warranty;
	}

	public float getWarrannty() {
		return warranty;
	}

	public void setWarrannty(int warrannty) {
		this.warranty = warrannty;
	}

	@Override
	public String toString() {
		return "SmartPhone [warranty=" + warranty + "]" + super.toString();
	}

	
}
