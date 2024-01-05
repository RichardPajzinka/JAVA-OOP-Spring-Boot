package com.java;

public class Customer {
	// state
	private String name;
	// object composition
	private Address homeAddress;
	private Address workAddress;

	// creating
	public Customer(String name, Address homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	// operation
	public String toString() {
		return String.format("Customer [%s] lives at [%s], works at [%s]", name, homeAddress, workAddress);
	}

}
