package org.test;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;
import org.pojo.Booking;
import org.pojo.Pnr;

public class Runer {

	@Test
	public void readXML() throws JAXBException {

		JAXBContext Context = JAXBContext.newInstance(Booking.class);
		Unmarshaller un = Context.createUnmarshaller();
		File loc = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\xml\\Booking.xml");
		Object obj = un.unmarshal(loc);
		Booking book = (Booking) obj;
		List<Pnr> p = book.getPnr();
		// access single pnr
		Pnr pnr = p.get(2);
		String cardName = pnr.getPaymentDetials().getCardHolderName();
		System.out.println(cardName);
		// ittrate all single pnr
		for (Pnr x : p) {
			System.out.println("****booking details*****");
			System.out.println("from:" + x.getFrom());
			System.out.println("T0:" + x.getTo());
			System.out.println("TripType:" + x.getTripType());
			System.out.println("FromDate:" + x.getFromDate());
			System.out.println("ToDate:" + x.getToDate());
			System.out.println("FlightNo:" + x.getFlightNo());
			System.out.println("****passengerDetaisl***8");
			System.out.println("Name:" + x.getPassengerDetaisl().getName());
			System.out.println("Bob:" + x.getPassengerDetaisl().getDob());
			System.out.println("***address**");
			System.out.println("StreetName:" + x.getPassengerDetaisl().getAddress().getStreetName());
			System.out.println("CityName:" + x.getPassengerDetaisl().getAddress().getCityName());
			System.out.println("DistrctName:" + x.getPassengerDetaisl().getAddress().getDistrctName());
			System.out.println("StateName:" + x.getPassengerDetaisl().getAddress().getStateName());
			System.out.println("Country:" + x.getPassengerDetaisl().getAddress().getCountry());
			System.out.println("**********comunicationDetails******");
			System.out.println("mobileNo:"
					+ x.getPassengerDetaisl().getAddress().getComunicationDetails().getPhone().getMobileNo());
			System.out.println("landlineNo:"
					+ x.getPassengerDetaisl().getAddress().getComunicationDetails().getPhone().getLandlineNo());
			System.out.println("personal:"
					+ x.getPassengerDetaisl().getAddress().getComunicationDetails().getEmail().getPersonal());
			System.out.println("official:"
					+ x.getPassengerDetaisl().getAddress().getComunicationDetails().getEmail().getOfficial());
			System.out.println("***paymentDetials***");
			System.out.println("CardName" + x.getPaymentDetials().getCardName());
			System.out.println("CardHolderName" + x.getPaymentDetials().getCardHolderName());
			System.out.println("CardNo" + x.getPaymentDetials().getCardNo());
			System.out.println("CvvNo" + x.getPaymentDetials().getCvvNo());

		}

		/*
		 * String from = book.getFrom(); String name =
		 * book.getPassengerDetaisl().getName(); Assert.assertEquals("Veryfy the from",
		 * "Mannai", from); Assert.assertEquals("Veryfy the To", "Ragul", name);
		 * System.out.println("****booking details*****"); System.out.println("from:" +
		 * book.getFrom()); System.out.println("T0:" + book.getTo());
		 * System.out.println("TripType:" + book.getTripType());
		 * System.out.println("FromDate:" + book.getFromDate());
		 * System.out.println("ToDate:" + book.getToDate());
		 * System.out.println("FlightNo:" + book.getFlightNo());
		 * System.out.println("****passengerDetaisl***8"); System.out.println("Name:" +
		 * book.getPassengerDetaisl().getName()); System.out.println("Bob:" +
		 * book.getPassengerDetaisl().getDob()); System.out.println("***address**");
		 * System.out.println("StreetName:" +
		 * book.getPassengerDetaisl().getAddress().getStreetName());
		 * System.out.println("CityName:" +
		 * book.getPassengerDetaisl().getAddress().getCityName());
		 * System.out.println("DistrctName:" +
		 * book.getPassengerDetaisl().getAddress().getDistrctName());
		 * System.out.println("StateName:" +
		 * book.getPassengerDetaisl().getAddress().getStateName());
		 * System.out.println("Country:" +
		 * book.getPassengerDetaisl().getAddress().getCountry());
		 * System.out.println("**********comunicationDetails******");
		 * System.out.println("mobileNo:" +
		 * book.getPassengerDetaisl().getAddress().getComunicationDetails().getPhone().
		 * getMobileNo()); System.out.println("landlineNo:" +
		 * book.getPassengerDetaisl().getAddress().getComunicationDetails().getPhone().
		 * getLandlineNo()); System.out.println("personal:" +
		 * book.getPassengerDetaisl().getAddress().getComunicationDetails().getEmail().
		 * getPersonal()); System.out.println("official:" +
		 * book.getPassengerDetaisl().getAddress().getComunicationDetails().getEmail().
		 * getOfficial()); System.out.println("***paymentDetials***");
		 * System.out.println("CardName" + book.getPaymentDetials().getCardName());
		 * System.out.println("CardHolderName" +
		 * book.getPaymentDetials().getCardHolderName()); System.out.println("CardNo" +
		 * book.getPaymentDetials().getCardNo()); System.out.println("CvvNo" +
		 * book.getPaymentDetials().getCvvNo());
		 */

	}

}
