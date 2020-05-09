package org.pojo;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "mobileNo", "landlineNo"})
public class Phone {

	private long mobileNo;
	private String landlineNo;
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getLandlineNo() {
		return landlineNo;
	}
	public void setLandlineNo(String landlineNo) {
		this.landlineNo = landlineNo;
	}
}
