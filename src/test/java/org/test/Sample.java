package org.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.junit.Test;
import org.pojo.Address;
import org.pojo.Booking;
import org.pojo.Comunication;
import org.pojo.Email;
import org.pojo.PassengerDetaisl;
import org.pojo.PaymentDetials;
import org.pojo.Phone;
import org.pojo.Pnr;

public class Sample {
	@Test
	public void readXML() throws JAXBException {

		JAXBContext Context = JAXBContext.newInstance(Booking.class);
		Marshaller m = Context.createMarshaller();
		File loc = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\xml\\Create.xml");
		Booking b = new Booking();
		List<Pnr> pnr = new ArrayList<Pnr>();

		Pnr p1 = new Pnr();
		p1.setFlightNo("spijet1");
		p1.setFrom("covi");
		p1.setTo("madurai");
		p1.setFromDate("10-7-2020");
		p1.setToDate("22-7-2020");
		p1.setTripType("RoundTrip");
		
		PassengerDetaisl pd = new PassengerDetaisl();
		p1.setPassengerDetaisl(pd);
		pd.setName("Ragul.M");
		pd.setDob("12-11-1996");
			
		Address a = new Address();
		pd.setAddress(a);
		a.setStreetName("midile stret");
		a.setCityName("Thanjai");
		a.setDistrctName("Thiruvarur");
		a.setStateName("Tamilnadu");
		
		Comunication c = new Comunication();
		a.setComunicationDetails(c);

		Phone p = new Phone();
		c.setPhone(p);
		p.setMobileNo(12345689);
		p.setLandlineNo("123-5634567");

		Email e = new Email();
		c.setEmail(e);
		e.setOfficial("qwert@hexaware.in");
		e.setPersonal("123456@gmail.com");

		PaymentDetials py = new PaymentDetials();
		p1.setPaymentDetials(py);
		py.setCardHolderName("Ragul.M");
		py.setCardName("Visa");
		py.setCardNo("123456784567");
		py.setCvvNo(568);

		Pnr p2 = new Pnr();
		p2.setFlightNo("spijet1");
		p2.setFrom("covi");
		p2.setTo("madurai");
		p2.setFromDate("10-7-2020");
		p2.setToDate("22-7-2020");
		p2.setTripType("RoundTrip");
		
		PassengerDetaisl pd1 = new PassengerDetaisl();
		p2.setPassengerDetaisl(pd1);
		pd1.setName("Ragul.M");
		pd1.setDob("12-11-1996");
			
		Address a1 = new Address();
		pd1.setAddress(a1);
		a1.setStreetName("midile stret");
		a1.setCityName("Thanjai");
		a1.setDistrctName("Thiruvarur");
		a1.setStateName("Tamilnadu");
		
		Comunication c1 = new Comunication();
		a1.setComunicationDetails(c1);

		Phone ph1 = new Phone();
		c1.setPhone(ph1);
		ph1.setMobileNo(12345689);
		ph1.setLandlineNo("123-5634567");

		Email e1 = new Email();
		c1.setEmail(e1);
		e1.setOfficial("qwert@hexaware.in");
		e1.setPersonal("123456@gmail.com");

		PaymentDetials py1 = new PaymentDetials();
		p2.setPaymentDetials(py1);
		py1.setCardHolderName("Ragul.M");
		py1.setCardName("Visa");
		py1.setCardNo("123456784567");
		py1.setCvvNo(568);
		
		Pnr p3 = new Pnr();
		p3.setFlightNo("spijet1");
		p3.setFrom("covi");
		p3.setTo("madurai");
		p3.setFromDate("10-7-2020");
		p3.setToDate("22-7-2020");
		p3.setTripType("RoundTrip");
		
		PassengerDetaisl pd2 = new PassengerDetaisl();
		p3.setPassengerDetaisl(pd2);
		pd1.setName("Ragul.M");
		pd2.setDob("12-11-1996");
			
		Address a2 = new Address();
		pd2.setAddress(a2);
		a2.setStreetName("midile stret");
		a2.setCityName("Thanjai");
		a2.setDistrctName("Thiruvarur");
		a2.setStateName("Tamilnadu");
		
		Comunication c2 = new Comunication();
		a2.setComunicationDetails(c2);

		Phone ph2 = new Phone();
		c2.setPhone(ph2);
		ph2.setMobileNo(12345689);
		ph2.setLandlineNo("123-5634567");

		Email e2 = new Email();
		c2.setEmail(e2);
		e2.setOfficial("qwert@hexaware.in");
		e2.setPersonal("123456@gmail.com");

		PaymentDetials py2 = new PaymentDetials();
		p3.setPaymentDetials(py2);
		py2.setCardHolderName("Ragul.M");
		py2.setCardName("Visa");
		py2.setCardNo("123456784567");
		py2.setCvvNo(568);

		pnr.add(p1);
		pnr.add(p2);
		pnr.add(p3);
		
		b.setPnr(pnr);

		m.marshal(b, loc);
		System.out.println("**Cretared**");
	}
}