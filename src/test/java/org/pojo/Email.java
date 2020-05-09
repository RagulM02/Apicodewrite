package org.pojo;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "personal", "official"})
public class Email {

	private String personal;
	private String official;

	public String getPersonal() {
		return personal;
	}

	public void setPersonal(String personal) {
		this.personal = personal;
	}

	public String getOfficial() {
		return official;
	}

	public void setOfficial(String official) {
		this.official = official;
	}

}
