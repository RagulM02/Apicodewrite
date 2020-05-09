package org.pojo;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "cardName", "cardHolderName","cardNo","cvvNo" })

public class PaymentDetials {

	private String cardName;
	private String cardHolderName;
	private String cardNo;
	private double cvvNo;
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public double getCvvNo() {
		return cvvNo;
	}
	public void setCvvNo(double cvvNo) {
		this.cvvNo = cvvNo;
	}
	
}
