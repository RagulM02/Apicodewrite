package org.pojo;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "streetName", "cityName", "distrctName", "stateName","country", "comunicationDetails" })
public class Address {

	private String streetName;
	private String cityName;
	private String distrctName;
	private String stateName;
	private String country;
	private Comunication comunicationDetails;
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getDistrctName() {
		return distrctName;
	}
	public void setDistrctName(String distrctName) {
		this.distrctName = distrctName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Comunication getComunicationDetails() {
		return comunicationDetails;
	}
	public void setComunicationDetails(Comunication comunicationDetails) {
		this.comunicationDetails = comunicationDetails;
	}
	
	
	
	
	
}
