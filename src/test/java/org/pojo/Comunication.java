package org.pojo;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "phone", "email"})
public class Comunication {
	private Phone phone;
	private Email email;

	
	
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	public Email getEmail() {
		return email;
	}
	public void setEmail(Email email) {
		this.email = email;
	}

}
