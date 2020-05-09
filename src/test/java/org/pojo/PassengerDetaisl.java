package org.pojo;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "name", "dob","address"})
public class PassengerDetaisl {
	
	private String name;
	private String dob;
	private Address address;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
