package org.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Booking {
	private List<Pnr> pnr;

	public List<Pnr> getPnr() {
		return pnr;
	}

	public void setPnr(List<Pnr> pnr) {
		this.pnr = pnr;
	}
	
	

}
