package org.pojo;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "from", "to", "tripType", "fromDate", "toDate", "flightNo", "passengerDetaisl",
		"paymentDetials" })
public class Pnr {

	private String from;
	private String to;
	private String tripType;
	private String fromDate;
	private String toDate;
	private String flightNo;
	private PassengerDetaisl passengerDetaisl;
	private PaymentDetials paymentDetials;

	public PassengerDetaisl getPassengerDetaisl() {
		return passengerDetaisl;
	}

	public void setPassengerDetaisl(PassengerDetaisl passengerDetaisl) {
		this.passengerDetaisl = passengerDetaisl;
	}

	public PaymentDetials getPaymentDetials() {
		return paymentDetials;
	}

	public void setPaymentDetials(PaymentDetials paymentDetials) {
		this.paymentDetials = paymentDetials;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTripType() {
		return tripType;
	}

	public void setTripType(String tripType) {
		this.tripType = tripType;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

}
