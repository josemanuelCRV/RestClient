package com.test.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	private int id;
	private String firstName;
	
	
	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// standard getters and setters
}
